package tictactoe.botplayingstrategy;

import tictactoe.models.Board;
import tictactoe.models.Cell;

public interface BotPlayingStrategy {

    Cell makeMove(Board board);
}
