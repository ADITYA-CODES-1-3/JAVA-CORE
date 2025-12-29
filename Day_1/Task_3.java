package Day_1;
//Largest of Two Numbers
import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a , b ;
        System.out.println("Enter Number 1:");
        a = sc.nextInt();
        System.out.println("Enter Number 2:");
        b = sc.nextInt();
        largest(a,b);
    }
    static void largest(int a , int b){
        if(a>b){
            System.out.println("A is Largest");
        }
        else if(a<b){
            System.out.println("B is Largest");
        }
        else{
            System.out.println("Both are Equal");
        }
    }
}
