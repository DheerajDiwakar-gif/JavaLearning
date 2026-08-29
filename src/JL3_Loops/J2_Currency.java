package JL3_Loops;

import java.util.Scanner;

public class J2_Currency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        double amount, result;
        // Fixed exchange rates
        double USD_TO_INR = 88.00;
        double EUR_TO_INR = 104.00;
        double GBP_TO_INR = 120.00;

        do {

            System.out.println("\n========== CURRENCY CONVERTER ==========");
            System.out.println("1. USD -> INR");
            System.out.println("2. INR -> USD");
            System.out.println("3. EUR -> INR");
            System.out.println("4. INR -> EUR");
            System.out.println("5. GBP -> INR");
            System.out.println("6. INR -> GBP");
            System.out.println("7. EXIT");
            System.out.println("========================================");

            System.out.print("Enter Your Choice: ");
            choice = sc.nextInt();

            if (choice >= 1 && choice <= 6) {

                System.out.print("Enter Amount: ");
                amount = sc.nextDouble();

                if (amount <= 0) {
                    System.out.println("Invalid Amount !!");
                    continue;
                }

                switch (choice) {

                    case 1:
                        result = amount * USD_TO_INR;
                        System.out.printf("%.2f USD = %.2f INR%n",
                                amount, result);
                        break;

                    case 2:
                        result = amount / USD_TO_INR;
                        System.out.printf("%.2f INR = %.2f USD%n",
                                amount, result);
                        break;

                    case 3:
                        result = amount * EUR_TO_INR;
                        System.out.printf("%.2f EUR = %.2f INR%n",
                                amount, result);
                        break;

                    case 4:
                        result = amount / EUR_TO_INR;
                        System.out.printf("%.2f INR = %.2f EUR%n",
                                amount, result);
                        break;

                    case 5:
                        result = amount * GBP_TO_INR;
                        System.out.printf("%.2f GBP = %.2f INR%n",
                                amount, result);
                        break;

                    case 6:
                        result = amount / GBP_TO_INR;
                        System.out.printf("%.2f INR = %.2f GBP%n",
                                amount, result);
                        break;
                }

            } else if (choice == 7) {

                System.out.println("==== Currency Converter Closed !! ====");

            } else {

                System.out.println("==== Invalid Choice !! ====");
            }

        } while (choice != 7);

        sc.close();
    }
}

