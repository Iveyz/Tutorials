package grocerystore;

/*
 * 
 * This is a CLASS FILE. Although the extension is .java we call it a class file.
 * The compiled version of a .java file has a .class extension. Regardless, both can be considered class files.
 * Do not confuse the two.
 * 
 * A class file does not contain a main method. In any Java project there should only be one file with a main
 * method, as it contains the 'code entry point', where the project begins when it runs.
 * 
 * I don't know why but I like to use Grocery Stores as examples, it's really easy to use them for class tutorials.
 * 
 * Okay so, what is a class?
 * A class is basically a template for what we call an 'object'. An object is like an instance, if you've heard
 * the term before. In CS:S, every single player in the game would be an 'instance' of the 'player' class.
 * 
 * Yes. I'll get into that though, but it's the same thing. Okay so: When you write out a class file, first you
 * want to write out every 'characteristic' that the template will have. We're doing fruit, so let's think of
 * all of the characteristics that a generic 'fruit' (ignoring what type of fruit that it is) might have.
 * 
 * 
 */



public class Fruit {
    
    String name;
    String size;
    String color;
    /*
     * The above variables are what we call 'class members'. What this means is that every 'instance' of the Fruit class
     * will have these variables. They might (and probably will) have different values, but the variables do exist for every
     * instance of Fruit. This would make sense, because logically you could assume that every fruit has a name, size and color.
     * 
     * The second thing you generally want to write for a class file is its 'constructor'. A constructor is kind of like a method, except
     * for rather than calling the method the way you normally do, it gets called whenever you create an instance of the class. You'll see
     * what I mean later.
     * 
     * 
     */
    
    public Fruit(String newName, String newSize, String newColor){
        
        name = newName;
        size = newSize;
        color = newColor;
        System.out.println("We just created a new fruit called " + name + " with size = " + size + " and color = " + color);
        
    }
    
    /*
     * Note that the constructor does not have a return type.
     * Most methods you would remember are written like
     * 
     * public void myMethod()
     * 
     * or
     * 
     * public int myMethod()
     * 
     * etc.
     * 
     * A constructor cannot return anything, so we leave that part out.
     * 
     * With this constructor I've said, "Whenever we make a Fruit, you HAVE to give a name, size and color.
     * After that we'll store those 3 things in the instance of this Fruit you're creating."
     * 
     * Then we print out the shit.
     * 
     * 
     */
    
    
    /*
    * 
    * As with a regular file, you can put methods inside the class file itself.
    * 
    */
    
    public void changeName(String s){
        
        System.out.println("The fruit " + name + " has been renamed to " + s);
        name = s;
        
        //You must always remember that these methods are called specifically for one instance of
        //the Fruit class. If I have an apple, banana and orange and I call changeName() on the apple it will
        //not rename the banana and orange as well.
        
        //Because of this concept ^ you can always assume that when this code is run ^, that you have a value for name, size and color.
        //This assumption can be made due to our constructor. If we've said that no matter what you MUST give those 3 things when you make a Fruit,
        //then we can assume that when any methods are called on any fruit, they will always have a value for those 3 things.
        
    }
    
    //Return methods come in handy when you use class files.
    
    public String getName(){
        
        return name;
        
    }
    
    //This ^ can be used to acquire the name of the Fruit instance we call it on.
    
    
    
}
