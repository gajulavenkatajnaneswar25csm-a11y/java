import java.util.Scanner;

class Jrmethod {

    int factorial(int n) {
        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }

        return fact;
    }

    boolean prime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    double area(double r) {
        return Math.PI * r * r;
    }
}

public class Methods {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Jrmethod obj = new Jrmethod();

        System.out.print("Enter number for factorial: ");
        int n = sc.nextInt();
        System.out.println("Factorial = " + obj.factorial(n));

        System.out.print("Enter number to check prime: ");
        int p = sc.nextInt();

        if (obj.prime(p)) {
            System.out.println(p + " is prime");
        } else {
            System.out.println(p + " is not prime");
        }

        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Maximum = " + obj.max(a, b));

        System.out.print("Enter radius: ");
        double r = sc.nextDouble();
        System.out.println("Area of circle = " + obj.area(r));

        sc.close();
    }
}
