package javabasic;

class Dheeraj  extends Thread{
    public void run (){
        System.out.println("Hum First!!!");
    }
}class DheerajDiwakar  extends Thread{
    public void run (){
        System.out.println("Hum Second!!!");
    }
}
public class JL_Multithreading  {
    public static void main(String[] args) {
        Dheeraj d =new Dheeraj();
        DheerajDiwakar D = new DheerajDiwakar();
        d.start();
        D.start();
    }
}
