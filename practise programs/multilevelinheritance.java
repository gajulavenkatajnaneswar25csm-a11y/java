class A {
int x=10;

    void add(){
        System.out.println("add :" + (x+20));
    }
    
}

class B extends A {
int y=50;

    void sub(){
        System.out.println("sub :" + (y-30));
    }
    
}

class C extends B {
 
    
}


public class Multilevelinheritance {
    public static void main(String[] args) {
        
    }
}
