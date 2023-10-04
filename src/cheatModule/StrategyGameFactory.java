package cheatModule;

public class StrategyGameFactory implements GameFactory {
    @Override
    public Game createGame(String title, String developer) {
        return new StrategyGame(title, developer);

    }
}
