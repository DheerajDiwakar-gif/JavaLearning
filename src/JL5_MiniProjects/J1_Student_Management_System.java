package JL5_MiniProjects;

import java.util.Scanner;

class S_Details {
    String name;
    int roll_no;
    String college;
    String branch;

    void studentDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student Name :");
        name = sc.nextLine();
        System.out.println("Enter Student Roll Number :");
        roll_no = sc.nextInt();
        sc.nextLine();// ← leftover Enter consume
        System.out.println("Enter College Name :");
        college = sc.nextLine();
        System.out.println("Enter Branch Name :");
        branch = sc.nextLine();
    }
    void displayInfo(){
        System.out.println("Roll Number :"+roll_no);
        System.out.println("Name        :"+name);
        System.out.println("College     :"+college);
        System.out.println("Branch      :"+branch);

    }
}

class Marks {
    Scanner sc = new Scanner(System.in);
    float math, science, english, computer, hindi;

    void marks() {
        System.out.println("Enter Maths Marks :");
        math = sc.nextFloat();
        System.out.println("Enter English Marks :");
        english = sc.nextFloat();
        System.out.println("Enter Science Marks :");
        science = sc.nextFloat();
        System.out.println("Enter Computer Marks :");
        computer = sc.nextFloat();
        System.out.println("Enter Hindi Marks :");
        hindi = sc.nextFloat();

    }
    void displayMarks(){
        System.out.println("Maths\t\t\t\t\t"+math);
        System.out.println("Science\t\t\t\t\t"+science);
        System.out.println("English\t\t\t\t\t"+english);
        System.out.println("Computer\t\t\t\t"+computer);
        System.out.println("Hindi\t\t\t\t\t"+hindi);
    }
}

class Total {
    float total;
    Marks m;
    Total(Marks m){
        this.m = m;
    }
    void total() {
        total = m.hindi + m.english + m.computer + m.science + m.math;
        System.out.printf("Total\t\t\t: %.2f/500\n",total);
    }
}

class Percentage {
    Total t ;
    double MAX_MARKS = 500.00;
    double percent;
    Percentage(Total t){
        this.t = t;
    }
    void percentage() {
        percent = (t.total / MAX_MARKS) * 100;
        System.out.printf("Percentage\t\t: %.2f%%\n",percent);
    }
}

class Grade {
    Percentage p;
    Grade(Percentage p){
        this.p = p;
    }
    void grade() {
        if (p.percent >= 90 ) {
            System.out.println("Grade\t\t\t: A+");
        } else if (p.percent >= 80) {
            System.out.println("Grade\t\t\t: A");
        } else if (p.percent >= 70) {
            System.out.println("Grade\t\t\t: B");
        } else if (p.percent >= 60) {
            System.out.println("Grade\t\t\t: C");
        } else if (p.percent >= 50) {
            System.out.println("Grade\t\t\t: D");
        } else {
            System.out.println("Grade\t\t\t: F");
        }
    }

}

class PassFail {
    Marks m ;
    Percentage p;
    PassFail(Marks m ,Percentage p){
        this.m = m;
        this.p = p;
    }
    void passFail() {
        if (m.math >= 33 && m.science >= 33 && m.computer >= 33 && m.english >= 33 && m.hindi >= 33 && p.percent >= 33) {
            System.out.println("Result\t\t\t: PASS");
        } else {
            System.out.println("Result\t\t\t: FAIL");
        }
    }
}


public class J1_Student_Management_System {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        S_Details s = new S_Details();
        Marks m = new Marks();
        Total t = new Total(m);
        Percentage p = new Percentage(t);
        Grade g = new Grade(p);
        PassFail p1 = new PassFail(m,p);
        s.studentDetails();
        m.marks();
        System.out.println("========================================");
        System.out.println("       STUDENT MANAGEMENT SYSTEM");
        System.out.println("========================================");
        s.displayInfo();
        System.out.println("----------------------------------------");
        System.out.println("Subject\t\t\t\t\tMarks");
        System.out.println("----------------------------------------");
        m.displayMarks();
        System.out.println("----------------------------------------");
        t.total();
        p.percentage();
        g.grade();
        p1.passFail();
        System.out.println("========================================");
    }
}

//========================================
//STUDENT MANAGEMENT SYSTEM
//========================================
//
//Roll Number : 101
//Name        : Dheeraj
//College     : ABC College
//Branch      : CSE
//
//----------------------------------------
//Subject              Marks
//----------------------------------------
//Math                  90
//Science               80
//English               95
//Computer              91
//Hindi                 87
//----------------------------------------
//
//Total       : 443 / 500
//Percentage  : 88.60%
//Grade       : A
//Result      : PASS
//
//========================================