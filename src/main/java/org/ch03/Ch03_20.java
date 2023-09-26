package org.ch03;

public class Ch03_20 {
    public static void main(String[] args) {
        // 2. 누적하기(변수에 값을 계속 증가:부풀리기)
        // 1~10=55
        int sum=0;
        for(int i=1;i<=10;i++) {
            sum += i; // 1--->10
        }
        System.out.println(sum); // 55
        // 1~10까지의 수중 짝수의 합과 홀수의 합
        int even=0;
        int odd=0;
        for(int i=1;i<=10;i++){
            if(i%2==0){
                even+=i; // 누적
            }else{
                odd+=i;  // 누적
            }//
        }//
        System.out.println(even); // 30
        System.out.println(odd);  // 25
    }
}
