package uxModule;

import scoringModule.ScoringSystem;

import java.util.Map;

public class Scoreboard {
    private ScoreProvider scoreProvider;

    public Scoreboard(ScoreProvider scoreProvider) {
        this.scoreProvider = scoreProvider;
    }

    public void showScores() {
        Map<String, Integer> singlePersonScores = scoreProvider.getSinglePersonScores();
        Map<String, Integer> teamScores = scoreProvider.getTeamScores();

        System.out.println("Single Person Scores: " + singlePersonScores);
        System.out.println("Team Scores: " + teamScores);
    }
}
