package org.ch04;

import org.module.Animal;
import org.module.Cat;

public class Ch04_12 {
    public static void main(String[] args) {
       /* Cat c=new Cat();
        c.eat(); // 고양이 처럼 먹다.
        c.night();// 밤에 눌에서 빛이 난다*/
        // *** Object Casting(객체형 변환) ***
        Animal ani=new Cat(); // Upcasting
        ani.eat();
        //ani.night(); // X -> Downcasting
        //Cat c=(Cat)ani; //  Downcasting
        ((Cat)ani).night(); //밤에 눌에서 빛이 난다
    }
}
