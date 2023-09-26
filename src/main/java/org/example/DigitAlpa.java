package org.example;
// JVM -> main Thread
public class DigitAlpa {
    public static void main(String[] args) {
        //Thread t0=Thread.currentThread();
        //System.out.println(t0.getName()); // main(main Thread)
        Runnable djob=new DigitJob(); // upcasting
        Thread t1=new Thread(djob);
        t1.start(); // run() : 1~100

        Runnable ajob=new AlpaJob(); // upcasting
        Thread t2=new Thread(ajob);
        t2.start(); // run() : A~Z

        System.out.println("시스템 종료");
    }
}
