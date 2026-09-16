abstract class Work {

    abstract void show();
}

class Writing extends Work {

    void show() {
        System.out.println("writing");
    }
}

class Reading extends Work{

    void show() {
        System.out.println("reading");
    }
}

public class Abstractclass {
    public static void main(String[] args) {

        Work w1 = new Writing();
        Work w2 = new Reading();

        w1.show();
        w2.show();
    }
}