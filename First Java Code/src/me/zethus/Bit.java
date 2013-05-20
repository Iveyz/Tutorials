package me.zethus;

import java.util.*;

public class Bit {
  public static void main(String[] args) {
    System.out.print("Enter Password: ");
    Scanner s = new Scanner(System.in);
    String user_key = s.next();
    char[] verify_arr = {193, 35, 9, 33, 1, 9, 3, 33, 9, 225};
    for(char ch : user_key.toCharArray()){
        
      System.out.println("Input: " + (int)ch);
      //System.out.println(255 & ch);
      //System.out.println(ch & 255);
      
      System.out.println("Bitwise shift left (factor of 2 because of two <'s) = " + Integer.valueOf(ch << 2));
      System.out.println("Bitwise shift right (factor of 2 because of two <'s) = " + Integer.valueOf(ch >> 2));
      System.out.println("Bitwise OR (inclusive) = " + Integer.valueOf((ch << 5) | (ch >> 3)));
      System.out.println("Bitwise OR (inclusive) followed by OR (exclusive) = " + Integer.valueOf(((ch << 5) | (ch >> 3)) ^ 111));
      System.out.println("Final operation = " + Integer.valueOf((char)((((ch << 5) | (ch >> 3)) ^ 111) & 255)));
        
      
      
      //The trouble is the stupid OR operator
      /*
       * say you had 2, which is 0010 in binary
       * and you had 4, which is 0100 in binary
       * basically what the | operator does is
       * checks each bit of the number in binary form.
       * 
       * if EITHER bit is 1, it returns 1.
       * first number in both is 0 so it returns    0.
       * second is 0 in 2 but 1 in 4, so it returns 1.
       * third is 1 in 2 but 0 in 4, so it returns  1.
       * fourth is zero in both so it returns       0.
       * and thus we are left with 0110, or 6 in decimal form.
       * 
       * obviously it's not possible to reverse that operation...
       * 
       * 
       * it's just that i dont like to think of numbers in binary, that's why it's hard for me
       * 
       * let me try a guess and check
       * 
       * 35 = 00100011
       * 
       * 255 = 11111111
       * 
       * im looking at 35
       * 35 was returned from the final operation of  x & 255
       * 
       * that's weird, it seems like an arbitrary operation to do  x & 255 because 255 is all ones..
       * whatever
       * 
       * number before = 35
       * i have to go, gotta work in like 30 mins.
       * ttyl, cya and thanks yw
       * 
       * 
       * 
       * 
       */
      
      
      /*
       *   < - multiply by 2 for each <
       *   > - divide by 2 for each >
       *   & - when comparing each bit, return 1 if both bits are 1
       *   ^ - when comparing each bit, return 1 if both bits are different (one is 0 and the other is 1)
       *   | - when comparing each bit, return 1 if either bits are 1
       * 
       */
      
    }
    if (user_key.length() != 10){  // 10 character password
      System.out.println("Wrong");
      return;
    }

     // The 10 characters, in ASCII

    ArrayList<Character> user_arr = new ArrayList<Character>();
    char[] user_submitted_arr = user_key.toCharArray();

    for (char ch : user_submitted_arr) {
      
      
      
      user_arr.add((char)((((ch << 5) | (ch >> 3)) ^ 111) & 255)); //oh, they encrypted it
      
      
      
    }

    int i;
    for(i = 0; i < 10; i++) {
      if (!user_arr.get(i).equals((char)verify_arr[i])) {
        System.out.println("Wrong");
        return;
      }
    }
    System.out.println("Success");
  }
}
