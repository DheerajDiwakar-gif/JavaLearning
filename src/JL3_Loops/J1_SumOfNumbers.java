package JL3_Loops;
import java.util.Scanner;
public class J1_SumOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum=0;
        System.out.println("Enter how many natural numbers to be add :");
        int n = sc.nextInt();
        for (int i = 1 ;i<=n;i++){ // sum =n*(n+1)/2
            sum = sum +i;
        }
        System.out.println("Sum of N numbers is :"+ sum);
    }
}
