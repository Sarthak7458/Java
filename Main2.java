import java.util.Scanner;

class calculator{
    void add(int a,int b){
        System.out.println("Sum of two: " + (a + b));
    }

    void add(int a, int b, int c){
        System.out.println("Sum of three: " + (a+b+c));
    }
}

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}
class Dog extends Animal {
    @Override
    void sound(){
        System.out.println("Dog braks");
    }
}

public class Main2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("---Polymorphism Menu---");
        System.out.println("1. Method Overloading (Calculator)");
        System.out.println("2. Method Overriding (Animal/Dog)");
        System.out.println("Enter your choice");
        int choice = sc.nextInt();

        switch(choice){
            case 1:
                calculator cal = new calculator();
                cal.add(10, 20);
                cal.add(10, 20, 30);
                break;
            
            case 2:
                Animal myPet = new Dog();
                myPet.sound();
                break;

            default:
                System.out.println("Wrong Choice");
        }
        sc.close();
    }
}