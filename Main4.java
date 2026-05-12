import java.util.Scanner;

public class Main4{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter a number to divide 100 by: ");
            int num = sc.nextInt();

            int result = 100 / num;
            System.out.println("Result: " + result);

            int[] arr= {10,20,30};
            System.out.println("Array value at index 5: " + arr[5]);

        }catch(ArithmeticException e){
            System.out.println("Error: You cannot divide by zero!");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error: You accesed an index that doesn't exist!");
        }catch(Exception e){
            System.out.println("Something else went wrong" + e);
        }finally {
            System.out.println("Cleanup: Closing the scanner.");
            sc.close();
        }

        System.out.println("Program continues running.....");
    }
}