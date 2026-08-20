package JL1_javabasic;

import java.util.Scanner;

class BMICalculator { // body mass index
    double BMI;

    BMICalculator(double weight, double height) {
        this.BMI = weight / Math.pow(height, 2);
    }

    void displayBMI() {
        System.out.printf("BMI : %.2f%n", this.BMI);
        if (BMI < 18.5) {
            System.out.println("Category : Underweight");
        } else if (BMI < 25) {
            System.out.println("Category : Normal Weight");
        } else if (BMI < 30) {
            System.out.println("Category : Overweight");
        } else {
            System.out.println("Category : Obese");
        }
    }
}

public class JL06_BMI {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        int choice;
        System.out.println("\n===== BMI CALCULATOR =====");
        System.out.println("1. Calculate BMI");
        System.out.println("2. Exit");
        System.out.print("Enter your choice : ");

        choice = sc.nextInt();

        switch (choice) {

            case 1:
                System.out.print("Enter weight (kg) : ");
                double weight = sc.nextDouble();

                System.out.print("Enter height (metre) : ");
                double height = sc.nextDouble();

                if (weight <= 0 || height <= 0) {
                    System.out.println("Invalid weight or height!");
                } else {
                    BMICalculator b = new BMICalculator(weight, height);
                    b.displayBMI();
                }
                break;

            case 2:
                System.out.println("Thank you! Program ended.");
                break;

            default:
                System.out.println("Invalid choice! Please try again.");
        }
    }
}
