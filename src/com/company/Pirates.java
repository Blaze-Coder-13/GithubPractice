package com.company;

public class Pirates extends Humans{

    private final int fight;
    private final int swim;

    public Pirates(String name, int move, int sleep, String eat, int fight, int swim) {
        super(name, move, sleep, eat);
        this.fight = fight;
        this.swim = swim;
    }

    public int getFight() {
        return fight;
    }

    public int getSwim() {
        return swim;
    }
}
