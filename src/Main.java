import cheatModule.ActionGame;
import cheatModule.Game;
import cheatModule.RacingGame;
import cheatModule.StrategyGame;

public class Main {
    public static void main(String[] args) {

        // Example usage of cheat codes for different game types
        Game actionGame = new ActionGame("ActionGame1", "GameDev1");
        Game racingGame = new RacingGame("RacingGame1", "GameDev2");
        Game strategyGame = new StrategyGame("StrategyGame1", "GameDev3");

        // Applying cheat codes
        actionGame.applyCheatCode("godmode");
        racingGame.applyCheatCode("turbo");
        strategyGame.applyCheatCode("resources");
    }
}