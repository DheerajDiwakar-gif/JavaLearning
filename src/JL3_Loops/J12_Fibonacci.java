package JL3_Loops;
import java.util.Scanner;
public class J12_Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how may number to be print :");
        int limit = sc.nextInt();
        int a = 0, b = 1;
        for (int i = 0; i < limit; i++) {
            System.out.println(a);
            int next = a + b;
            a = b;
            b = next;
        }
    }
}
//Complexity :
//Time  → O(n)
//Space → O(1)