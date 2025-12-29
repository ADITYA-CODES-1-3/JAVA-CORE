package Day_1;

import java.util.Scanner;

//Grade Calculator
public class Task_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Mark Obtained :");
        int mark = sc.nextInt();
        Grade(mark);
    }
    static void Grade(int mark){
        if(mark>=90 && mark<=100){
            System.out.println("A");
        }
        else if(mark>=75 && mark<100){
            System.out.println("B");
        }
        else if (mark>=50 && mark<100) {
            System.out.println("C");
        }
        else {
            System.out.println("Fail");
        }
    }
}
