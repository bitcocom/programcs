package org.ch03;

public class Ch03_07 {
    public static void main(String[] args) {
        int[] a={10, 20, 30}; // 선언과 동시에 초기화
        int result=Ch03_07.arrHap(a); // Call By Reference(번지 전달)
        System.out.println(result); // 60
    }
    // Q. 매개변수로 정수형 배열을 받아서 / 배열의 총합을 / 구하여 리턴하는 메서드를 정의
    public static int arrHap(int[] a){
        int sum=0;
        for(int i=0;i<a.length;i++){
            sum=sum+a[i]; // 총합이 누적
        }
        return sum;
    }
}
