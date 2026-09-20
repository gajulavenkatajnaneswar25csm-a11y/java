interface I1 {
    int a=20;

    void method1();
    
}

class C1 {
    int b=30;

    void method2() {
        System.out.println("This is method2 :");
    }
}

class main extends C1 implements I1 {
    @Override
    public void method1() {
        System.out.println("This is method1 :");
    }

    void method3() {
        System.out.println("This is method3 :");
    }
 static int add(int z, int v) {
        return z + v;
    }
}

public class interface1 {
    public static void main(String[] args) {
        main m = new main();
        m.method1();
        m.method2();
        m.method3();
        System.out.println("result : " + main.add(10, 20));
    }
    
}
