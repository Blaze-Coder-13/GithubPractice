package com.company;

public class Students {
    public String getName(){
        return "Blaze";
    }
    public int getAge(){
        return 27;
    }
    public double getGPA(){
        return 9.5;
    }

    public String getInfo(){
        return "name: " + this.getName() +
                "\nage: " + this.getAge() +
                "\ngpa: " + this.getGPA();
    }
}
