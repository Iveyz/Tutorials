/*Prompt the user for 4 lines of data,
and write it to a file with the name of their choosing,
to the desktop. (hint: declaring the file using the string will require concatenation)*/

package me.zethus;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TaskNumbaOne {
    
    
    public static void main(String[] args){
    Scanner a = new Scanner(System.in);
    //String fileYouName = a.next(fileYouName);
    
    //File fileYouName = null;
        System.out.println("Please enter in a file name: ");
        String fileYouName = a.nextLine();
        File f = new File("C:/Users/Laptop/Desktop/" + fileYouName);
    //System.out.println("Please enter in a file name: ");
    //fileYouName = a.next();
    if(f.exists())
            System.out.println("File exists!");
        else
            System.out.println("File does not exist!");
    
    FileWriter fileWriter = null;
        
        try{
            fileWriter = new FileWriter(fileYouName);
        }catch(IOException e){
            System.out.println("IOException was caught!");
        }
        
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        System.out.println("Enter a sentence: ");
        String line1 = a.next();
        System.out.println("Enter a sentence: ");
        String line2 = a.next();
        System.out.println("Enter a sentence: ");
        String line3 = a.next();
        System.out.println("Enter a sentence: ");
        String line4 = a.next();
        
        try{
            bufferedWriter.write(line1);
            bufferedWriter.write("\n" + line2);
            bufferedWriter.write("\n" + line3);
            bufferedWriter.write("\n" + line4);
            bufferedWriter.flush();
            bufferedWriter.close();
        }catch(IOException e){
            System.out.println("An error occurred trying to write to file!");
        }
        
    
    
    }
}
