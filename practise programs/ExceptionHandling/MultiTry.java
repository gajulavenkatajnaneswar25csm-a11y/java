import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiTry {

    public static void main(String[] args) {
        int a=0, b=0;
        Scanner sc = new Scanner(System.in);
        
        try {
            System.out.print("enter values of a :");
            a = sc.nextInt();

            System.out.print("enter value of b :");
            b = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("give only integers to a and b");
        }

        try {
            int k = a / b;
            System.out.println(k);
        }catch (ArithmeticException e) {
            System.out.println("give value of b is not equal to zero");
        }

        System.out.println("done");
        sc.close();

    }
}