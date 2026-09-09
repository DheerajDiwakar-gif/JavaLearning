package JL3_Loops;
import java.util.Scanner;
public class J13_GCD_HCF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first Number :");
        int num1 = sc.nextInt();
        System.out.println("Enter Second Number :");
        int num2 = sc.nextInt();
        int gcd = 1;
        for(int i = 1; i <= num1 && i <= num2; i++) {//condition : i<= Math.min(num1,num2)
            if(num1 % i == 0 && num2 % i == 0) {
                gcd = i;
            }
        }
        System.out.println("GCD: " + gcd);
    //Euclidean algorithm  (optimized)
        //       Complexity :
//        Factor method       → O(min(a,b))
//        Euclidean Algorithm → O(log(min(a,b)))
        while (num2 != 0) {
            int remainder = num1 % num2;

            num1 = num2;
            num2 = remainder;
        }
        System.out.println("GCD: " + num1);
    }
}
