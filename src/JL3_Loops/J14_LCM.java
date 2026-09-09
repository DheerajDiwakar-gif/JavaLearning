package JL3_Loops;
import java.util.Scanner;
public class J14_LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first Number :");
        int num1 = sc.nextInt();
        System.out.println("Enter Second Number :");
        int num2 = sc.nextInt();
        int m = num1*num2;
        while (num2 != 0){
            int remainder = num1 % num2;
            num1 = num2;
            num2 = remainder;
        }
        // HCF and LCM relation is = HCF(a,b)*LCM(a,b) = a*b;
        int LCM = (m)/num1;//here num1 is last second remainder before 0
        System.out.println("HCF :"+num1);
        System.out.println("LCM :"+LCM);
    }
}
