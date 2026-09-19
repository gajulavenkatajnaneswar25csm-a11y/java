import java.util.Scanner;
import java.util.InputMismatchException;


public class trymultiplecatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();
        try {
            int result = a/b;
            System.out.println("Result =" + result);
        } 
        catch (ArithmeticException  ae) {
            System.out.println("Error: Division by zero is not allowed.");
             System.out.println("enter b value");
            b = sc.nextInt();
             int result = a/b;
            System.out.println("Result =" + result);
        } 
        catch (InputMismatchException ime) {
            sc.next();
            System.out.println("Error: Please enter a valid number.");
            System.out.println("enter b value");
            b = sc.nextInt();
             int result = a/b;
            System.out.println("Result = " + result);
        }
        System.out.println("Program continues after the try-catch blocks.");
        sc.close(); 
    }
}
