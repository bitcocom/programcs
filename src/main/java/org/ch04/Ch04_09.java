package org.ch04;

import org.module.Animal;
import org.module.Cat;
import org.module.Dog;

public class Ch04_09 {
    public static void main(String[] args) {
        // 1. 다형성 인수 활용
        Dog d=new Dog(); // ?
        display(d); // eat()

        Cat c=new Cat();
        display(c); // eat()

        //Hippo h=new Hippo();
        // display(h);
    }
    public static void display(Animal ani){ // 다형성 인수
        ani.eat(); // 개
    }
   /* public static void display(Cat c){
        c.eat(); // 고양이
    }*/
}
