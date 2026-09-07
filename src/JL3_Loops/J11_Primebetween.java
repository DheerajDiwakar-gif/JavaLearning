package JL3_Loops;
import  java.util.Scanner;
public class J11_Primebetween {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Prime numbers between num1  to num2:");
        System.out.println("Enter numbers num1 :");
        int num1 = sc.nextInt();
        System.out.println("Enter numbers num2:");
        int num2 = sc.nextInt();
        for (int j = num1 ; j <= num2; j++) {
            if (j < 2) {
                System.out.println("!! Invalid NUM1 !! :"+j);
                continue;
            }

            boolean isPrime = true;
            int limit = (int) Math.sqrt(j);

            for (int i = 2; i <= limit; i++) {

                if (j % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(j + " ");
            }
        }
    }
}
