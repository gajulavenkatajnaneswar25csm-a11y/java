import java.util.Scanner;

class Student {
    Scanner sc = new Scanner(System.in);

    void evenodd() {
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        if (n % 2 == 0) {
            System.out.println(n + " is even");
        } else {
            System.out.println(n + " is odd number");
        }
    }

    void max() {
        System.out.print("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a >= b && a >= c) {
            System.out.println(a + " is max ");
        } else if (b >= a && b >= c) {
            System.out.println(b + " is max ");
        } else {
            System.out.println(c + " is max ");
        }
    }

    void grades() {
        System.out.print("Enter percentage: ");
        int per = sc.nextInt();

        if (per >= 90 && per <= 100) {
            System.out.println("A grade");
        } else if (per >= 75) {
            System.out.println("B grade");
        } else if (per >= 50) {
            System.out.println("C grade");
        } else if (per >= 35) {
            System.out.println("D grade");
        } else {
            System.out.println("Fail");
        }
    }

    void days() {
        System.out.println("Enter number from 1-7: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Sunday");
                break;

            case 2:
                System.out.println("Monday");
                break;

            case 3:
                System.out.println("Tuesday");
                break;

            case 4:
                System.out.println("Wednesday");
                break;

            case 5:
                System.out.println("Thursday");
                break;

            case 6:
                System.out.println("Friday");
                break;

            case 7:
                System.out.println("Saturday");
                break;

            default:
                System.out.println("Invalid choice");
        }
    }
}

public class ConditionalStatements {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Student obj = new Student();

        System.out.println("1. Even or Odd");
        System.out.println("2. Largest of Three Numbers");
        System.out.println("3. Grade");
        System.out.println("4. Day of the Week");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                obj.evenodd();
                break;

            case 2:
                obj.max();
                break;

            case 3:
                obj.grades();
                break;

            case 4:
                obj.days();
                break;

            default:
                System.out.println("Invalid choice");
        }

        sc.close();
    }
}