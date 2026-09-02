package JL3_Loops;
import java.util.Scanner;
public class J3_ReverseCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter END Point :");
        int n = sc.nextInt();
        for(int i = n;i>0;i--){
            System.out.print(i+"\n");
        }
    }
}
