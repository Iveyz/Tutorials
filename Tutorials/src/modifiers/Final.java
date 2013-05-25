package modifiers;

public class Final {
    
    //The 'final' modifier
    public final int myNumber = 10;
    public final int myOtherNumber;
    
    /*
     * A 'final' variable is one that has a given value, and that given value CANNOT change.
     * (So really it's not a variable, and thats why we call  them 'class members' in Java, because not
     * everything can vary)
     * 
     * The only other way of assigning a value to a final variable is through the constructor.
     */
    
    public Final(int num){
        
        myOtherNumber = num;
        
        /*
         * If you declare a final variable, it MUST have a value either right away,
         * or given in the constructor (as shown here). You cannot leave a final variable
         * blank.
         * 
         * Use final variables where you can. Java can read final variables much quicker and more
         * efficiently than regular ones (because it knows that its value will never change). So 
         * if you write a variable and know that it should only ever really have one value, make it final.
         * 
         * The static 'uniform' String mentioned in the other class, could be given the 'final' property. The uniform
         * is not likely to change, because well it's a uniform.
         * 
         * 
         */
        
    }
    
    public void method(){
        
        
        
    }
    
}
