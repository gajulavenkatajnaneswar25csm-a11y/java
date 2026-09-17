interface I1{
    int x=20;
    void dispaly();
}
class A{
    int y=30;
    void show(){
        System.out.println("it is from class a");
    }
}
class B extends A implements I1{
  public  void dispaly(){
    System.out.println("jai hind");
    System.out.println(x);

    }
    void play(){
        System.out.println("class b");
    }
}
public class C1extC2impI1 {

    public static void main(String[] args) {
        B obj=new B();
        obj.dispaly();
        obj.play();
        System.out.println(obj.x);
    }
}