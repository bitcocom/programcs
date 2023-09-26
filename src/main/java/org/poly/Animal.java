package org.poly;
// 추상클래스(불완전한 객체) => 객체를 생성할 수 없다.
public abstract class Animal {
   // 추상메서드(불완전한 메서드)
   public abstract void eat(); // 메서드의 머리(Head)
   public void move(){ // 공통동작 => 구현메서드
       System.out.println("무리를 지어서 이동한다.");
   }
}
