abstract class Sam {
    int a=20;

    void method1(){
        System.out.println("This is method1 :");
    }

    abstract void method2();

}

abstract class Mad extends Sam {
    int b=30;

    void method3(){
        System.out.println("This is method3 :");
    }

    abstract void method4();
}

public class Abstractclass extends Mad {
    @Override
    void method4(){
        System.out.println("This is method4 :");
    }

    @Override
    void method2() {
        System.out.println("This is method2 :");
    }

    static int add(int x, int y) {
        return x + y;
    }

    public static void main(String[] args) {
        Abstractclass ad = new Abstractclass();
        ad.method1();
        ad.method2();
        ad.method3();
        ad.method4();
        System.out.println("result : " + add(ad.a, ad.b));
    }

}