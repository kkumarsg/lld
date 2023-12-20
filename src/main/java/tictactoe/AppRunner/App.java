package tictactoe.AppRunner;

import tictactoe.controller.GameController;
import tictactoe.exception.DuplicateSymbolException;
import tictactoe.exception.MoreThanOneBotException;
import tictactoe.exception.PlayersCountMismatchException;
import tictactoe.models.*;
import tictactoe.winningstrategies.ColWinningStrategy;
import tictactoe.winningstrategies.DiagonalWinningStrategy;
import tictactoe.winningstrategies.RowWinningStrategy;
import tictactoe.winningstrategies.WinningStrategy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws DuplicateSymbolException, PlayersCountMismatchException, MoreThanOneBotException {
        GameController gameController = new GameController();
        Scanner scanner = new Scanner(System.in);

        int dimension = 3;
        List<Player> playerList = new ArrayList<>();
        List<WinningStrategy> winningStrategies = new ArrayList<>();

        playerList.add(new Player('X', "Keerthi", 1, PlayerType.HUMAN));
        playerList.add(new Bot('0', "GPT", 2, PlayerType.BOT, BotDifficultyLevel.EASY));

        winningStrategies.add(new RowWinningStrategy());
        winningStrategies.add(new ColWinningStrategy());
        winningStrategies.add(new DiagonalWinningStrategy());

        Game game = gameController.startGame(dimension, playerList, winningStrategies);

        while(game.getGameState().equals(GameState.IN_PROG)){

            /*
                1. print board
                2. do you want to undo
                3. make move?
             */
            game.printBoard();

            System.out.println("Does anyone want to undo? (y/n)");

            String undo = scanner.next();

            if(undo.equalsIgnoreCase("y")){
                gameController.undo(game);
                continue;
            }

            gameController.makeMove(game);
        }

        // If I'm here, it means game is not in progress anymore
        if(GameState.SUCCESS.equals(game.getGameState())){
            System.out.println(game.getWinner().getName()+", Congrats! You won the Game :)");
        }
        if(GameState.DRAW.equals(game.getGameState())){
            System.out.println("Match tied :| ");
        }
    }
}
