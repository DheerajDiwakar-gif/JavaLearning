package JL4_Patterns;
import java.util.Scanner;
public class J1_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i<5;i++){
            for (int j =4-i;j<5;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
