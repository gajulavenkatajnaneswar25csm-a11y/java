public class Throw {
    public static void main(String[] args) {

        int age = 15;

        if (age < 18) {
            throw new ArithmeticException("Age is below 18");
        }

        System.out.println("Eligible");
    }
}