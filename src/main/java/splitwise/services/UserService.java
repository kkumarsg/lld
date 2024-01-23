package splitwise.services;

import splitwise.dtos.Transaction;
import splitwise.models.*;
import splitwise.repositories.GroupRepository;
import splitwise.repositories.UserExpenseRepository;
import splitwise.strategy.SettleupStrategy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserService {

    private GroupRepository groupRepository;
    private UserExpenseRepository userExpenseRepository;
    private SettleupStrategy settleupStrategy;

    public UserService(GroupRepository groupRepository, UserExpenseRepository userExpenseRepository, SettleupStrategy settleupStrategy) {
        this.groupRepository = groupRepository;
        this.userExpenseRepository = userExpenseRepository;
        this.settleupStrategy = settleupStrategy;
    }

    public List<Transaction> settleUser(String userName, String groupName) {


        /*
               1. Get all expenses of a group
               2. Filter only regular expenses -> expenses
               3. For every expense -> find userExpenses (list)
               4. We iterate over all the userExpenses
                  Calculate the extra amount for every user

                  Map of extra amount -> Map<User, Integer>
                     Data : [A:2000, B:-1000]
                  If the type of userExpense is paidBy, extra_amount += amount;
                                                WhoHadToPay, extra_amount -= amount;
               5. Pass this map to another class, which will use heaps and gets me the
                  transactions list.
         */

        Map<User, Integer> extraAmountMap = new HashMap<>();

        List<Expense> expenses = groupRepository.findExpensesByGroup(groupName);

        for(Expense expense: expenses){
            if(expense.getExpenseType() == ExpenseType.REGULAR){
                List<UserExpense> userExpenseList =
                        userExpenseRepository.findUserExpensesByExpense(expense.getDescription());
                for(UserExpense userExpense: userExpenseList){
                    User user = userExpense.getUser();
                    if (!extraAmountMap.containsKey(user)) {
                        extraAmountMap.put(user, 0);
                    }

                    Integer amount = extraAmountMap.get(user);
                    if (userExpense.getUserExpenseType()== UserExpenseType.PAID_BY) {
                        amount += userExpense.getAmount();
                    }
                    else{
                        amount -= userExpense.getAmount();
                    }

                    extraAmountMap.put(user, amount);
                }
            }
        }

        // finding the transactions using extra amount for every user.

        List<Transaction> groupTransactions = settleupStrategy.settleUpUsers(extraAmountMap);

        List<Transaction> userTransactions = new ArrayList<>();

        for(Transaction transaction: groupTransactions){
            if(transaction.getFrom().equals(userName) ||
                    transaction.getTo().equals(userName)){
                userTransactions.add(transaction);
            }
        }

        return userTransactions;
    }














}
