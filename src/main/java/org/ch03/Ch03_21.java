package org.ch03;

public class Ch03_21 {
    public static void main(String[] args) {
        // 3. 카운트 하기(1씩 증가)
        int a=1;
        // a를 1씩 증가하는 모든 표현?
        ++a;
        a++;
        a=a+1;
        a+=1;
        System.out.println(a); // 5
        // 1~10까지의 수중 홀수의 개수, 짝수의 개수 => 카운트
        int evenCount=0;
        int oddCount=0;
        for(int i=1;i<=10;i++){
           if(i%2==0){
               evenCount++;
           }else{
               oddCount++;
           }//
        }//
        System.out.println(evenCount);// 5
        System.out.println(oddCount); // 5
    }
}
