package org.ch03;

public class Ch03_05 {
    // 시작 메서드(행위,동작) = main
    public static void main(String[] args){
       int a, b, sum;
       a=10;
       b=20;
       sum=hap(a,b); // 메서드 호출문
       System.out.println(sum); // 30
    }
    // 매개변수로 2개의 정수를 받아서 총합을 구하여 리턴하는 메서드를 정의
    // 메서드 => 정의부(head)+구현부(body): {     }
    public static int hap(int a, int b){ // int hap=sum;
        int sum=a+b; // 결과값을 만들어 냈나요? X
        return sum;  // return문이 있을때 결과값을 만들어 냈나요? O
    }
}
