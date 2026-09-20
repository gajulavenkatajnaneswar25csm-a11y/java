interface I1{
    void show();
    void dispaly();
}
interface I2 extends I1{
    void show();
    void play();
}
class C1 implements I2{
   public void show(){
    System.out.println("it is implements from interface");
   }
   public void dispaly(){
    System.out.println( "it is implements from I1");
   }
   public void play(){
    System.out.println("it is implements from I2");
   }
}
public class I1extI2 {

    public static void main(String[] args) {
        C1 c =new C1();
        c.show();
        c.dispaly();
        c.play();
    }
}