package Day_3;

public class Main {
    public static void main(String[] args) {
        Son s = new Son();
        s.displayProperty();
    }
}

class Father{

    String land = "10 Acres(Village)";

    Father(){
        System.out.println("Father Name : Perummal");
    }

    void buildHouse(){
        System.out.println("Father's House");
    }
}

class Son extends Father{
    String land = "2 Acres(City)";
    Son(){
        super();
        System.out.println("Son's Flat ");
    }

    void buildHouse(){
        System.out.println("Son's House");
    }

    void displayProperty(){
        System.out.println("My Land : "+land);
        System.out.println("Father's Land : "+ super.land);
        buildHouse();
        super.buildHouse();
    }
}