package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class UserPassword {
    public static ArrayList <String> arrList = new ArrayList <> ();
    public static Scanner scanner = new Scanner(System.in);
    public static String userPwd(){
        arrList.add("Blaze");
        System.out.println("Blaze is added");
        String pwd = " ";
        while(!pwd.equals("9010789258")){
            pwd = scanner.nextLine();
            if (pwd.equals("9010789258")){
                System.out.println("You may enter now.");
            } else {
                System.out.println("Please enter correct password!");
            }
        }
        return pwd;
    }
}
