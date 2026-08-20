package javabasic;
import java.util.Scanner;
class arithmaticOperators{
    void arithmatic(int a, int b) {
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);
    }
}
class relationalOperator{
    void relational(int a ,int b) {
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a >= b);
        System.out.println(a <= b);
        System.out.println(a == b);
        System.out.println(a != b);
    }
    }
class AreaOfCircle{
    AreaOfCircle(float r ){
        System.out.println("Radius is : "+r);
        System.out.println("Perimeter Of circle : "+(2*Math.PI*r));
        System.out.println("Area Of circle : "+(Math.PI*(Math.pow(r,2))));

    }
}
class SimpleInterest{
    float si;
    float interest(float p , float r , float t){
        si = (p*r*t)/100;
        return si;
    }
}
class CompoundInterest{
    double CI,A;//CI = compound interest and A = Total money you have at the end
    double cInterest(double p , double r , double t , double n){
        A = p*Math.pow((1+(r/n)),(n*t));
        CI = A - p;
        return A;
    }
}
class Seconds{
   Seconds(int totalSeconds){
       int hours = totalSeconds / 3600;
       int remaining = totalSeconds % 3600;
       int minutes = remaining / 60;
       int seconds = remaining % 60;
       System.out.printf("Time = %02d:%02d:%02d%n",hours, minutes, seconds);
   }
}


public class JL05_Operators {
    public static void main() {
        Scanner sc = new Scanner(System.in);
//        //Circle
//        System.out.println("Enter Radius :");
//        float r = sc.nextFloat();
//        AreaOfCircle a = new AreaOfCircle(r);
//        //Simple Interest
//        SimpleInterest s = new SimpleInterest();
//        System.out.println("Enter principle :");
//        float p = sc.nextFloat();
//        System.out.println("Enter Rate :");
//        float rate = sc.nextFloat();
//        System.out.println("Enter Time :");
//        float t = sc.nextFloat();
//        System.out.println("SI =" +"\u20B9"+s.interest(p,rate,t)); // unicode of ₹ is "\u20B9"
//        // Compound Interest
//        CompoundInterest c =new CompoundInterest();
//        System.out.println("how many times per year bank adds interest :");
//        double n = sc.nextDouble();
//        System.out.printf("Total Amount (A) = \u20B9%.2f%n", c.cInterest(p, rate, t, n));
//        System.out.printf("Compound Interest (CI) = \u20B9%.2f%n", c.CI);
        System.out.println("Enter Seconds :");
        int second = sc.nextInt();
        Seconds s = new Seconds(second);
        sc.close();
    }

}

