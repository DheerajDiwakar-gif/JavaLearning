package JL2_Conditionals;

import java.util.Scanner;

public class J7_Discount {
    public static void main(String K[]) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            double oriPrice = 0, disPercentage = 0, disAmount = 0, finalPrice = 0;
            System.out.println("1.Self Provided Discount !!");
            System.out.println("2.Fixed Discount !!");
            System.out.println("3.EXIT");
            System.out.println("Enter Your Choice :");
            choice = sc.nextInt();
            if (choice >= 1 && choice <= 2) {
                System.out.println("Enter Original Price :");
                oriPrice = sc.nextDouble();
                if (oriPrice <= 0) {
                    System.out.println("Invalid Price !!");
                    continue;
                }
                switch (choice) {

                    case 1:
                        System.out.println("Enter Discount Percentage :");
                        disPercentage = sc.nextDouble();
                        if (disPercentage >= 0 && disPercentage < 100) {
                            disAmount = (oriPrice * disPercentage) / 100;
                            finalPrice = oriPrice - disAmount;
                        } else {
                            System.out.println(" Invalid Discount Entered !!");
                            continue;
                        }
                        break;
                    case 2:


                        if (oriPrice <= 1000) {
                            disAmount = (oriPrice * 5) / 100;
                            finalPrice = oriPrice - disAmount;
                        } else if (oriPrice > 1000 && oriPrice <= 5000) {
                            disAmount = (oriPrice * 10) / 100;
                            finalPrice = oriPrice - disAmount;
                        } else {
                            disAmount = (oriPrice * 20) / 100;
                            finalPrice = oriPrice - disAmount;
                        }
                }
                System.out.println("Final Price =₹" + finalPrice);
                System.out.println("Discount Amount =₹" + disAmount);
            } else if (choice == 3) {
                System.out.println("====Calculator Closed !!====");
            } else {
                System.out.println("====Invalid Input !!====");
            }

        } while (choice != 3);

        sc.close();
    }
}
