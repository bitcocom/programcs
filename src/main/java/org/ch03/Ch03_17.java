package org.ch03;

public class Ch03_17 {
    public static void main(String[] args) {
        // 반복문 : while, do~while
        /*
           while(조건){
             참일경우 실행하는 문장;
           }
         */
        // 1~10까지 출력
        int i=1; //초기값
        while(i<=10){
            System.out.println(i); // i=1,2,3...........10
            i++; // 증감식
        }
        // 반복의 횟수를 알 경우 : for
        // 반복의 횟수를 모른는 경우 : while
        // 1~10까지의 수중 홀수만 출력하세요.
        int x=1;
        while(x<=10){
            if(x%2!=0) {
                System.out.println(x);
            }
            x++;
        }
        // do~while();
        /*
           do{

           }while(조건);
        */
    }
}
