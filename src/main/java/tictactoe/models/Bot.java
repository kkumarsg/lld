package tictactoe.models;

import tictactoe.botplayingstrategy.BotPlayingStrategy;
import tictactoe.botplayingstrategy.BotPlayingStrategyFactory;

public class Bot extends Player{

    private BotDifficultyLevel botDifficultyLevel;
    private BotPlayingStrategy botPlayingStrategy;

    public Bot(char symbol, String name, int id, PlayerType playerType, BotDifficultyLevel botDifficultyLevel) {
        super(symbol, name, id, playerType);
        this.botDifficultyLevel = botDifficultyLevel;
        this.botPlayingStrategy =
                BotPlayingStrategyFactory.getBotPlayingStrategyForDifficultyLevel(botDifficultyLevel);
    }
}
