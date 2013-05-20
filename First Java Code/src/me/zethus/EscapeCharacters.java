package me.zethus;

public class EscapeCharacters {
    
    public static void main(String[] args){
    
        //When declaring Strings it is sometimes necessary to use
        //what we call "escape characters". These are special characters
        //that Java would otherwise confuse itself with if we did not use them.
        
        //For example, what if we wanted to print out a message to the user,
        //and the message had actual quotation marks in it? How would Java
        //know if we were trying to print quotations, or parsing a new String?
        //String s = "Hello "User", this is a message with "quotes".";
        //If you try this ^ it will not work.
        
        //Ergo, we need escape characters.
        //All escape characters are denoted by a backslash \ followed by another character.
        //Here are some common ones:
        
        //Quotation mark:  \"
        //Apostrophe: \'
        //New line: \n
        //Tab: \t
        
        //There are many others you can look up, but for now just focus on those.
        
        System.out.println("Hello \"User\", this is a message with \"quotes\".");
        System.out.println();
        System.out.println("This message is \nbroken into two lines.");
        
    }
    
}
