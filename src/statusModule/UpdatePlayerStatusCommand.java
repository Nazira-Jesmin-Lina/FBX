package statusModule;

public class UpdatePlayerStatusCommand implements PlayerStatusUpdateCommand{

        private final CloudAccount cloudAccount;
        private final String playerId;
        private final String newStatus;

    public UpdatePlayerStatusCommand(CloudAccount cloudAccount, String playerId, String newStatus) {
            this.cloudAccount = cloudAccount;
            this.playerId = playerId;
            this.newStatus = newStatus;
        }

        @Override
        public void execute() {
            // Update the player's status in the cloud account
            cloudAccount.updatePlayerStatus(playerId, newStatus);
        }

}
