package org.ch04;

import org.module.Animal;
import org.module.Dog;

public class Ch04_07 {
    public static void main(String[] args) {
        // 상속관계에서는 객체 생성방법이 2가지
        Dog d=new Dog(); // 부모 클래스를 사용하지 않는 경우
        d.eat(); // 개 처럼 먹다.
        // 업케스팅(Upcasting)
        Animal d1=new Dog(); // 부모가 자식을 가리 키고 있다.
        d1.eat(); // 개 처럼 먹다.
    }

}
