package cheatModule;

// Racing game implementation
public class RacingGame extends Game {
    public RacingGame(String title, String developer) {
        super(title, "Racing", developer);
    }

    @Override
    public void play() {
        System.out.println("Playing racing game: " + getTitle());
    }

    @Override
    public void applyCheatCode(String cheatCode) {
        if (cheatCode.equals("turbo")) {
            System.out.println("Cheat code 'turbo' applied for " + getTitle());
        } else {
            System.out.println("Invalid cheat code for " + getTitle());
        }
    }
}