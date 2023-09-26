package org.ch04;

import org.poly.Animal;
import org.poly.Cat;
import org.poly.Dog;

public class Ch04_13 {
    public static void main(String[] args) {
        //Animal ani=new Animal(); // 객체를 생성할 수 없다.
        //ani.eat();
        // *** 부모의 역할은 할 수 있다. *** =>명령내릴수가 있다.
        Animal ani=new Dog();
        ani.eat();//
        ani.move();
        ani=new Cat();
        ani.eat();//
        ani.move();
        ((Cat)ani).night();

    }
}
