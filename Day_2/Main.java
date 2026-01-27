package Day_2;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Aditya";
        s1.currentYear = 2 ;

        s1.login();
        s1.Study();
        s1.Work();

        Alumni a1 = new Alumni();
        a1.login();
        a1.Work();
    }

}

class User {
    String name ;
    String email;
    String password;

    void login(){
        System.out.println("Logged in successfully !");
    }
}

class Student extends User {

    int currentYear;
    void Study(){
        System.out.println(name + "is Studying Inheritance");
    }
    void Work(){
        System.out.println("Studying is my Job !");
    }

}

class Alumni extends User {

    String CurrentCompany;
    void Work(){
        System.out.println("Coding is my Job !");
    }
}

