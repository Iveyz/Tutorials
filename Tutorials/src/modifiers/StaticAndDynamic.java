package modifiers;

public class StaticAndDynamic {

    public int myNumber = 10; //This is a dynamic variable (although we dont actually write dynamic)
    public static int myOtherNumber = 20; //This is a static variable
    
    /*
     * 
     * A static variable will be kept consistent between ALL instances of the class file
     * So if you change the value of myOtherNumber, it will change for every class file.
     * 
     * If yearsWorked in Employee was static, and you changed it to 5, all employee's would
     * now have 5 years worked. The variable would be 'static', and would be the same for all instances.
     * 
     * Conversely, as you've seen already a dynamic variable is unique for each instance of a class. Jeffrey
     * might have 12 years worked, while Joe might only have 10.
     * 
     * 
     * 
     * So everything that is 'static' is not tied to any particular class file. It's the same for each one.
     * Because of this, anything static can be accessed without even needing an instance of a class file.
     * 
     * 
     */
    
    public static int myStaticNumber = 5;
    
    public static void main(String[] args){ //main method, dont worry about the 'static' modifier here, just ignore it
        
        int a = StaticAndDynamic.myStaticNumber;
        StaticAndDynamic.myStaticMethod();
        /*
         * 
         * Rather than doing
         * StaticAndDynamic instance = new StaticAndDynamic();
         * instance.myStaticMethod();
         * 
         * I can directly call the static method from the name of the Class file,
         * because the method is static. Things that are static are the same across every single instance
         * of the class, because the static things are not tied to any particular instance like dynamic things are.
         * 
         * 
         * A good example for this would be if you added a 'Uniform' String to your employee class.
         * e.g.
         * public static String uniform = "Beige pants and black shirt";
         * 
         * This would be the same for all employees no matter what employee it is, because they all wear the same uniform.
         * And you dont need an employee to know the uniform. (Just like mentioned above, you dont need an instance of the class
         * to get the static variable).
         * 
         */
        
        /*
         * 
         * Note: The most common static method that you use and are familiar with is
         * System.out.println("message");
         * It is a static method found in the System class.
         * 
         * 
         */
        
    }
    
    public static void myStaticMethod(){
        
    }
    
}
