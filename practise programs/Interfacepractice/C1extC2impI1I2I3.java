interface I1 {
    void method1();
}
interface I2 {
    void method2();
}
interface I3 {
    void method3();
}
class C2 {
    void method0() {
        System.out.println("This is C2");
    }
}
class C1 extends C2 implements I1, I2, I3 {
    public void method1() {
        System.out.println("I1 method");
    }
    public void method2() {
        System.out.println("I2 method");
    }
    public void method3() {
        System.out.println("I3 method");
    }
}
public class C1extC2impI1I2I3 extends C1 {
    public static void main(String[] args) {
        C1 x = new C1();
        x.method0();
        x.method1();
        x.method2();
        x.method3();
    }
}