package cheatModule;

// Common base class for all game types
public abstract class Game {
    private String title;
    private String genre;
    private String developer;

    public Game(String title, String genre, String developer) {
        this.title = title;
        this.genre = genre;
        this.developer = developer;
    }

    // Method to apply cheat codes
    public abstract void applyCheatCode(String cheatCode);
    public abstract void play();  // Abstract method to start the game

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public String getDeveloper() {
        return developer;
    }


}