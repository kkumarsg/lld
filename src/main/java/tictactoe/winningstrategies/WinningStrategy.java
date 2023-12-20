package tictactoe.winningstrategies;

import tictactoe.models.Board;
import tictactoe.models.Move;

public interface WinningStrategy {

    boolean checkWinner(Board board, Move move);

    void undo(Board board, Move lastMove);
}
