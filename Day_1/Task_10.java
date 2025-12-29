package Day_1;

import java.util.Scanner;

public class Task_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Age :");
        int age = sc.nextInt();
        System.out.println("Do You Have Voter ID:");
        boolean hasId = sc.nextBoolean();
        System.out.println("Are You a Indian:");
        boolean iscitizen = sc.nextBoolean();
        access(age,hasId,iscitizen);

    }
    static void access(int age , boolean id , boolean  ctz){
        if(age>=18 && id && ctz){
            System.out.println("Access Granted !");
        }
        else{
            System.out.println("Access Denied !");
        }
    }
}
