package me.zethus;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriting {
    
    public static void main(String[] args){
    
        /*
         * The java.util.File class is a class that specifies
         * a 'position' on the system for a file, NOT the actual file.
         * It is a common misconception to believe otherwise. When you declare a File
         * in Java (and most other programming languages) you are
         * actually just declaring a position that a File may or may
         * not exist. From there you can read potential data from the supposed location.
        */
        
        //Lets look at declaring Files
        //The java.util.File constructors do not allow us to declare a File without
        //passing in an argument. All of the constructors (there are many) involve passing
        //in some form of a location on the system. The easiest and simplest constructor
        //is the one that involves passing in a String.
        File file = new File("C:/Users/Laptop/Desktop/file.txt");
        
        //Initially no file exists with that path and name ^, however Java can still specify
        //a File to it, because again we are just creating a 'spot' for it to possibly exist.
        
        if(file.exists())
            System.out.println("File exists!");
        else
            System.out.println("File does not exist!");
        
        //Knowing whether files exist or not is crucial because if you try to read from a 
        //non-existant file, bad things happen.
        
        //Let us now suppose that no file exists there to begin with, and we are going
        //to write data to a new file with that path and name.
        
        //In order to actually write to file, we use what we call a FileWriter.
        
        FileWriter fileWriter = null;
        
        try{
            fileWriter = new FileWriter(file);
        }catch(IOException e){
            System.out.println("IOException was caught!");
        }
        
        //Note that we have to declare it inside a try-catch. This is because
        //Java would not know what to do if there was an IOException (Input/Output Exception)
        //In the case of an IOException, it's usually thrown when the file is already being used,
        //or the file is corrupt or something. They aren't thrown very often though.
        
        //The FileWriter will take BUFFERED data (data that is ready to be written to file),
        //and put it inside the file.
        //Before we can use it though we need to convert the data in the program to buffered data.
        //For this we will need a BufferedWriter.
        
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        
        //The BufferedWriter will take data that we give it (Strings, ints etc.) and convert it
        //into useable data that the FileWriter can actually put into the file. They work together sort of
        
        //Actually writing data is not hard, it's just the setting up that's a little tricky.
        
        try{
            bufferedWriter.write("This is some data");
            bufferedWriter.flush();
            bufferedWriter.close();
        }catch(IOException e){
            System.out.println("An error occurred trying to write to file!");
        }
        
        //Again Java forces us to put this inside a try-catch, because there is a chance that the file we
        //are trying to write to is currently in use, currently already being written to etc.
        //Lastly we must call the flush() method which will ensure that all pending data
        //gets written to file, and then the close() method which disposes of the writer so that the file
        //can be used for other things.
        
        
        //LESSON 1 COMPLETE
        
        
        
    }
    
}
