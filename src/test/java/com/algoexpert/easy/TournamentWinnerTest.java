package com.algoexpert.easy;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TournamentWinnerTest {

    @Test
    void tournamentWinner() {
        ArrayList<ArrayList<String>> teams = new ArrayList<>();
        teams.add(competition("HTML", "C#"));
        teams.add(competition("C#", "Python"));
        teams.add(competition("Python", "HTML"));
        ArrayList<Integer> winners = new ArrayList<>(Arrays.asList(0, 0, 1));

        String result = new TournamentWinner().tournamentWinner(teams, winners);

        assertEquals("Python", result);
    }

    private ArrayList<String> competition(String home, String enemy) {
        ArrayList<String> result = new ArrayList<>();
        result.add(home);
        result.add(enemy);
        return result;
    }

}