package Day_1;
//Positive,Negative,Zero
import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check Positive,Negative,Zero :");
        int num = sc.nextInt();
        System.out.println(poz(num));
    }
    static  String poz(int num){
        String res;
        if(num>0){
            return "Positive";
        }
        else if(num<0) {
            return "Negative";
        }
        else{
            return "Zero";
        }
    }
}
