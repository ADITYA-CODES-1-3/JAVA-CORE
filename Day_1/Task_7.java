package Day_1;

import java.util.Scanner;

//Bonus Calculator
public class Task_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Salary:");
        double salary = sc.nextDouble();
        Bonus(salary);
    }
    static void Bonus(double sal){
        if(sal>=50000){
            System.out.println(sal + sal*(10/100.0));
        }
        else{
            System.out.println(sal + sal*(5/100.0));
        }
    }
}
