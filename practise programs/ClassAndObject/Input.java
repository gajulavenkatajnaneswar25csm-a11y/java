import java.util.Scanner;
public class Input{
    void sample(){
        int x;
        System.out.print("enter value of x :");
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        Input y = new Input();
        y.sample();
        int x = sc.nextInt();
        System.out.println("input x is :"+x);
        sc.close();
    }

}