package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);

        System.out.println("Booting up...");

        Addition add = new Addition();
        System.out.println("Enter 2 values: ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        System.out.println("Two values are added");
        System.out.println(x + " + " + y + " = " + add.addValues(x, y));

        DrawCircle draw = new DrawCircle();
        draw.drawCircle();
        System.out.println("Circle is drawn");
        System.out.println("Shutting down...");

        Grade grade = new Grade();
        System.out.println("Enter your grade: ");
        int score = scanner.nextInt();
        System.out.println("Your grade report: " + grade.scoreCalculator(score));


        Students student = new Students();
        System.out.println("Student Information: ");
        String studentInfo = student.getInfo();
        System.out.println(studentInfo);

        AverageRunner average = new AverageRunner();
        System.out.println("Enter 3 numbers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        double findAverage = average.averageNumbers(a,b,c);
        System.out.println("average of 3 numbers: " + findAverage);

        System.out.println(UserPassword.userPwd());

        StrawHats strawhats = new StrawHats("strawhats", 20, 8, "meat", 10, 10,
                                      "bink sake", 100, "fish", 100, "raftel", true);

        System.out.println("Strawhats are doing these stuff daily: " +
                           "\n sleep for " + strawhats.getSleep() + " hrs " +
                           "\n eat " + strawhats.getEat() + " daily.");

        String cook = "Sanji cooks " + strawhats.getCook() + " deliciously.";
        System.out.println(cook);

    }
}

