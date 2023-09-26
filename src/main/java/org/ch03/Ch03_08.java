package org.ch03;

public class Ch03_08 {
    public static void main(String[] args) {
        int[] arr=Ch03_08.makeArray(5);
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        System.out.println(sum); // 100
    }
    // 정수형 배열에 5개의 원소를 저장해서(정수형 배열을 만들어서) 리턴하는 메서드를 정의
    public static int[] makeArray(int length){
        int[] arr=new int[length]; // length=3, 4, 5 ~
        for(int i=0;i<arr.length;i++){
            arr[i]=10*i; // 10*0=0, 10*1=10, 10*2=20 ,,,,
        }
        return arr; // 하나의 형태로 리턴
    }
}
