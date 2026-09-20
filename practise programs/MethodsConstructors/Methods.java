public class Methods {
    static void greet() {
        System.out.println("Hello, World!");
    }
    static void add(int a, int b) {
        System.out.println("Sum = " + (a + b));
    }
    static int multiply(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        greet();

        add(10, 20);

        int result = multiply(5, 4);
        System.out.println("Product = " + result);
    }
}
