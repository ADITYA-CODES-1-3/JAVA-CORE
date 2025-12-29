package Day_1;

import java.sql.SQLOutput;
import java.util.Scanner;

//Triangle
public class Task_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Side 1 :");
        int s1 = sc.nextInt();
        System.out.print("Enter side 2 :");
        int s2 = sc.nextInt();
        System.out.print("Enter side 3 :");
        int s3 = sc.nextInt();
        Triangle(s1,s2,s3);
    }
    static void Triangle(int a , int b , int c){
        if(a+b > c && b+c>a && a+c>b){
            System.out.println("Triangle");
        }
        else{
            System.out.println("Not a triangle");
        }
    }
}
