// Parent class
class A {
    void main1() {
        System.out.println("successfully inherited");
    }
}

// Child class
class B extends A {
    void main2() {
        System.out.println("this is class b");
    }
}

// Main class
public class SingleInheritance {
    public static void main(String[] args) {
        B d = new B();

        d.main1();   // Inherited method
        d.main2();  // Child class method
    }
}