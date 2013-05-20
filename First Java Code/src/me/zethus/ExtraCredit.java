package me.zethus;

import java.util.Scanner;

public class ExtraCredit {
    
    public static void main(String[] args){
    
        Scanner a = new Scanner(System.in);
        System.out.println("Please enter your theta in degrees");
        double theTheta = a.nextInt();
        double theThetaRadian = theTheta / 180.0;
        double thirdAngle = 90 - theTheta;
        System.out.println("Please enter the hypotonuse length");
        int theHyp = a.nextInt();
        double theSin = Math.sin(theThetaRadian) * theHyp;
        double theCos = Math.cos(theThetaRadian) * theHyp;
        System.out.println(thirdAngle + " is your third angle!");
        System.out.println(theSin + " and " + theCos + " are your other two sides!" );
    
    }
    
}
