package JL3_Loops;

import java.util.Scanner;

public class J17_DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new Optimize();
        System.out.println("Enter Decimal Number :");
        int num = sc.nextInt();
        int temp = num;
        int remain;
        String binary = "";
        while (temp > 0) {
            remain = temp % 2;
            binary  = remain + binary;
            temp = temp / 2;

        }
        System.out.println("Decimal Number " + num + " into BINARY :" + binary);
    }
}

class Optimize {
    Optimize() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Decimal Number :");
        int num = sc.nextInt();
        String binary = "";
        while (num > 0) {
            int remain = num % 2;
            binary = remain + binary;
            num = num / 2;
        }
        while (binary.length() < 4) {
            binary = "0" + binary;
        }
        System.out.println("Binary : " + binary);
    }
}