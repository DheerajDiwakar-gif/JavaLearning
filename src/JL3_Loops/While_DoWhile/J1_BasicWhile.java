package JL3_Loops.While_DoWhile;
import java.util.Scanner;
public class J1_BasicWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Last Number :");
        int n = sc.nextInt();
        int i=1;
        while(i<=n){
            System.out.println(i);
            i++;
        }
    }
}
