package JL2_Condtionals;

import java.util.Scanner;

public class J4_ElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double bill = 0;
        int unit;
        System.out.println("Enter the Units :");
        unit = sc.nextInt();
        if (unit < 0) {
            System.out.println("Invalid Input !!");
        } else {

            if (unit <= 100) {
                bill = unit * 5;
            } else if (unit > 100 && unit <= 200) {
                bill = (100 * 5) + (unit - 100) * 7;
            } else if (unit > 200 && unit <= 400) {
                bill = (100 * 5) + (100 * 7) + (unit - 200) * 10;
            } else {
                bill = (100 * 5) + (100 * 7) + (200 * 10) + (unit - 400) * 15;
            }
            System.out.println("Electricity Bill = ₹" + bill);
        }
    }
}
