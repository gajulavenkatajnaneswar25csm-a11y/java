class A {
    int x = 67;

    void display() {
        System.out.println("Parent method");
    }
}

class SuperVsThis extends A {
    int x = 69;

    void display() {
        System.out.println("Child method");
    }

    void show() {
        System.out.println("Child variable: " + this.x);
        System.out.println("Parent variable: " + super.x);

        this.display();
        super.display();
    }

    public static void main(String[] args) {
        SuperVsThis c = new SuperVsThis();
        c.show();
    }
}