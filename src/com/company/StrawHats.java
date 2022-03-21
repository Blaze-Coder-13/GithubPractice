package com.company;

public class StrawHats extends Pirates{

    private final String dance;
    private final int cut;
    private final String cook;
    private final int punch;
    private final String navigate;
    private final boolean lie;

    public StrawHats(String name, int move, int sleep, String eat, int fight, int swim, String dance, int cut, String cook, int punch, String navigate, boolean lie) {
        super(name, move, sleep, eat, fight, swim);
        this.dance = dance;
        this.cut = cut;
        this.cook = cook;
        this.punch = punch;
        this.navigate = navigate;
        this.lie = lie;
    }

    public String getDance() {
        return dance;
    }

    public int getCut() {
        return cut;
    }

    public String getCook() {
        return cook;
    }

    public int getPunch() {
        return punch;
    }

    public String getNavigate() {
        return navigate;
    }

    public boolean isLie() {
        return lie;
    }
}
