package org.module;

public class Dog extends  Animal{
    public Dog(){
        super(); // -> new Animal();
    }
    // 먹다
    public void eat(){
        System.out.println("개 처럼 먹다.");
    }
}
