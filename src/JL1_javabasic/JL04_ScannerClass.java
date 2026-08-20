package JL1_javabasic;
import java.util.Scanner;
public class JL04_ScannerClass {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Integer");
        int i =sc.nextInt();
        System.out.println("Enter a Long");
        long l = sc.nextLong();
        System.out.println("Enter a Float");
        float f = sc.nextFloat();
        System.out.println("Enter a Double");
        double d = sc.nextDouble();
        System.out.println("Enter a Boolean");
        boolean b = sc.nextBoolean();
        System.out.println("Enter a one word/String");
        String s = sc.next();
        sc.nextLine(); // consume leftover Enter(Above line \n consume)
        System.out.println("Enter a Complete Line /String");
        String s1= sc.nextLine();
        System.out.println("Enter a Character");
        char c= sc.next().charAt(0);
        System.out.println("Int = "+i);
        System.out.println("Long = "+l);
        System.out.println("Float = "+f);
        System.out.println("Double = "+d);
        System.out.println("Boolean = "+b);
        System.out.println("One word or string = "+s);
        System.out.println("Complete line/String = "+s1);
        System.out.println("Character = "+c);

    sc.close();
    }
}
