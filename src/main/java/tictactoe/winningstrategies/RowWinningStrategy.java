package tictactoe.winningstrategies;

import tictactoe.models.Board;
import tictactoe.models.Move;

import java.util.HashMap;
import java.util.Map;

public class RowWinningStrategy implements WinningStrategy{

    Map<Integer, Map<Character, Integer>> map = new HashMap<>();

    @Override
    public boolean checkWinner(Board board, Move move) {

        int row = move.getCell().getRow();
        char symbol = move.getPlayer().getSymbol();

        // check if current row is present in the map
        if(!map.containsKey(row)){
            map.put(row, new HashMap<>());
        }

        Map<Character, Integer> rowMap = map.get(row);

        // first time entry for the symbol
        if(!rowMap.containsKey(symbol)){
            rowMap.put(symbol, 0);
        }

        // update the symbol count for rowMap
        rowMap.put(symbol, rowMap.get(symbol)+1);

        // check if the symbol count has reached the size of the board.
        if(board.getBoard().size()==(rowMap.get(symbol))){
            System.out.println("winning via "+row);
            return true;
        }

        return false;
    }

    @Override
    public void undo(Board board, Move lastMove) {

        int row = lastMove.getCell().getRow();
        char symbol = lastMove.getPlayer().getSymbol();

        Map<Character, Integer> rowMap = map.get(row);
        rowMap.put(symbol, rowMap.get(symbol)-1);

    }





}
