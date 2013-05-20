package grocerystore;

public class GroceryStore {

    public static void main(String[] args) {
        
        //Creating an instance of the class file is pretty straightforward
        
        //Fruit myFruit = new Fruit();
        
        //Note that it complains, because I am not adhering to the rules of the constructor.
        //Required: String, String, String
        //Found: no arguments
        
        
        Fruit apple = new Fruit("Apple", "Small", "Red");
        
        //Recall that when you created a Scanner for user input, you went
        
        //Scanner reader = new Scanner(System.in)
        
        //You are calling the constructor for Scanner this way, which requires
        //an InputStream as its 1 argument (so you passed in System.in which is a InputStream)
        
        //The important thing to understand, and what most people have a problem with,
        //is realizing that everything you type in the class file itself (in this case the Fruit file)
        //is, as aforementioned, just a template. It does not state anything specific, it only sets out
        //the rules for the Fruit class.
        
        
        /*
        * 
        * When you call a method on a class instance, it is important to understand that you
        * are calling it on that particular instance itself.
        * 
        */
        
        apple.changeName("Tomato");
        
        String s = apple.getName();
        System.out.println("Once again, the new name is " + s);
        
        //It helps to imagine the code 'path' in your head
        
        /*
         * 
         * Declare Fruit object called 'apple'
         * 
         * Fruit constructor is run, we passed in "Apple", "Small" and "Red"
         * The constructor creates a new instance of Fruit, and assigns those three
         * Strings to the class members that we defined.
         * 
         * We then call changeName() on the 'apple', passing in "Tomato" as the
         * String argument that the changeName() method needs.
         * 
         * The changeName() method then changes the 'name' class member from "Apple" to "Tomato"
         * 
         * 
         * 
         */
        
        //Do you understand everything so far? If not you'll run into a lot of problems
        //Make sure you comprehend how a 'class file' works, how it's a template that we create 'instances' from,
        //and then use the class files 'methods' on each instance of the class to do various things.
        
        /*
         * There are still 2 other big topics to cover
         * 
         * access modifiers (not actually that big)
         * class 'parents' (i dont think parents is the actual term but yeah) <- larger topic
         * 
         * but I shouldn't cover those until I'm sure you get all of this stuff ^^
         * 
         * So, for 'hw'
         * 
         * 
         */
        
    }
}
