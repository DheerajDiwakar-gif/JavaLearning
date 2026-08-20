package JL1_javabasic;
class local_var{
    int n=4;
    void show(){
        int d=6;
        System.out.println("local variable is ="+d);
    }
}
class instance_var{
    String name ;
    int roll_no;
    instance_var(String name , int roll_no){
        this.name=name;
        this.roll_no=roll_no;
    }
    void display(){
        System.out.println(name+" having roll number is "+roll_no);
    }
}
class  static_var{
    String name;
    static String college ="MPCPS Kanpur";
    static_var(String n ){
        this.name =n;
    }
    void display(){
        System.out.println(name+" Studies in "+college);
    }
}
public class JL02_variables_datatypes {
    public static void main(String []k){
        local_var ob = new local_var();
        instance_var ob2= new instance_var("Dheeraj Diwakar",1546);
        static_var ob3 = new static_var("Shlok");
        ob.show();
        ob2.display();
        ob3.display();
//        int num =8;
//        float si = 5.5f;
//        char a='A';
//        boolean t=true;
//        String s ="Dheeraj Diwakar";
//        JL02_variables_datatypes obj =new JL02_variables_datatypes();
//        System.out.println("Num is ="+num);
//        System.out.println("interest is ="+si);
//        System.out.println("char is ="+a);
//        System.out.println("Dheeraj is ="+t);
//        System.out.println("My name is ="+s);
//        obj.show();
//        //System.out.println("inside b is ="+b); ERROR TO ACCESS b
//    }
//    void show(){
//        int b=10; // Local Variable
//        System.out.println("inside b is ="+b);
    }
}


