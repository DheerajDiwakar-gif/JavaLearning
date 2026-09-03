package JL3_Loops;
import java.util.Scanner;
public class J6_CountNumbersBetweenTwoValues {
    public static void main(String[] args) {
        int A,B,j=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First no.:");
        A = sc.nextInt();
        System.out.println("Enter First no.:");
        B = sc.nextInt();
        for(int i = A;i<B;i++){
             j++;
        }System.out.printf("Number Between %d and %d is %d !!",A,B,j-1);

    }
}
