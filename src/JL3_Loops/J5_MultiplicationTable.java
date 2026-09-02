package JL3_Loops;
import java.util.Scanner;
public class J5_MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number which table you want :");
        int n = sc.nextInt();
        //int m = 1;
        for (int i = 1;i<=10;i=i+1){
            System.out.println(i*n);
        }

    }
}
