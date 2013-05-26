package cashier;

public class Employee {
    
    private String name;
    private int initialAge;
    private int yearsWorked;
    private String hairColor;
    private String jeffreyHeightFeet;
    private String jeffreyHeightInches;
    public static String uniform;
    
    public Employee(String newName, int newAge, int newYearsWorked){
        
        name = newName;
        initialAge = newAge;
        yearsWorked = newYearsWorked;
        System.out.println("Our new employee is " + name + " who is " + calculateAge() + " and has worked for " + yearsWorked + " years, has " + cashierHairColor() + " hair, is " + cashierHeight() + " tall and logs in as " + cashierLogin() );
        int a = calculateAge();
        
    }
    
    public void cashierName() {
        System.out.println("Our cashiers name is " + name);
    }
    public void cashierAge() {
        System.out.println("He is " + calculateAge() + " years old.");
        
    }
    public void resetYearsWorked() {
        yearsWorked = 0;
        System.out.println(name + " been reset to " + yearsWorked + " years");
    }
    public void addYear() {
        yearsWorked++;
        System.out.println(name + " has now worked for us for " + yearsWorked + " years.");
        calculateAge();
    }
        
    private int calculateAge(){
        
        int currentAge = initialAge + yearsWorked;
        return currentAge;  
    }
    private String cashierLogin() {
        return name + " the Cashier";
    }
    private String cashierHairColor() {
        hairColor = "blue";
        return hairColor;
    }
    private String cashierHeight() {
        jeffreyHeightFeet = "6 feet";
        jeffreyHeightInches = "2 inches";
        return jeffreyHeightFeet + " " + jeffreyHeightInches;
    }
    public void cashierUniform() {
        //uniform = uniformNew;
        System.out.println(name + " is wearing " + Store.uniform);
    }
        
}
