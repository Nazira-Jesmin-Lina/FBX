import cheatModule.*;
import scoringModule.ScoringSystem;
import statusModule.CloudAccount;
import statusModule.PlayerStatusUpdateCommand;
import statusModule.RetrievePlayerStatusCommand;
import statusModule.UpdatePlayerStatusCommand;
import uxModule.ScoreProvider;
import uxModule.Scoreboard;
import uxModule.ScoringSystemAdapter;
import uxModule.UserManager;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {


        Game actionGame ;
        Game racingGame ;
        Game strategyGame ;

        UserManager userManager = new UserManager();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Main Menu");
            System.out.println("1. Sign Up");
            System.out.println("2. Log In");
            System.out.println("3. Log Out");
            System.out.println("4. Show Scores");
            System.out.println("5. Cheat Code Demo");
            System.out.println("6. Action Game Demo");
            System.out.println("7. Racing Game Demo");
            System.out.println("8. Strategy Game Demo");
            System.out.println("9. Update Player Status");
            System.out.println("10. Exit");

            System.out.print("Select an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter your username: ");
                    String signUpUsername = scanner.nextLine();
                    System.out.print("Enter your password: ");
                    String signUpPassword = scanner.nextLine();
                    System.out.println("\n-----------------------------------\n");
                    userManager.signUp(signUpUsername, signUpPassword);
                    System.out.println("\n-----------------------------------\n");

                    break;

                case 2:
                    if (!userManager.isLoggedIn()) {
                        System.out.print("Enter your username: ");
                        String loginUsername = scanner.nextLine();
                        System.out.print("Enter your password: ");
                        String loginPassword = scanner.nextLine();
                        System.out.println("\n-----------------------------------\n");
                        userManager.login(loginUsername, loginPassword);
                        System.out.println("\n-----------------------------------\n");

                    } else {
                        System.out.println("\n-----------------------------------\n");
                        System.out.println("You are already logged in.");
                        System.out.println("\n-----------------------------------\n");

                    }
                    break;

                case 3:
                    if (userManager.isLoggedIn()) {
                        System.out.println("\n-----------------------------------\n");

                        userManager.logout();
                        System.out.println("\n-----------------------------------\n");

                    } else {
                        System.out.println("\n-----------------------------------\n");

                        System.out.println("You are not logged in.");
                        System.out.println("\n-----------------------------------\n");

                    }
                    break;

                case 4:
                    // Create an instance of ScoringSystem using Singleton pattern
                    ScoringSystem scoringSystem = ScoringSystem.getInstance();

                    // Calculate single-person scores
                    scoringSystem.calculateSinglePersonScore("Player1", 100);
                    scoringSystem.calculateSinglePersonScore("Player2", 80);

                    // Calculate team-based scores
                    int[] team1Scores = {100, 80, 90};
                    scoringSystem.calculateTeamScore("TeamA", team1Scores);

                    // Create a ScoringSystemAdapter to use with Scoreboard
                    ScoreProvider scoreProvider = new ScoringSystemAdapter(scoringSystem);

                    // Create a Scoreboard with the adapted ScoringSystem
                    Scoreboard scoreboard = new Scoreboard(scoreProvider);

                    // Show scores using the Scoreboard
                    System.out.println("\n-----------------------------------\n");
                    scoreboard.showScores();
                    System.out.println("\n-----------------------------------\n");
                    break;
                case 5:

                    System.out.println("\n------------Cheat Code Demo-----------\n");
                    // Example usage of cheat codes for different game types
                    actionGame = new ActionGame("ActionGame1", "GameDev1");
                    racingGame = new RacingGame("RacingGame1", "GameDev2");
                    strategyGame = new StrategyGame("StrategyGame1", "GameDev3");

                    // Applying cheat codes
                    actionGame.applyCheatCode("godmode");
                    racingGame.applyCheatCode("turbo");
                    strategyGame.applyCheatCode("resources");
                    System.out.println("\n-----------------------------------\n");
                    break;
                case 6:
                    // Create an ActionGame using the factory
                    GameFactory actionGameFactory = new ActionGameFactory();
                    actionGame = actionGameFactory.createGame("ActionGame1", "Developer1");

                    // Play the game
                    actionGame.play();

                    // Apply cheat code
                    actionGame.applyCheatCode("godmode");
                    break;

                case 7:
                    GameFactory racingGameFactory = new RacingGameFactory();
                    racingGame = racingGameFactory.createGame("RacingGame1", "Developer2");

                    // Play the game
                    racingGame.play();

                    // Apply cheat code
                    racingGame.applyCheatCode("turbo");
                    break;
                case 8:
                    // Create a StrategyGame using the factory
                    GameFactory strategyGameFactory = new StrategyGameFactory();
                    strategyGame = strategyGameFactory.createGame("StrategyGame1", "Developer3");

                    // Play the game
                    strategyGame.play();

                    // Apply cheat code
                    strategyGame.applyCheatCode("resources");
                    break;
                case 9:
                    CloudAccount cloudAccount = new CloudAccount();

                    // Create and execute update and retrieve player status commands
                    PlayerStatusUpdateCommand updateCommand = new UpdatePlayerStatusCommand(cloudAccount, "Player123", "Online");
                    PlayerStatusUpdateCommand retrieveCommand = new RetrievePlayerStatusCommand(cloudAccount, "Player123");

                    cloudAccount.executeCommand(updateCommand);
                    cloudAccount.executeCommand(retrieveCommand);
                    break;
                case 10:
                    System.out.println("Exiting the program.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("\nInvalid option. Please choose a valid option.");
            }
        }
    }
}

