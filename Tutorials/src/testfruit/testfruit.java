package testfruit;

public class testfruit {
    
    String name;
    String size;
    String color;

    
    public testfruit(String newName, String newSize, String newColor){
        
        name = newName;
        size = newSize;
        color = newColor;
        System.out.println("We just created a new fruit called " + name + " with size = " + size + " and color = " + color);  
    }
    public void changeName(String s){
        
        System.out.println("The fruit " + name + " has been renamed to " + s);
        name = s;
        
        
    }
    

    
    public String getName(){
        
        return name;
        
    }
  
}
