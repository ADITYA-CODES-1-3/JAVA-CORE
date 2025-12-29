package Day_1;

import java.util.Scanner;

//Login Validation
public class Task_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("---Login---");
        System.out.println("Enter your Email-Id or UserName :");
        String  id = sc.nextLine();
        System.out.println("Enter your Password :");
        String pwd = sc.nextLine();
        Verify(id,pwd);
    }
    static void Verify(String id , String pwd){
        if(id != null && pwd.length()>=8){
            System.out.println("Verified");
        }
        else{
            System.out.println("Check Your Id & Password");
        }
    }
}
