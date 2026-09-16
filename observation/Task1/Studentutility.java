import java.util.Scanner;

class Student {
    String name;
    int rn;
    double mark1, mark2, mark3;
    double total;

    // Constructor
    public Student() {
        this.name = "";
        this.rn = 0;
        this.mark1 = 0;
        this.mark2 = 0;
        this.mark3 = 0;
        this.total = 0;
    }

    // Calculate total marks
    double calTotal() {
        total = mark1 + mark2 + mark3;
        return total;
    }

    // Calculate percentage
    double calPercentage() {
        calTotal();
        return (total / 300) * 100;
    }

    // Display complete result
    void display() {
        System.out.println("\n===== STUDENT RESULT =====");
        System.out.println("Student Name: " + name);
        System.out.println("Student Roll Number: " + rn);
        System.out.println("Marks in 1st Subject: " + mark1);
        System.out.println("Marks in 2nd Subject: " + mark2);
        System.out.println("Marks in 3rd Subject: " + mark3);
        System.out.println("Total Marks: " + calTotal());
        System.out.println("Percentage: " + calPercentage() + "%");
    }

    // Display student information
    void studentInfo() {
        System.out.println("\n===== STUDENT DETAILS =====");
        System.out.println("Student Name: " + name);
        System.out.println("Student Roll Number: " + rn);
        System.out.println("Marks in 1st Subject: " + mark1);
        System.out.println("Marks in 2nd Subject: " + mark2);
        System.out.println("Marks in 3rd Subject: " + mark3);
    }
}

public class Studentutility {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Student obj = new Student();

        // Input student details
        System.out.print("Enter name of student: ");
        obj.name = sc.nextLine();

        System.out.print("Enter roll number: ");
        obj.rn = sc.nextInt();

        System.out.println("Enter marks of three subjects:");
        obj.mark1 = sc.nextDouble();
        obj.mark2 = sc.nextDouble();
        obj.mark3 = sc.nextDouble();

        int choice = 0;

        // Menu
        while (choice != 4) {

            System.out.println("\n===== STUDENT UTILITY PROGRAM =====");
            System.out.println("1. Print student details");
            System.out.println("2. Calculate total and percentage");
            System.out.println("3. Print result");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    obj.studentInfo();
                    break;

                case 2:
                    System.out.println("Total = " + obj.calTotal());
                    System.out.println("Percentage = " + obj.calPercentage() + "%");
                    break;

                case 3:
                    obj.display();
                    break;

                case 4:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice! Please enter 1 to 4.");
            }
        }

        sc.close();
    }
}
