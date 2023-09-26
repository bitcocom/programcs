package org.ch04;

import org.poly2.A;
import org.poly2.B;

public class Ch04_15 {
    public static void main(String[] args) {
       // A객체를 Upcasting을 이용하여 객체를생성하세요.
       Object a=new A();
        ((A)a).display(); // 나는 A이다.

       Object b=new B();
        ((B)b).display(); // 나는 B이다.
    }
}
