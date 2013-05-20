package me.zethus;

import java.io.*;

public class FileReading {
    
    public static void main(String[] args){
    
        //FileReading is just as easy as writing (maybe a little harder) only it involves the opposite
        //of what writing does.
        
        File file = new File("C:/Users/Laptop/Desktop/file.txt");
        
        if(file.exists() == false){
            System.err.println("File not found!");
        }else{
        
            try{

                FileReader fileReader = new FileReader(file);
                BufferedReader bufferedReader = new BufferedReader(fileReader);

                //Depending on how you initially wrote data to file, you may choose
                //to read data from it in a number of ways.
                
                //The read() method will return an int, which is the next character
                //in 0-65535 format (hexadecimal)
                //more conventionally we would use the readLine() method because
                //it returns the entire line as a String.
                
                //But how do we know how much data is in the File? How do we know
                //how many times to call read() or readLine() before we reach
                //the end of the file?
                
                //Well, the ready() method returns true or false, depending on
                //whether the bufferedReader is 'ready' (meaning there is data
                //ready to be read), or whether there is not (it has reached the end)
                
                //Based on that ^ principle, we can deduct that if we do this
                
                int i = 1;
                while(bufferedReader.ready()){ //It will continue to return true as more data is read, until it reaches the end
                    
                    String line = bufferedReader.readLine();
                    
                    if(i == 2){
                        System.out.println(line);
                    }
                    i++;
                    
                }
                
                //In the case of a BufferedReader we are not obligated to close it,
                //however it is not good practice to avoid doing so.
                
                bufferedReader.close();
                

            }catch (IOException e){
                e.printStackTrace(); 
                //Calling the printStackTrace() method on the Exception that is caught
                //is the same thing as what Java would normally do if we did not catch
                //the exception. Hence why Netbeans complains when we do it (I have disabled
                //that warning for you), because it thinks we are doing something arbitrary.
            }
        
        }
    
        //LESSON 2 COMPLETE
        
        
    }
    
}
