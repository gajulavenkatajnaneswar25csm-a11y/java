interface I1{
    int x=211;
    void dispaly();
}
interface I2{
    int y=230;
    void play();
}
interface I3{
    int z=255;
    void show();
}

class A implements I1,I2,I3{
public void dispaly(){
    System.out.println(x + "is from I1");
}
public void play(){
    System.out.println(y + "is from I2");
}
public void show(){
    System.out.println(z + "is from I3");
}
}

public class Mutlipleinheritance {
    public static void main(String[] args) {
        A obj=new A();
        obj.dispaly();
        obj.play();
        obj.show();
    }

    
}