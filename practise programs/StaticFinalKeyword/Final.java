public class Final {
    final int rollNo;

    Final(int rollNo) {
        this.rollNo = rollNo;
    }

    void display() {
        System.out.println("Roll No: " + rollNo);
    }

    public static void main(String[] args) {
        Final s1 = new Final(211);
        Final s2 = new Final(212);

        s1.display();
        s2.display();
    }
}