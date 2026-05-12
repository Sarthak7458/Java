class Laptop{
    String brand;
    
    Laptop(){
        brand = "Generic";
        System.out.println("Default Laptop Created");
    }

    Laptop(String b){
        brand = b;
        System.out.println(brand + "Laptop Created");
    }

    void show() {
        System.out.println("Brand: " + brand);
    }
}

public class Main1{
    public static void main(String[] args) {
        Laptop l1 = new Laptop();
        Laptop l2 = new Laptop("HP");
        
        l1.show();
        l2.show();
    }
}