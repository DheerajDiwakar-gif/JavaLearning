package JL3_Loops;
import java.util.Scanner;
public class J9_StrongNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any Number :");
        int num = sc.nextInt();
        int digit,sum =0;
        int temp = num;
        if (num>0){
            while(temp>0){
                digit = temp%10;
                int fact = 1;
                for(int i = 1;i<=digit;i++){
                    fact *= i;
                }
                sum += fact;
                temp=temp/10;
            }
            //System.out.println("sum"+sum);
            if(num==sum){
                System.out.println("Number is STRONG !!");
            }else{
                System.out.println("Number is NOT STRONG !!");
            }
        }else {
            System.out.println("Enter Valid INPUT (num > 0) :");
        }
    }
}
