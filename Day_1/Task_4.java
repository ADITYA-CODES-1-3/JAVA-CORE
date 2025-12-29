package Day_1;

import java.util.Scanner;

//Voting Eligibility
public class Task_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Age :");
        vote(sc);
    }
    static void vote(Scanner sc){
        int age = sc.nextInt();
        if(age>=18){
            System.out.println("Eligible to Vote");
        }
        else{
            System.out.println("Not Eligible to Vote");
        }
    }
}
