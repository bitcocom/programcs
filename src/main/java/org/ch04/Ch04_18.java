package org.ch04;

import org.poly2.A;
import org.poly2.B;

public class Ch04_18 {
    public static void main(String[] args) {
        A a=new A();
        B b=new B();
        Object[] obj={a, b};
        print(obj);
    }
    public static void print(Object[] obj){
        for(int i=0;i<obj.length;i++) {
            if(obj[i] instanceof A) {
                ((A) obj[i]).display();
            }else {
                ((B) obj[i]).display();
            }//
        }//
    }
}
