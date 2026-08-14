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
public class JL05_Operators {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        //Circle
        System.out.println("Enter Radius :");
        float r = sc.nextFloat();
        AreaOfCircle a = new AreaOfCircle(r);
        //Simple Interest
        SimpleInterest s = new SimpleInterest();
        System.out.println("Enter principle :");
        float p = sc.nextFloat();
        System.out.println("Enter Rate :");
        float rate = sc.nextFloat();
        System.out.println("Enter Time :");
        float t = sc.nextFloat();
        System.out.println("SI =" +"\u20B9"+s.interest(p,rate,t)); // unicode of ₹ is "\u20B9"
        // Compound Interest

        sc.close();
    }

}

