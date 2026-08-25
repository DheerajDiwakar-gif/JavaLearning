package JL2_Conditionals;
import java.util.Scanner;
public class J5_SalaryCalculator {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        double basicSalary,HRA,DA,TA , grossSalary;
        System.out.print("Enter Basic Salary :");
        basicSalary = sc.nextDouble();
        if(basicSalary <= 0){
            System.out.println("Invalid Salary !!");
        }
        else{
            HRA = (basicSalary*20)/100;
            DA = (basicSalary*10)/100;
            TA = (basicSalary*5)/100;
            grossSalary = basicSalary + HRA + DA + TA;
            System.out.println("Gross Salary =₹"+grossSalary);
            System.out.println("HRA =₹"+HRA);
            System.out.println("DA =₹"+DA);
            System.out.println("TA =₹"+TA);
        }
    }
}
