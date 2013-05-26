package cashier;

public class Employee {
    
    private String name;
    private String cashierLogin;
    private int initialAge;
    private int yearsWorked;

    
    public Employee(String newName, int newAge, int newYearsWorked){
        
        name = newName;
        initialAge = newAge;
        yearsWorked = newYearsWorked;
        System.out.println("Our new employee is " + name + " who is " + calculateAge() + " and has worked for " + yearsWorked + " years");
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
    private void cashierUser () {
        System.out.println("Logged in as " + name);
        
       
    }
        
}
