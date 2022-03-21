package com.company;


public class Grade {
    public String scoreCalculator(int score) {
        String scoreLadder;
        if(score >= 5){
            scoreLadder = "Excellent grade";
        }
        else if (score==4){
            scoreLadder = "Great work";
        }
        else if (score == 3){
            scoreLadder = "Good score";
        }
        else if (score == 2){
            scoreLadder = "Average";
        }
        else {
            scoreLadder = "Bad score";
        }
        return scoreLadder;

    }
}
