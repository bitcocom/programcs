package org.ch04;

import org.module.Animal;
import org.module.Cat;
import org.module.Dog;

public class Ch04_10 {
    public static void main(String[] args) {
        //2. 다형성 배열
        // Dog, Cat을 저장할 [배열]을 생성 하시오.
        // 부모(Animal)를 사용하면 된다.?
        Animal[] ani=new Animal[2];
        ani[0]=new Dog(); // eat()
        ani[1]=new Cat(); // eat()
        /*for(Animal obj : ani){
            obj.eat(); //
        }*/
        for(int i=0;i<ani.length;i++){
            ani[i].eat();
        }
    }
}
