package JL3_Loops.While_DoWhile;
import java.util.Scanner;
public class J2_ReverseTheNumber {
    public static void main(String[] args) {
        long n,r,res=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ANY number :");
        n = sc.nextLong();
        long temp = n;
        while(temp>=1){
            r = temp%10;
            res = (res*10)+r;
            temp = temp/10;
        }
        System.out.printf("The reverse of %d number is : %d",n,res);
    }
}
