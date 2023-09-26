package org.ch03;

public class Ch03_18 {
    public static void main(String[] args) {
        // 조건문, 선택문, 반복문, 제어문
        // 선택문 : switch ~ case : 메뉴 만들때
        /*
          switch(값){
            case 값1 :
              실행문장;
              break;
            case 값2 :
              실행문장;
              break;
            default :
              실행문장;
              break;
          }
         */
        int a=10;
        switch (a%2){
            case 0:  // 짝수
                System.out.println("짝수입니다.");
                break; // 탈출
            case 1:  // 홀수
                System.out.println("홀수입니다.");
                break;
            default:
                System.out.println("잘못된 수입니다.");
        }
        // 제어문(반복문의 흐름을 제어) : break, continue + 반복문
        for(int i=1;i<=100;i++){
            if(i==50) break; // 조건이 만족하면 반복문을 탈출
            System.out.println(i);
        }
        // 1~10까지 수중에서 홀수만 출력(짝수이면 출력을 하지 말것)
        for(int i=1;i<=10;i++){
            if(i%2==0) continue;
            System.out.println(i);
        }
    }
}
