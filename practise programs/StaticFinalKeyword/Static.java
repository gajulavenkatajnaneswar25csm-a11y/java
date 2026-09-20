public class Static {

    String name;
    static String college = "ANITS";

    // Constructor
    Static(String name) {
        this.name = name;
    }

    // Non-static method
    void display() {
        System.out.println(name + " - " + college);
    }

    public static void main(String[] args) {

        Static s1 = new Static("venkat");
        Static s2 = new Static("Rahul");

        s1.display();
        s2.display();

        // Changing static variable
        Static.college = "AU";

        s1.display();
        s2.display();
    }
}
