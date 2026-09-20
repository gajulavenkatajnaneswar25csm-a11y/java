class parent {

    int sum(int x, int y, int z) {
        return x + y + z;
    }

    float sum(float x, int y, int z) {
        return x + y + z;
    }
}

class child extends parent {

    int sum(int x, int y) {
        return x + y;
    }
    void play(){
        System.out.println(super.sum(10,20,30));
        System.out.println(super.sum(10.5f,20,20));
    }

}

public class Overload {

    public static void main(String[] args) {

        child obj = new child();

        int result = obj.sum(10, 20);
        obj.play();


        System.out.println(result);
    }
}