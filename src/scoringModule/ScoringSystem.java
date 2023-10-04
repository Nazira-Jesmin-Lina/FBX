package scoringModule;

import java.util.HashMap;
import java.util.Map;

public class ScoringSystem {
    private Map<String, Integer> singlePersonScores = new HashMap<>();
    private Map<String, Integer> teamScores = new HashMap<>();

    public void calculateSinglePersonScore(String playerName, int score) {
        // method for calculate single-person score and store it in the score map
        singlePersonScores.put(playerName, score);
    }

    public void calculateTeamScore(String teamName, int[] scores) {
        //method for calculate team-based score and store it in the score map
        int teamScore = 0;
        for (int score : scores) { //getting score of all players from a specific team
            teamScore += score;
        }
        teamScores.put(teamName, teamScore);
    }

    public Map<String, Integer> getSinglePersonScores() {
        return singlePersonScores;
    }

    public Map<String, Integer> getTeamScores() {
        return teamScores;
    }

    public void setSinglePersonScores(Map<String, Integer> singlePersonScores) {
        this.singlePersonScores = singlePersonScores;
    }

    public void setTeamScores(Map<String, Integer> teamScores) {
        this.teamScores = teamScores;
    }

//    public static void main(String[] args) {
//        scoringModule.ScoringSystem scoringSystem = new scoringModule.ScoringSystem();
//
//        // Calculate single-person scores
//        scoringSystem.calculateSinglePersonScore("Player1", 100);
//        scoringSystem.calculateSinglePersonScore("Player2", 80);
//
//        // Calculate team-based scores
//        int[] team1Scores = {100, 80, 90};
//        scoringSystem.calculateTeamScore("TeamA", team1Scores);
//
//        // Get scores
//        Map<String, Integer> singlePersonScores = scoringSystem.getSinglePersonScores();
//        Map<String, Integer> teamScores = scoringSystem.getTeamScores();
//
//        System.out.println("Single Person Scores: " + singlePersonScores);
//        System.out.println("Team Scores: " + teamScores);
//    }
}
