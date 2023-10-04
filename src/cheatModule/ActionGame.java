package cheatModule;

// Action game implementation
public class ActionGame extends Game {
    public ActionGame(String title, String developer) {
        super(title, "Action", developer);
    }

    @Override
    public void play() {
        System.out.println("Playing action game: " + getTitle());
    }

    @Override
    public void applyCheatCode(String cheatCode) {
        if (cheatCode.equals("godmode")) {
            System.out.println("Cheat code 'godmode' applied for " + getTitle());
        } else {
            System.out.println("Invalid cheat code for " + getTitle());
        }
    }
}