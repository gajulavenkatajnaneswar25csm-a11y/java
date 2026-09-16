import java.util.Scanner;

class Statements {

    Scanner sc = new Scanner(System.in);

    void table() {
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }

    void numbers() {
        System.out.print("Enter N value: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }

    void sum() {
        System.out.print("Enter N value: ");
        int n = sc.nextInt();

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }

        System.out.println("Sum = " + sum);
    }

    void fibonacci() {
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        int a = 0;
        int b = 1;

        System.out.print("Fibonacci Series: ");

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");

            int c = a + b;
            a = b;
            b = c;
        }

        System.out.println();
    }
}

public class Loopingstatement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

         
        Statements obj = new Statements();

        System.out.println("1. Multiplication Table");
        System.out.println("2. Display Numbers from 1 to N");
        System.out.println("3. Sum of First N Natural Numbers");
        System.out.println("4. Fibonacci Series");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {

            case 1:
                obj.table();
                break;

            case 2:
                obj.numbers();
                break;

            case 3:
                obj.sum();
                break;

            case 4:
                obj.fibonacci();
                break;

            default:
                System.out.println("Invalid choice");
        }

        sc.close();
    }
}

