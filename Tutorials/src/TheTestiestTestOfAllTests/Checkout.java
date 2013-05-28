package TheTestiestTestOfAllTests;
import java.util.Scanner;

public class Checkout {
    public static double total;
    
    public static void main(String[] args){
    
        Scanner a = new Scanner(System.in);
        int i = 5;
        while( i == 5) {
        System.out.println("Type 1 to buy an apple or 2 to checkout.");
        String theFirstAnswer = a.next();
        if(theFirstAnswer .equals("1")) {
            
            System.out.println("Enter the ripeness of the apple that you want");
            double Apple.newRipenessApple = a.nextInt();
            System.out.println("Enter the size of the apple from .0001 being the smallest, 1 being the biggest.");
            double size = a.nextInt();
    }
        else if(theFirstAnswer .equals("2")) {
            System.out.println("Thanks for shopping with Iveyz. Your total is " + total);
            break;
        }
    
}
    }
}
