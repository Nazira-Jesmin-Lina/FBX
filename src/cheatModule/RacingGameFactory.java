package cheatModule;

public class RacingGameFactory implements GameFactory{
    @Override
    public Game createGame(String title, String developer) {
        return new RacingGame(title, developer);

    }
}
