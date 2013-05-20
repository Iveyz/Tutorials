package me.zethus;

import java.util.Scanner;

public class MyOriginalIdea {
    
    public static void main(String[] args){
        
    int f = 4;
    while (f < 5) {
        System.out.println("Please enter Multiply, Divide, Add, Subtract, Cosine, Sine or Quit");
        Scanner a = new Scanner(System.in);
        String theFunction = a.next();
        if (theFunction .equalsIgnoreCase("Multiply")) {
            System.out.println("Please enter your first number");
            double firstNumber = a.nextDouble();
            System.out.println("Please enter your second number");
            double secondNumber = a.nextDouble();
            System.out.println(firstNumber * secondNumber);
          
        }
        else if (theFunction .equalsIgnoreCase("Divide")) {
            System.out.println("Please enter your first number");
            double firstNumber = a.nextDouble();
            System.out.println("Please enter your second number");
            double secondNumber = a.nextDouble();
            System.out.println(firstNumber / secondNumber);
            
        }
        else if (theFunction .equalsIgnoreCase("Add")) {
            System.out.println("Please enter your first number");
            double firstNumber = a.nextDouble();
            System.out.println("Please enter your second number");
            double secondNumber = a.nextDouble();
            System.out.println(firstNumber + secondNumber);
            
        }
        else if (theFunction .equalsIgnoreCase("Subtract")) {
            System.out.println("Please enter your first number");
            double firstNumber = a.nextDouble();
            System.out.println("Please enter your second number");
            double secondNumber = a.nextDouble();
            System.out.println(firstNumber - secondNumber);
            
        }
        else if (theFunction .equalsIgnoreCase("Quit")) {
            System.out.println("Thank you for using my calculator!");
            f++;
        }
        else if (theFunction .equalsIgnoreCase("Cosine")) {
            System.out.println("Please enter your angle you want the Cosine of");
            double firstNumber = a.nextDouble();
            int r = 1;
            while (r == 1) {
            System.out.println("Is this in degrees or radians?");
            String theType = a.next();
            //int r = 1;
            //while (r == 1) {
            if (theType .equalsIgnoreCase("Radians")) {
                System.out.println("The cosine of " + firstNumber + " is " + Math.cos(firstNumber));
                r++;
            }
            else if (theType .equalsIgnoreCase("Degrees")) {
                double degreesAnswer = firstNumber / 180.0;
                System.out.println("The cosine of " + firstNumber + " is " + Math.cos(degreesAnswer) );
                r++;
            }
            else {
                System.out.println("You did not say degrees or radians!");
            }
            }
        }
        
        else if (theFunction .equalsIgnoreCase("Sine")) {
            System.out.println("Please enter your angle you want the Sine of");
            double firstNumber = a.nextDouble();
            int g = 1;
            while (g == 1) {
            System.out.println("Is this in degrees or radians?");
            String theType = a.next();
            //int g = 1;
            //while (g == 1) {
                
            if (theType .equalsIgnoreCase("Radians")) {
                System.out.println("The sine of " + firstNumber + " is " + Math.sin(firstNumber));
                g++;
            }
            else if (theType .equalsIgnoreCase ("Degrees")) {
                double degreesAnswer = firstNumber / 180.0;
                System.out.println("The sine of " + firstNumber + " is " + Math.sin(degreesAnswer) );
                g++;
            }
            else {
                System.out.println("You did not say degrees or radians!");
            }
        }
        }
    

        else {
            System.out.println("You did not enter in what to do!");
        }
}
}
        
    }
    
    
    

