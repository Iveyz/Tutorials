package testfruit;

public class testgrocerystore {

    public static void main(String[] args) {
        
        
        
        testfruit apple = new testfruit("Apple", "Small", "Red");
        
        
        apple.changeName("Tomato");
        
        String s = apple.getName();
        System.out.println("Once again, the new name is " + s);
        

        
    }
}
