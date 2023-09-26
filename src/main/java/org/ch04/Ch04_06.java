package org.ch04;

import org.module.Cat;
import org.module.Dog;

public class Ch04_06 {
    public static void main(String[] args) {
        //Dog, Cat : 공통 동작
        //Dog 객체를 사용 => 객체생성(new)
        Dog d=new Dog();
        d.eat(); // ? -> 재정의(Override)

        Cat c=new Cat();
        c.eat(); // ? -> 재정의(Override)
        c.night();















    }
}
