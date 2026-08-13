package javabasic;

import java.util.Scanner;

class Swaping3rd {
    void logic(int a, int b) {
        System.out.println("Number Before Swap" + '\n' + "A = " + a + '\n' + "B = " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Number after Swap" + '\n' + "A = " + a + '\n' + "B = " + b);
    }
}

class SwapingWithoutVar {
    void logic1(int a, int b) {
        System.out.println("Number Before Swap" + '\n' + "A = " + a + '\n' + "B = " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("Number after Swap" + '\n' + "A = " + a + '\n' + "B = " + b);
    }
}

class AsciiOfChar {
    AsciiOfChar(String S) {
        System.out.println("String is ="+S);
        for (int j = 0;j<S.length();j++){
            int i = (int)S.charAt(j);
            System.out.println("ASCII of Char at postion "+j+" with character  " + S.charAt(j) + " = " + i);
        }
    }
}
class MiniChallenge{
    String Name,College, Branch;
    int Age;
    float CGPA;
    MiniChallenge(String Name,int Age ,String College,String Branch,float CGPA){
        this.Name = Name;
        this.Age = Age;
        this.College = College;
        this.Branch = Branch;
        this.CGPA = CGPA;
        System.out.println("Name :"+this.Name);
        System.out.println("Age :"+this.Age);
        System.out.println("College :"+this.College);
        System.out.println("Branch :"+this.Branch);
        System.out.println("CGPA :"+this.CGPA);
    }

}
public class JL03_coding {
    public static void main(String[] args) {
        Swaping3rd s = new Swaping3rd();
        SwapingWithoutVar s1 = new SwapingWithoutVar();
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the First no. =");
//        int a = sc.nextInt();
//        System.out.println("Enter the Second no. =");
//        int b = sc.nextInt();
        System.out.println("Enter the Character =");
        //char ch = sc.next().charAt(0); // here the sc.next take "A" as a String ,
        // and .charAt(0) takes the First character of String 'A'
        //s.logic(a,b);
        //s1.logic1(a,b);
        String S = sc.next();
        new AsciiOfChar(S);
        new MiniChallenge("Dheeraj",25,"MPCPS Kanpur","BCA",8.79f);

        sc.close();
    }
}
