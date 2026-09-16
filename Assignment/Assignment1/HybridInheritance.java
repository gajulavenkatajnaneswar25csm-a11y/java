interface I1 {
    void showI1();
}

interface I2 extends I1 {
    void showI2();
}

interface I3 extends I1 {
    void showI3();
}

class c implements I2, I3 {
    public void showI1() {
        System.out.println("THIS FROM INTERFACE I1");
    }

    public void showI2() {
        System.out.println("INHERIT FROM INTERFACE I2");
    }

    public void showI3() {
        System.out.println("INHERIT FROM INTERFACE I3");
    }
    void showc(){
        System.out.println("this from class c");
    }

}

public class HybridInheritance {
    public static void main(String[] args) {
        c obj = new c();
        obj.showI1();
        obj.showI2();
        obj.showI3();
        obj.showc();
    }
}