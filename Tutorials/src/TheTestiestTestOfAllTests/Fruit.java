package TheTestiestTestOfAllTests;
import java.util.Scanner;

public class Fruit {
    
    //double total = 0;
    static double appleCost;
    
    public static void main(String[] args){
    double total = 0;
    Apple apple = new Apple("Apple", Apple.ripenessApple, Apple.sizeApple);
    Scanner a = new Scanner(System.in);
        int i = 5;
        while( i == 5) {
        System.out.println("Type 1 to buy an apple or 2 to checkout.");
        String theFirstAnswer = a.next();
        if(theFirstAnswer .equals("1")) {
            apple.boughtApple();
            appleCost = Apple.basePriceApple * Apple.ripenessApple * (Apple.sizeApple * 2);
            System.out.println("How many of these apples would you like?");
            int quantityApple = a.nextInt();
            //total = appleCost * quantityApple + total;
        }
        else if(theFirstAnswer .equals("2")) {
            System.out.println("Thanks for shopping with Iveyz. Your total is " + appleCost);
            break;
    
    }
    
}
    }
}
