package JL3_Loops;

import java.util.Scanner;

public class J16_PowerOfNum2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter NUMBER :");
        int num = sc.nextInt();
        System.out.println("Enter POWER :");
        int pow = sc.nextInt();
        boolean negative = false;
        double result = 1;
        if (pow < 0) {
            negative = true;
            pow = -pow;
        }
        // 0 raised to a negative power is undefined
        if (num == 0 && negative) {
            System.out.println("Result : Undefined !!");
            return;
        }
        while (pow > 0) {
            if (pow % 2 != 0) {
                result *= num;
            }
            num *= num;
            pow /= 2;
        }
        if (negative) {
            result = 1 / result;
        }
        System.out.println("Result : " + result);
    }
}

//Time complexity O(log |pow|) instead of O(|pow|).