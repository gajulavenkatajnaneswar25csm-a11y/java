import java.util.Scanner;
public class TwoDimensionalArray {
    public static void main(String[] args) {

    int arry[][] = new int[2][2];
    int i,j;
    Scanner sc=new Scanner(System.in);

    System.out.print("enetr values in array :");

    for(i=0;i<arry.length;i++){
        for (j=0;j<arry[i].length;j++){
            arry[i][j]=sc.nextInt();
        }
    }
System.out.println("printing values in array :");
for(i=0;i<arry.length;i++){
        for (j=0;j<arry.length;j++){
            System.out.print(arry[i][j] + "   ");
        }
        System.out.println();
    }
    sc.close();
    }   
}