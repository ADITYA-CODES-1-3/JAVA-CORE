package Day_2;

public class Task_2 {
    public static void main(String[] args) {
        Circle C = new Circle();
        C.calculateArea(3,4);
        C.calculateArea(3);
    }
}
class Shape{
    float area;
}

class Rectangle extends Shape{

    void calculateArea(int l , int b){
        area = l * b ;
        System.out.println("Rectangle Area is : "+ area);
    }
}

class Circle extends Rectangle{

    void calculateArea(float r){
        area = r*r;
        System.out.println("Circle Area is : "+ area);
    }
}