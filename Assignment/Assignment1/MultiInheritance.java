interface I1 {
    void showI1();
}

interface I2 {
    void showI2();
}

class C implements I1, I2 {
    public void showI1() {
        System.out.println("this inherit from interface I1");
    }

    public void showI2() {
        System.out.println("inherit from interface I2");
    }
    void showC(){
        System.out.println("this from class c");
    }
}

public class MultiInheritance {
    public static void main(String[] args) {
        C obj = new C();
        obj.showI1();
        obj.showI2();
        obj.showC();
    }
}