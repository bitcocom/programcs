package org.ch04;

import org.poly2.A;
import org.poly2.B;

public class Ch04_17 {
    public static void main(String[] args) {
        // A, B를 저장할 배열을 생성하세요.
        Object[] obj=new Object[2]; // 다형성 배열
        obj[0]=new A();
        obj[1]=new B();
        for(int i=0;i<obj.length;i++) {
            if(obj[i] instanceof A) {
                ((A) obj[i]).display();
            }else {
                ((B) obj[i]).display();
            }//
        }//
    }
}
