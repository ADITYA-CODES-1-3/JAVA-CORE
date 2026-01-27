package Day_2;

public class Task_3 {
    public static void main(String[] args) {
        SportsCar sc = new SportsCar();
        sc.turnOnAC();
        sc.startEngine();
        sc.activateTurbo();
    }
}
class Vehicle{
    void startEngine(){
        System.out.println("Engine Started !");
    }
}
class Car extends Vehicle{
    void turnOnAC(){
        System.out.println("AC ON !");
    }
}
class SportsCar extends Car{
    void activateTurbo(){
        System.out.println("Turbo Charged !");
    }
}