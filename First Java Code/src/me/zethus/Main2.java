package me.zethus;

import java.util.Scanner;

public class Main2 {

    public static int inputNumber(int a) {

        return a * 3;
    }

    public static int inputNumberB(int b) {

        return b * 3;
    }

    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);
        System.out.println("Please enter your width of the triangle");
        int inputNumber = a.nextInt();
        System.out.println("Please enter your height of the triangle");
        int inputNumberB = a.nextInt();
        System.out.println((inputNumber * inputNumberB) / 2 + " " + "is the area of your triangle!");
        
    }
}
