package JL3_Loops.While_DoWhile;
import java.util.Scanner;
public class J4_TakingInput {
    public static void main(String[] args) {
        int choice;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Enter Input :");
            choice = sc.nextInt();
        }while(choice !=0);
        if(choice == 0){
            System.out.println("Loop CLOSED !!");
        }
    }
}
