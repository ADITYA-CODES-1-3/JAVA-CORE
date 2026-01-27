package Day_2;

public class Task_5 {
    public static void main(String[] args) {
        Developer d = new Developer();
        d.name = "Aditya";
        d.id = 1;
        d.Salary = 50000;
        d.lang = "java";
        d.displayCommonInfo();
        d.displayDevInfo();

        Manager m = new Manager();
        m.name = "Arjun";
        m.id  = 12 ;
        m.Salary = 60000;
        m.teamSize = 5;
        m.displayCommonInfo();
        m.displayManagerInfo();
    }
}
class Employee{
    String name ;
    int id ;
    float Salary;
    void displayCommonInfo(){
        System.out.println("Name : "+name);
        System.out.println("ID : "+id);
        System.out.println("Salary : "+Salary);
    }
}
class Developer extends Employee{
    String lang;

    void displayDevInfo(){
        System.out.println("Language Used : "+lang);
    }
}
class Manager extends Employee{
    int teamSize;
    void displayManagerInfo(){
        System.out.println("TeamSize : "+teamSize);
    }
}