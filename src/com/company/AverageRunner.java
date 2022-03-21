package com.company;

public class AverageRunner {

    public double averageNumbers(int x, int y, int z){
        return (double)(sumThreeNumbers(x,y,z))/3;
    }

    private int sumThreeNumbers (int x, int y, int z){
        return x+y+z;
    }
}
