package splitwise.command;

import splitwise.controller.UserController;
import splitwise.dtos.Transaction;

import java.util.List;

// similarly we can add other commands also.
public class SettleUpUserCommand implements Command{

    private UserController userController;
    public static final String SETTLEUP_USER = "settleUser";

    public SettleUpUserCommand(UserController userController) {
        this.userController = userController;
    }

    @Override
    public void execute(String input) {
        // input -> chaitanya goaTrip settleUser
        List<String> words = List.of(input.split(" "));
        List<Transaction> transactions = userController.settleUser(words.get(0), words.get(1));

        // print the transactions here and verify
    }

    @Override
    public boolean matches(String input) {
        // input -> chaitanya goaTrip settleUser
        List<String> words = List.of(input.split(" "));
        return words.get(2).equals(SETTLEUP_USER);
    }
}
