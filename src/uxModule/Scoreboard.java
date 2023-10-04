package uxModule;

import scoringModule.ScoringSystem;

import java.util.Map;

public class Scoreboard {
    private ScoringSystem scoringSystem;

    public Scoreboard(ScoringSystem scoringSystem) {
        this.scoringSystem = scoringSystem;
    }

    public void showScores() { //methods for showing scores
        if (scoringSystem != null) {
            Map<String, Integer> singlePersonScores = scoringSystem.getSinglePersonScores();
            Map<String, Integer> teamScores = scoringSystem.getTeamScores();

            System.out.println("Single Person Scores: " + singlePersonScores);
            System.out.println("Team Scores: " + teamScores);
        } else {
            System.out.println("No scoring system available.");
        }
    }

    public ScoringSystem getScoringSystem() {
        return scoringSystem;
    }

    public void setScoringSystem(ScoringSystem scoringSystem) {
        this.scoringSystem = scoringSystem;
    }
}
