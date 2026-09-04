package JL3_Loops;
import java.util.Scanner;
public class J7_Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ANY number :");
        int num = sc.nextInt();
        System.out.println("Factor of "+num+" is :");
        int count = 0;
        for (int i = 1; i * i <= num; i++) {
            if (num % i == 0) {
                System.out.printf("%d * ",i);
                count++;
                if (i != num / i) {
                    System.out.println(num / i);
                    count++;
                }
            }
        }
        System.out.println("\nTotal factor of the "+num+" is :"+count+" factors");
    }
}
