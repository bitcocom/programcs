package org.ch04;

import org.module.Animal;
import org.module.Cat;
import org.module.Dog;

public class Ch04_08 {
    public static void main(String[] args) {
        // Dog.class, Dog.java(X)
        // Animal<---->Dog
        // Upcasting(업케스팅)
        Animal d=new Dog();
        d.eat(); // 컴파일시점 -> Animal
        // 실행시점 -> Dog : 재정의(Override), 동적바인딩
        d=new Cat();
        d.eat();// 컴파일시점 -> Animal
        // 실행시점 -> Cat : 재정의(Override), 동적바인딩
        // **다형성 : 상위클래스(1)가 동일한 메세지로 하위클래스(?)를
        // 서로 다르게 동작시키는 객체지향 원리
    }
}
