package uxModule;

import java.util.Map;

public interface ScoreProvider {
    Map<String, Integer> getSinglePersonScores();
    Map<String, Integer> getTeamScores();
}
