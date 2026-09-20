class Student {

    String name;
    int age;

    Student(String n, int a) {
        name = n;
        age = a;
    }

    void details() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class Constructors {

    public static void main(String[] args) {

        Student s1 = new Student("Rahul", 20);
        Student s2 = new Student("Priya", 21);

        s1.details();
        s2.details();
    }
}
