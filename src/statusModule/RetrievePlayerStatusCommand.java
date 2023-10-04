package statusModule;

public class RetrievePlayerStatusCommand implements PlayerStatusUpdateCommand{
    private final CloudAccount cloudAccount;
    private final String playerId;

    public RetrievePlayerStatusCommand(CloudAccount cloudAccount, String playerId) {
        this.cloudAccount = cloudAccount;
        this.playerId = playerId;
    }

    @Override
    public void execute() {
        // Retrieve and display the player's status
        String retrievedStatus = cloudAccount.getPlayerStatus(playerId);
        System.out.println("Player " + playerId + " status: " + retrievedStatus);
    }
}
