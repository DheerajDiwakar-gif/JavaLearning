package JL3_Loops;

import java.util.Scanner;

public class J15_PowerOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter NUMBER :");
        int num = sc.nextInt();
        System.out.println("Enter POWER :");
        int pow = sc.nextInt();
        double result = 1;
        if (pow >= 0) {
            for (int i = 1; i <= pow; i++) {
                result = result * num;
            }
            System.out.println(num + " Power " + pow + " is : " + result);
        } else if (num == 0) {
            System.out.println("Result is : Undefined");
            System.out.println("0 cannot have a negative power !!");
        } else {
            for (int i = pow; i < 0; i++) {
                result = result / num;
            }
            System.out.println(num + " Power " + pow + " is : " + result);
        }

    }
}
//Complexity : O(|pow|)

