package cheatModule;

// Action game implementation
public class ActionGame extends Game {
    public ActionGame(String title, String developer) {
        super(title, "Action", developer);
    }

    @Override
    public void play() {
        // Implement logic specific to action games
        System.out.println("Playing action game: " + getTitle());
    }

    @Override
    public void applyCheatCode(String cheatCode) {
        if (cheatCode.equals("godmode")) {
            // Implement the cheat code logic for action games (e.g., invincibility)
            System.out.println("Cheat code 'godmode' applied for " + getTitle());
        } else {
            System.out.println("Invalid cheat code for " + getTitle());
        }
    }
}