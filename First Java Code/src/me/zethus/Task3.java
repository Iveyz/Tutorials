package me.zethus;

import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
    
    public static void main(String[] args){
    
        double[] grades = new double[4];
        String[] subjects = new String[4];
        Scanner subjectScanner = new Scanner(System.in);
        Scanner gradeScanner = new Scanner(System.in);
        
        for(int i = 0; i < 4; i++){
            
            System.out.println("Enter a subject: ");
            String sub = subjectScanner.nextLine();
            System.out.println("Enter a grade: ");
            double grade = gradeScanner.nextDouble();
            
            subjects[i] = sub;
            grades[i] = grade;
            
        }
        
        for(int i = 0; i < 4; i++){
            
            String sub = subjects[i];
            double grade = grades[i];
            
            String message = sub + ": " + "%" + grade;
            System.out.println(message);
            
        }
    
    }
    
}
