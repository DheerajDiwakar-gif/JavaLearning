package JL2_Conditionals;

import java.lang.classfile.instruction.SwitchCase;
import java.util.Scanner;

public class J6_ProfitLoss {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        float costPrice, sellingPrice, profit, loss, profitPercentage, lossPercentage;
        System.out.println("Enter Cost Price :");
        costPrice = sc.nextFloat();
        if (costPrice <= 0) {
            System.out.println("Invalid Cost Price!!");
        }
        System.out.println("Enter Selling Price :");
        sellingPrice = sc.nextFloat();
        if (sellingPrice <= 0) {
            System.out.println("Invalid Cost Price!!");
        } else if (costPrice==sellingPrice) {
            System.out.println("No Profit , No Loss !!");
        } else {
            profit = sellingPrice - costPrice;
            loss = costPrice - sellingPrice;
            profitPercentage = (profit / costPrice) * 100;
            lossPercentage = (loss / sellingPrice) * 100;
            if (profit > 0) {
                System.out.printf("Profit = ₹%.2f%n" , profit);
                System.out.printf("Profit Percentage = %.2f%%" , profitPercentage);

            } else if (loss > 0) {
                System.out.printf("Loss = ₹%.2f%n", loss);
                System.out.printf("Loss Percentage = %.2f%%", lossPercentage);
            }
        }
        sc.close();
    }
}
