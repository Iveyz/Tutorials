package cashier;

public class Store {

    public static void main(String[] args) {
        
        
        
        Employee jeffrey = new Employee("Jeffrey", 22, 12);
       
        
        jeffrey.cashierName();
        jeffrey.cashierAge();
        jeffrey.resetYearsWorked();
        jeffrey.addYear();
        jeffrey.addYear();
        jeffrey.addYear();
        jeffrey.cashierUniform();

    }
    
    //public static String uniform = "Blue shirt and Black Pants";
    public final static String uniform = "Blue Shirt and Black Pants";
}
    

