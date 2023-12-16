package tictactoe.winningstrategies;

import tictactoe.models.Board;
import tictactoe.models.Move;

public class RowWinningStrategy implements WinningStrategy{
    @Override
    public boolean checkWinner(Board board, Move move) {
        return false;
    }
}
