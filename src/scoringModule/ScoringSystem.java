package scoringModule;

import java.util.HashMap;
import java.util.Map;

// Singleton Pattern: ScoringSystem as a Singleton
public class ScoringSystem {
    private static ScoringSystem instance = null;
    private Map<String, Integer> singlePersonScores = new HashMap<>();
    private Map<String, Integer> teamScores = new HashMap<>();

    private ScoringSystem() {
    }

    public static ScoringSystem getInstance() {
        if (instance == null) {
            instance = new ScoringSystem();
        }
        return instance;
    }

    public void calculateSinglePersonScore(String playerName, int score) {
        singlePersonScores.put(playerName, score);
    }

    public void calculateTeamScore(String teamName, int[] scores) {
        int teamScore = 0;
        for (int score : scores) {
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
}