package cheatModule;

// Racing game implementation
public class RacingGame extends Game {
    public RacingGame(String title, String developer) {
        super(title, "Racing", developer);
    }

    @Override
    public void play() {
        // Implement logic specific to racing games
        System.out.println("Playing racing game: " + getTitle());
    }

    @Override
    public void applyCheatCode(String cheatCode) {
        if (cheatCode.equals("turbo")) {
            // Implement the cheat code logic for racing games (e.g., super speed)
            System.out.println("Cheat code 'turbo' applied for " + getTitle());
        } else {
            System.out.println("Invalid cheat code for " + getTitle());
        }
    }
}