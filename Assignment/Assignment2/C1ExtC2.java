class C2 {
    void showC2() {
        System.out.println("This is C2");
    }
}

class C1 extends C2 {
    void showC1() {
        System.out.println("This is C1");
    }
}

public class C1ExtC2 {
    public static void main(String[] args) {
        C1 obj = new C1();

        obj.showC1();
        obj.showC2();
    }
}