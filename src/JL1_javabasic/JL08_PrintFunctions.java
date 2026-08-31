package JL1_javabasic;

public class JL08_PrintFunctions {
    public static void main(String[] args) {
        //print() ka kaam hai output print karna, lekin next line par nahi jaana.
        System.out.print("Hello ");
        System.out.print("World");
        //println() ka matlab basically:
        //print + next line
        System.out.println();
        System.out.println("Hello");
        System.out.println("World");
        //printf() ka use formatted output ke liye hota hai.
        //Iska sabse important benefit hai ki tum values ko specific format mein print kar sakte ho.
        int age = 21;
        System.out.printf("My age is %d",age);
        //Specifier	Use
        //%d	Integer
        //%f	Floating-point
        //%s	String
        //%c	Character
        //%b	Boolean
        //%.2f	Decimal ke baad 2 digits
        double price =123.8338298;
        System.out.printf("Price is %.2f",price);
        // Multiple value
        String name ="Dheeraj Diwakar";
        System.out.printf("My Name is %s and age %d",name,age);

    }
}
