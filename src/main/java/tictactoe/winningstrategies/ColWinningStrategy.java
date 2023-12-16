package tictactoe.winningstrategies;

import tictactoe.models.Board;
import tictactoe.models.Move;

public class ColWinningStrategy implements WinningStrategy{
    @Override
    public boolean checkWinner(Board board, Move move) {
        return false;
    }
}
