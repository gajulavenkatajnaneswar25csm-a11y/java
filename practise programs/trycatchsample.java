public class trycatchsample {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            int result;
            result = a/b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }
        System.out.println("Program continues after the try-catch block.");
    }
}
