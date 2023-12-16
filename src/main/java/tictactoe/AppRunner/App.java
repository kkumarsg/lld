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

public class App {

    public static void main(String[] args) throws DuplicateSymbolException, PlayersCountMismatchException, MoreThanOneBotException {
        GameController gameController = new GameController();

        int dimension = 3;
        List<Player> playerList = new ArrayList<>();
        List<WinningStrategy> winningStrategies = new ArrayList<>();

        playerList.add(new Player('X', "Keerthi", 1, PlayerType.HUMAN));
        playerList.add(new Bot('0', "GPT", 2, PlayerType.BOT, BotDifficultyLevel.EASY));

        winningStrategies.add(new RowWinningStrategy());
        winningStrategies.add(new ColWinningStrategy());
        winningStrategies.add(new DiagonalWinningStrategy());

        Game game = gameController.startGame(dimension, playerList, winningStrategies);
        game.printBoard();
    }
}
