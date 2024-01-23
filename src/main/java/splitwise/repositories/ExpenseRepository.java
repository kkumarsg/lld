package splitwise.repositories;

import splitwise.models.Expense;
import splitwise.models.UserExpense;

import java.util.ArrayList;
import java.util.List;

public class ExpenseRepository {

    private List<Expense> expenses = new ArrayList<>();

    public List<Expense> getExpenses() {
        return expenses;
    }

    public void setExpenses(List<Expense> expenses) {
        this.expenses = expenses;
    }

}
