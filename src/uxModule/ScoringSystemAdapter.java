package uxModule;

import scoringModule.ScoringSystem;

import java.util.Map;

public class ScoringSystemAdapter implements ScoreProvider{

    private ScoringSystem scoringSystem;

    public ScoringSystemAdapter(ScoringSystem scoringSystem) {
        this.scoringSystem = scoringSystem;
    }

    @Override
    public Map<String, Integer> getSinglePersonScores() {
        return scoringSystem.getSinglePersonScores();
    }

    @Override
    public Map<String, Integer> getTeamScores() {
        return scoringSystem.getTeamScores();
    }
}
