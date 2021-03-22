package com.algoexpert.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TournamentWinner {

    public String tournamentWinner(ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {
        Map<String, Integer> teams = new HashMap<>();
        String result = "";
        int highestScore = 0;
        for (int i = 0; i < results.size(); i++) {
            String winningTeam;
            if (results.get(i).equals(1)) {
                winningTeam = competitions.get(i).get(0);
            } else {
                winningTeam = competitions.get(i).get(1);
            }
            Integer score = teams.get(winningTeam);
            if (score == null) {
                score = 1;
            } else {
                score++;
            }
            teams.put(winningTeam, score);
            if (highestScore < score) {
                highestScore = score;
                result = winningTeam;
            }
        }
        return result;
    }
}
