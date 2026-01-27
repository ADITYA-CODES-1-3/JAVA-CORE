package Day_2;

public class Task_1 {
    public static void main(String[] args) {

        Dog d = new Dog();
        d.eat();
        d.bark();
    }
}

class Animal{

    void eat(){
        System.out.println("The Animal Eats Food !");
    }
}

class Dog extends Animal{
    void bark() {
        System.out.println("Dog Barks !");
    }
}