package JL1_javabasic;
import java.util.Scanner;
public class JL07_calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do{
          System.out.println("==========CALCULATOR==========");
          System.out.println("1.Addition");
          System.out.println("2.Subtraction");
          System.out.println("3.Multiplication");
          System.out.println("4.Division");
          System.out.println("5.Modulus");
          System.out.println("6.EXIT");
          System.out.println("Enter Your Choice :");
          choice = sc.nextInt();
          if (choice>=1 && choice<=5){
              System.out.println("Enter how many numbers :");
              int n = sc.nextInt();
              if (n<=0){
                  System.out.println("Counting of numbers must be greater then 0");
                  continue;
              }
              System.out.println("Enter First num :");
              double num1 = sc.nextDouble();
              for(int i = 2;i<=n;i++){
                  System.out.println("Enter number "+ i +":");
                  double num =sc.nextDouble();
                  switch(choice){
                      case 1:num1 = num1+num;
                            break;
                      case 2:num1 = num1-num;
                          break;
                      case 3:num1 = num1*num;
                          break;
                      case 4:
                          if (num ==0){
                              System.out.println("Error : Divide by ZERO error!!");
                              num1=0;
                              i=n;
                          }else {
                              num1 = num1/num;
                          }
                          break;
                      case 5:
                          if (num==0) {
                              System.out.println("ERROR : Does  not calculate modulus !!");
                              num1 = 0;
                              i = n;
                          }else {
                              num1 = num1%num;
                          }
                          break;
                  }
              }
                System.out.println("Result :"+num1);
          } else if (choice==6) {
              System.out.println("====Calculator closed====");
          }else{
              System.out.println("====Invalid Input====");
          }
        }while (choice !=6);
        sc.close();
    }
}
