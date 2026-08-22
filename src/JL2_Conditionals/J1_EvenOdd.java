package JL2_Condtionals;
import java.util.Scanner;
public class J1_EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any Number :");
        int num = sc.nextInt();
        //EVEN ODD
        if((num & 1)==0){//bitwise concept here 0 represent Even and 1 for Odd
            System.out.println(num +" is EVEN number!!!");
        }else {
            System.out.println(num +" is ODD number!!!");
        }
        //POSITIVE AND NEGATIVE
        if (num >0){
            System.out.println(num +" is Positive  !!!");
        } else if (num == 0) {
            System.out.println(num +" is ZERO !!!");
        }else {
            System.out.println(num +" is negative !!!");
        }
    }

}
