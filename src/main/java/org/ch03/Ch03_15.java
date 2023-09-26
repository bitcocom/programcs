package org.ch03;

public class Ch03_15 {
    public static void main(String[] args) {
        /* 조건문 : 단순if문
           if(조건){
              참인경우에 실행
           }
        */
        // Q 어떤수가 짝수인지를 판별하는 프로그램을 작성
        int a=10; // a%2==0
        if(a%2==0){
            System.out.println(a+" 는 짝수 입니다.");
        }
        // 홀수일 경우에만 실행
        //System.out.println(a+" 는 홀수 입니다.");
        /* 블럭if문
          if(조건){
            참인경우실행~
          }else{
            거짓인경우실행~
          }
         */
        int x=5;
        if(x%2==0){
            System.out.println(x+" 짝수");
        }else{
            System.out.println(x+" 홀수"); // 5 홀수
        }
        // Q. 어떤수가 3의 배수이면서 5의 배수인지 판단?
        int b=14;
        if(b%3==0 && b%5==0){
            System.out.println(b+" 3,5의 배수이다.");
        }else{
            System.out.println(b+" 3,5의 배수가 아니다.");
        }
        /* 다중if문
          if(조건){

          }else if(조건){

          }else if(조건){

          }else{

          }
         */
        // Q. 학점 구하기
        /*
          90~100 : A
          80~89  : B
          70~79  : C
          60~69  : D
          59이하  : F
         */
        int jumsu=70; // B
        // 먼저 점수의 유효 범위(0~100)를 체크를 먼저 해야 한다.
        // 중첩if문
        if(jumsu>=0 && jumsu<=100){ // 0~100
            if(jumsu>=90){
                System.out.println(jumsu+"=A학점");
            }else if(jumsu>=80){
                System.out.println(jumsu+"=B학점"); // 88=B학점
            }else if(jumsu>=70){
                System.out.println(jumsu+"=C학점");
            }else if(jumsu>=60){
                System.out.println(jumsu+"=D학점");
            }else{
                System.out.println(jumsu+"=F학점");
            }
        }else{
            System.out.println("잘못된 점수 입니다.");
        }

    }
}
