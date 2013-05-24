package cashier;

public class Employee {
    
    String name;
    int age;
    int yearsWorked;

    
    public Employee(String name, int age, int yearsWorked){
        
        
        System.out.println("Our new employee is " + name + " who is " + age + " and has worked for " + yearsWorked + " years");
        
    }
    public void changeYearsWorked() {
        System.out.println(name + " has worked for us for " + yearsWorked + " years");
        this.yearsWorked = 0;
    }
        
        
    }
