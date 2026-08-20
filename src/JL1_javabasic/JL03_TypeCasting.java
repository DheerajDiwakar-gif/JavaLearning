package JL1_javabasic;

public class JL03_TypeCasting {
    //primitive casting  a)Widening b)Narrowing
    //a)Widening = smaller to larger (it is generally Automatic)
    //byte->short->int->long->float->double
    //b)Narrowing = larger into smaller(it is convert forcefully )
    //double->float->long->int->short->byte
    //Reference casting a) Upcasting  b) Downcasting
    //a) Upcasting = Child → Parent (Usually automatic).
    public static void main(String[] args){
        Widening w = new Widening();
        new Narrowing();
        Dog d =new Dog();
        // the referance class determine which method can be called and object decide which method can be overriden
        Animal a =d;
        a.sound(); //Upcasting
//      Downcasting = Parent Reference to Child Reference
        Animal a1 = new Dog();
        Dog d1 = (Dog) a1;
        d1.bark();
        d1.sound();
    }

}
class Widening{
    Widening() {
        byte b = 10;
        short s = b;
        int i = s;
        long l = i;
        float f = l;
        double d = f;

        System.out.println("byte = " + b + '\n' + "short =" + s + '\n' + "int =" + i);
        System.out.println("long = " + l + '\n' + "float =" + f + '\n' + "double =" + d);
    }
}
class Narrowing{
    Narrowing(){
        double d = 1000000000000000.00;
        long l = (long)d;
        float f = (float)l;
        int i = (int)l;
        short s =(short) i;
        byte b = (byte)s;
        System.out.println("byte = " + b + '\n' + "short =" + s + '\n' + "int =" + i);
        System.out.println("long = " + l + '\n' + "float =" + f + '\n' + "double =" + d);
    }
}
class Animal {
    void sound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}
