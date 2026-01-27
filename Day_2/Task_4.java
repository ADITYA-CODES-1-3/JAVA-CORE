package Day_2;

public class Task_4 {
    public static void main(String[] args) {
    SBI sbi = new SBI();
    HDFC hdfc = new HDFC();
    System.out.println("SBI Rate : "+sbi.getInterestRate());
    System.out.println("HDFC Rate : "+hdfc.getInterestRate());

    }
}

class Bank{
    int getInterestRate(){
        return 5;
    }
}

class SBI extends Bank{
    int getInterestRate(){
        return 7;
    }
}
class HDFC extends Bank{

    int getInterestRate(){
        return 8;
    }
}
