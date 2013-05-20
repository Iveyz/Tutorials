package me.zethus;

import java.util.Scanner;

public class PiggyBank {
    
    public static void main(String[] args){
    
        Scanner a = new Scanner(System.in);
        int i = 5;
        double theBalance = 0;
        while( i == 5) {
        System.out.println("Would you like to Withdraw, Deposit, Balance, or Quit?");
        String theFirstAnswer = a.next();
        if(theFirstAnswer .equalsIgnoreCase("Deposit")) {
            
            System.out.println("Enter the amount that you want deposited into your bank:");
            double theDeposit = a.nextInt();
            theBalance = theBalance + theDeposit;
            System.out.println("Your new balance is now " + theBalance);
        }
        else if(theFirstAnswer .equalsIgnoreCase("Withdraw")) {
            System.out.println("Enter the amount you wish to withdraw:");
            double theWithdraw = a.nextInt();
            theBalance = theBalance - theWithdraw;
            System.out.println("Your new balance is now " + theBalance);
        }
        else if (theFirstAnswer .equalsIgnoreCase("Balance")) { /* Why can't there be a space */
            System.out.println("Your current balance is " + theBalance);
        }
        else if (theFirstAnswer .equalsIgnoreCase("Quit")) {
            System.out.println("Thank you for banking with Ivey!");
            i++; 
            
        }
        else {
            System.out.println("Please type what you would like to do! ");
        }
    
    }
        { System.out.println("Would you like to take our optional survey?");
            String theOption = a.next();
            if (theOption .equalsIgnoreCase("Yes")) {
        System.out.println("How would you rate Ivey Banking, 1 though 10? " );
        double theRating = a.nextDouble();
        int q = 20;
        while (q == 20) {
        if (theRating <= 6) {
           System.out.println("We are sorry you feel that our banking is only " + theRating + " How can we improve?"); 
           String theFeedback = a.next(); 
           q++;
        }
        else if (theRating >= 6) {
            System.out.println("Wow! Thank you for the great rating of " + theRating + "! Is there anything that we can improve on?");
            String theFeedback = a.next();
            q++;
        }
        else {
            System.out.println("Sorry, whole numbers 1 through 10 are the only accepted responses!");
        }
        System.out.println("Thanks for taking our optional survey! Here is an additional 1,000,000$! ");
        theBalance = theBalance + 1000000;
        System.out.println("Your new balance is now " + theBalance);
    }
            
}
        else {
                System.out.println("Shame on you.");
            }
    
}
}
}