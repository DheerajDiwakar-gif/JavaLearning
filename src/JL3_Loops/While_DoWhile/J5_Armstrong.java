package JL3_Loops.While_DoWhile;
import java.util.Scanner;
public class J5_Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The NUMBER :");
        long n = sc.nextLong();
        long temp = n;
        long digit,sum=0;
        while(temp>0){
            digit = temp%10;
            sum = sum + (long)Math.pow(digit,3);
            //Hint: Math.pow() ka result double hota hai.
            temp = temp/10;
        }
        if (n==sum){
            System.out.println("Number is Armstrong !!");
        }else{
            System.out.println("Number is NOT Armstrong !!");
        }
    }
}
