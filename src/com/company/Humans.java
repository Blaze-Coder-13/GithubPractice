package com.company;

public class Humans {

    private final String name;
    private final int move;
    private final int sleep;
    private final String eat;

    public Humans(String name, int move, int sleep, String eat) {
        this.name = name;
        this.move = move;
        this.sleep = sleep;
        this.eat = eat;
    }

    public String getName() {
        return name;
    }

    public int getMove() {
        return move;
    }

    public int getSleep() {
        return sleep;
    }

    public String getEat() {
        return eat;
    }
}
