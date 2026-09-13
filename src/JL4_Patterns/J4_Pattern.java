package JL4_Patterns;

import java.util.Scanner;

public class J4_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < 5-i; j++) {
                System.out.print("  ");
            }for(int k = 0 ;k <i;k++ ){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}

//                 *
//                 * *
//                 * * *
//                 * * * *
//                 * * * * *
