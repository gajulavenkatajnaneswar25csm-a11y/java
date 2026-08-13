interface I1 {
   int a=20;

    void method1();
    
}

interface I2 {
    int b=30;

    void method2();
    
}

class Chid implements I1, I2 {
    @Override
    public void method1() {
        System.out.println("This is method1 :");
    }

    @Override
    public void method2() {
        System.out.println("This is method2 :");
    }

    void method3() {
        System.out.println("This is method3 :");
    }

    static int add(int x, int y) {
        return x + y;
    }
}

public class Interface extends Chid {
    public static void main(String[] args) {
        Chid ch = new Chid();
        ch.method1();
        ch.method2();
        ch.method3();
        System.out.println("result : " + add(I1.a, I2.b));
    }
}
