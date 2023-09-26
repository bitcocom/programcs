package org.ch04;

import org.module.Animal;
import org.module.Cat;
import org.module.Dog;

public class Ch04_11 {
    public static void main(String[] args) {
        Dog d=new Dog();
        Cat c=new Cat();
        // 배열?
        Animal[] ani={ d, c }; // 다형성 배열
        aniArray(ani); // ?????
    }
    public static void aniArray(Animal[] ani){
        for(int  i=0;i<ani.length;i++){
            ani[i].eat();
        }
    }
}
