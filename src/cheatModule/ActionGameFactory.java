package cheatModule;

public class ActionGameFactory implements GameFactory{
    @Override
    public Game createGame(String title, String developer) {
        return new ActionGame(title, developer);

    }
}
