package org.ch04;

import org.poly2.A;
import org.poly2.B;

public class Ch04_16 {
    public static void main(String[] args) {

        A a=new A();
        print(a); // a.display()

        B b=new B();
        print(b); // b.display()
    }
    public static void print(Object obj){ // 다형성 인수
        if(obj instanceof A) { // instanceof->true, false
            ((A) obj).display();
        }else {
            ((B) obj).display();
        }
    }
    /*public static void print(B b){
        b.display();
    }*/
}
