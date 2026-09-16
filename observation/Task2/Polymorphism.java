class Calculator {

    // Method overloading
    double calculate(double radius) {
        return Math.PI * radius * radius;
    }

    int calculate(int side) {
        return side * side;
    }

    double calculate(double length, double width) {
        return length * width;
    }
}

class Animal {

    // Method to be overridden
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {

    // Method overriding
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {

    // Method overriding
    void sound() {
        System.out.println("Cat meows");
    }
}

public class Polymorphism {

    public static void main(String[] args) {

        Calculator c = new Calculator();

        System.out.println("Area of Circle: " + c.calculate(5.0));
        System.out.println("Area of Square: " + c.calculate(6));
        System.out.println("Area of Rectangle: " + c.calculate(10.0, 5.0));

        System.out.println();

        Animal a1 = new Dog();
        Animal a2 = new Cat();

        a1.sound();
        a2.sound();
    }
}
