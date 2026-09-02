package JL3_Loops;
import java.util.Scanner;
public class J4_EvenNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter END Point :");
        int n = sc.nextInt();
        for(int i=0;i<n;i=i+2) {
            System.out.println(i);
        }
    }
}
