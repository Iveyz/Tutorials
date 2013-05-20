package me.zethus;

public class Main {
    
    public static void main(String[] args){
        
        /*
          
         Operators
         * adding: +
         * subtracting: -
         * multiplying: *
         * dividing: /
         * modulus: %
         * power: ^
         
        */
        
        /*
          
         Comparators
         * Is equal: ==
         * Is NOT equal: !=
         * Is less than: <
         * Is less than or equal to: <=
         * Is greater than: >
         * Is greater than or equal to: >=
         * 
         * And: &&
         * Or: ||
         
        */
       
        int number = 4;
        
        if(number > 0 && number < 11 || number > 20 && number < 21){
            System.out.println("hey");
            
        }
        
        method(4);
        
        int someInt = 5;
        
        while(someInt > 0){
            
            someInt = someInt - 1;
            System.out.println("loop");
            
        }
        
        int a = 1;
        
        for(int i = 0; i < 10; i++){
            
            a++;
            if(a == 5){
                break;
            }
            
            if(a == 3){
                continue;
            }
            
            System.out.println("loop2");
            
        }
        
        int[] someArray = new int[5];
        //   _  _  _  _  _
        someArray[0] = 5;
        //   5 _  _  _  _
        someArray[1] = 2;
        someArray[2] = 18;
        someArray[3] = 225;
        someArray[4] = -4;
        //   5 2 18 225 -4
        
        int someNumber = someArray[0];
        
        for(int arrayItem : someArray){
            
            System.out.println(arrayItem);
            
        }
        
        int myNumber = getNumber(20);
        
    }
    
    public static void method(int a){
        
        System.out.println(a);
        
    }
    
    public static void method(int a, int b){
        
        System.out.println(a + b);
        
    }
    
    public static int getNumber(int a){
        
        return a - 2;
        
    }
            //Scanner inputNumber = new Scanner(System.in);
}
