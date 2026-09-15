package JL3_Loops;

import java.util.Scanner;

public class J18_BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Binary Form :");
        int bin = sc.nextInt();
        int power =1,digit,decimal = 0;
        while(bin>0){
            digit = bin % 10;
            if (digit != 0 && digit != 1) {
                System.out.println("IT is NOT binary Number !!!");
                return;
            }
            decimal += digit * power;
            bin = bin /10;
            power *=2;
        }System.out.println("Binary number into decimal is :"+decimal);
    }
}
