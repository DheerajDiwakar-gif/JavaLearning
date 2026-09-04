package JL3_Loops.While_DoWhile;

import java.util.Scanner;

public class J6_PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ANY NUMBER :");
        int num = sc.nextInt();
        int limit = (int) Math.sqrt(num);
        boolean isprime = true;
        if (num > 1) {
            for (int i = 2; i <= limit; i++) {
                if (num % i == 0) {
                    isprime = false;
                    break;
                }
            }
            if (isprime) {
                System.out.println("!!  PRIME NUMBER !!");
            } else {
                System.out.println("!! Not a PRIME NUMBER !!");
            }
        }else{
            System.out.println("!! Not a PRIME NUMBER !!");
        }
    }
}
