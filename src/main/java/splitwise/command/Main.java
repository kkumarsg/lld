package splitwise.command;

import splitwise.controller.UserController;
import splitwise.repositories.GroupRepository;
import splitwise.repositories.UserExpenseRepository;
import splitwise.services.UserService;
import splitwise.strategy.HeapSettleStrategy;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        CommandExecutor ce = new CommandExecutor(
                new SettleUpUserCommand(
                        new UserController(new UserService(
                                new GroupRepository(),
                                new UserExpenseRepository(),
                                new HeapSettleStrategy()
                        ))));

        while(true){
            String input = scanner.next();
            // input -> chaitanya goaTrip settleUser
            ce.execute(input);
        }
    }
}
