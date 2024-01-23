package splitwise.runner;

import splitwise.controller.UserController;
import splitwise.dtos.Transaction;
import splitwise.models.*;
import splitwise.repositories.ExpenseRepository;
import splitwise.repositories.GroupRepository;
import splitwise.repositories.UserExpenseRepository;
import splitwise.repositories.UserRepository;
import splitwise.services.UserService;
import splitwise.strategy.HeapSettleStrategy;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {

        // 1. Create users
        User chaitanya = new User("chaitanya", "1234", "4321");
        User amit = new User("amit", "1234", "4321");
        User sundar = new User("sundar", "1234", "4321");
        User ramesh = new User("ramesh", "1234", "4321");

        List<User> goaGuys = new ArrayList<>();
        goaGuys.add(chaitanya);
        goaGuys.add(amit);
        goaGuys.add(sundar);
        goaGuys.add(ramesh);

        // 2. create the group and add these users to the group
        Group goaTrip = new Group("GOA-TRIP");
        goaTrip.setUsers(goaGuys);

        // They went for goa. Go for Dinner
        // 3. create expenses
        Expense dinnerExpense = new Expense("Dinner", 5000, ExpenseType.REGULAR);

        // 4. add the expense share of everyone
        UserExpense chaitanyaShare
                = new UserExpense(chaitanya, dinnerExpense, 1000, UserExpenseType.HAD_TO_PAY);

        UserExpense amitShare
                = new UserExpense(amit, dinnerExpense, 1000, UserExpenseType.HAD_TO_PAY);

        UserExpense sundarShare
                = new UserExpense(sundar, dinnerExpense, 1000, UserExpenseType.HAD_TO_PAY);

        UserExpense rameshShare
                = new UserExpense(ramesh, dinnerExpense, 2000, UserExpenseType.HAD_TO_PAY);

        // 5. Capture who paid what
        UserExpense paidByChaitanya
                = new UserExpense(chaitanya, dinnerExpense, 5000, UserExpenseType.PAID_BY);

        // Manually add all these details to the database/repositories.
        UserRepository userRepository = new UserRepository();
        GroupRepository groupRepository = new GroupRepository();
        UserExpenseRepository userExpenseRepository = new UserExpenseRepository();
        ExpenseRepository expenseRepository = new ExpenseRepository();

        userRepository.setUsers(goaGuys);
        goaTrip.getExpenses().add(dinnerExpense);
        groupRepository.getGroups().add(goaTrip);
        expenseRepository.getExpenses().add(dinnerExpense);

        userExpenseRepository.getUserExpenses().add(chaitanyaShare);
        userExpenseRepository.getUserExpenses().add(amitShare);
        userExpenseRepository.getUserExpenses().add(sundarShare);
        userExpenseRepository.getUserExpenses().add(rameshShare);

        userExpenseRepository.getUserExpenses().add(paidByChaitanya);

        UserController userController = new UserController(
                new UserService(groupRepository, userExpenseRepository, new HeapSettleStrategy()));

        List<Transaction> userTransactions = userController.settleUser("chaitanya", "GOA-TRIP");

        for(Transaction transaction: userTransactions){
            System.out.println(transaction.getFrom()+" -> "
                    +transaction.getTo()+" : "+transaction.getAmount());
        }

        /*
        Expected :
            Amit -> Chaitanya : 1000
            Sundar -> Chaitanya : 1000
            Ramesh -> Chaitanya : 2000
         */


    }
}
