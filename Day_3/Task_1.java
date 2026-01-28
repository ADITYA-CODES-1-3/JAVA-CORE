package Day_3;

public class Task_1 {
    public static void main(String[] args) {
        Honda h = new Honda();
        h.display();
    }
}

class Showroom{
    String cars = "General Cars";

}

class Honda extends Showroom{
    String cars = "Honda Cars";

    void display(){
        System.out.println("Child : "+cars);
        System.out.println("Parent : "+super.cars);
    }
}