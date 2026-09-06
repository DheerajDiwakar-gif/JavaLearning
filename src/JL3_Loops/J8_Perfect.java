package JL3_Loops;
import java.util.Scanner;
public class J8_Perfect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ANY number :");
        int num = sc.nextInt();
        int temp = num;
        System.out.println("Factor of " + num + " is :");
        int count = 0, sum = 0;
        for (int i = 1; i * i <= temp; i++) {//condition is same as ROOT of num
            if (temp % i == 0) {
                System.out.printf("%d * ", i);
                count++;
                sum += i;
                if (i > 1 && i != temp / i) {
                    System.out.println(temp / i);
                    count++;
                    sum += (temp / i);
                }
            }
        }
        System.out.println("\nTotal factor of the " + num + " is :" + count + " factors");
        //System.out.println("sum" + sum);
        if (sum == num) {
            System.out.println("Number is PERFECT !!");
        } else {
            System.out.println("Number is nOT PERFECT !!");
        }
    }
}


