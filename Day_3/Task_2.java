package Day_3;

public class Task_2 {
    public static void main(String[] args) {
        Manager m = new Manager("Aditya",80000,10000);
        m.displayDetails();
    }
}
class Employee{
    String name;
    float salary;

    Employee(String name,float salary){
        this.name = name;
        this.salary = salary;
        System.out.println("Parent: Data Set Successfully.");
    }
}
class Manager extends Employee {
        double bonus;

    Manager(String name, float salary,double bonus) {
        super(name, salary);
        this.bonus = bonus;
        System.out.println("Child : Bonus Set Successfully ");
    }

    void displayDetails(){
        System.out.println("--- Employee Details ---");
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Income: " + (salary + bonus));
    }
}