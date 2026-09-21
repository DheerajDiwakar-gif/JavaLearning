package JL6_MethodAndArrey;

import java.security.PublicKey;
import java.util.Scanner;

public class J1_LargestNumber {
    static void largestNUm(){
        Scanner sc = new Scanner(System.in);
        System.out.println("How many number will enter :");
        int n = sc.nextInt();
        int MAX = 0;
        for(int i =0 ; i<n; i++){
            System.out.print(" Enter Number "+(i+1)+" :");
            int num = sc.nextInt();
            if(num>MAX){
                MAX = num;
            }
        }
        System.out.println("LargestNUmber is :"+ MAX);
    }
    public static void main(String[] args) {
        largestNUm();
    }
}
