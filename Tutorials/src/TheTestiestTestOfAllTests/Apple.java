package TheTestiestTestOfAllTests;
import java.util.Scanner;

public class Apple {
    
    Scanner a = new Scanner(System.in);
    public String nameApple;
    public static double ripenessApple;
    public static double sizeApple;
    public static double priceApple;
    //public static double quantityApple;
    public static final double basePriceApple = 2;
    
    
    public Apple(String newNameApple, double newRipenessApple, double newSizeApple){
        nameApple = newNameApple;
        ripenessApple = newRipenessApple;
        sizeApple = newSizeApple;
    }
        
        public void boughtApple() {
            System.out.println("You chose to buy an apple! Enter in the size that you want, 1 being the biggest, .00001 being the smallest: ");
            double sizeApple = a.nextDouble();
            System.out.println("Scale from 0-1, enter in the ripeness you want: ");
            double ripenessApple = a.nextDouble();
        }
        
        
    
    
        
        
    
    }
    
