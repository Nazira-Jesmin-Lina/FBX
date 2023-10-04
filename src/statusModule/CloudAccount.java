package statusModule;

import java.util.HashMap;
import java.util.Map;

public class CloudAccount {
    private Map<String, String> playerStatusMap = new HashMap<>();

    public void updatePlayerStatus(String playerId, String newStatus) {
        // Update the player's status in the cloud account
        playerStatusMap.put(playerId, newStatus);
        System.out.println("Player " + playerId + " status updated to: " + newStatus);
    }

    public String getPlayerStatus(String playerId) {
        // Retrieve a player's status from the cloud account
        return playerStatusMap.get(playerId);
    }

    // Command execution method
    public void executeCommand(PlayerStatusUpdateCommand command) {
        command.execute();
    }
}

//public class Main {
//    public static void main(String[] args) {
//        statusModule.CloudAccount cloudAccount = new statusModule.CloudAccount();
//
//        // Simulate updating a player's status
//        String playerId = "Player123";
//        String newStatus = "Online";
//        cloudAccount.updatePlayerStatus(playerId, newStatus);
//
//        // Retrieve and display the player's status
//        String retrievedStatus = cloudAccount.getPlayerStatus(playerId);
//        System.out.println("Player " + playerId + " status: " + retrievedStatus);
//    }
//}
