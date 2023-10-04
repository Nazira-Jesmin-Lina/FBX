package cheatModule;

// Strategy game implementation
public class StrategyGame extends Game {
    public StrategyGame(String title, String developer) {
        super(title, "Strategy", developer);
    }

    @Override
    public void play() {
        // Implement logic specific to strategy games
        System.out.println("Playing strategy game: " + getTitle());
    }

    @Override
    public void applyCheatCode(String cheatCode) {
        if (cheatCode.equals("resources")) {
            // Implement the cheat code logic for strategy games (e.g., extra resources)
            System.out.println("Cheat code 'resources' applied for " + getTitle());
        } else {
            System.out.println("Invalid cheat code for " + getTitle());
        }
    }
}