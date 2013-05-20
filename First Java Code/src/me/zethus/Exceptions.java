package me.zethus;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptions {
    
    public static void main(String[] args){
    
        Scanner scanner = new Scanner(System.in);
        //try-catch statement
        int i = -999;
        try{
            
            i = scanner.nextInt();
        
        }catch(InputMismatchException e){
            
            System.out.println("You did not enter a number");
            
        }
        if(i != -999) System.out.println(i);
        
        
    
    }
    
}
