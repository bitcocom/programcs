package org.ch03;

public class Ch03_16 {
    public static void main(String[] args) {
        // 조건문(if) + 반복문(loop문) : 규칙
        // for문
        /*
          for(초기값;조건;증감식){
            반복해야되는 문장..;
          }
         */
        //Q 1~10까지 출력 하시오.
        for(int i=1;i<=10;i++) {
            System.out.println(i); // i=1,2,3-----10
        }
        // 1~10까지의 수중 짝수만 출력
        for(int i=1;i<=10;i++){
            if(i%2==0){
                System.out.println(i); // 2, 4, 6, 8,10
            }
        }
        // 반복문 + 배열 자료구조
        int arr[]={10,20,30};
        // 배열의 모든 원소를 출력
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]); // i=0,1,2
        }
        // 향상된 for
        /*
           for( 변수  : 여러개의자료형(컬렉션) ){

           }
         */
        for(int data : arr ){
            System.out.println(data); // 10, 20, 30
        }
    }
}
