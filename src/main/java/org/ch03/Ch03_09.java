package org.ch03;

public class Ch03_09 {
    public static void main(String[] args) {
        int a,b,c;
        a=10;
        b=20;
        c=30;
        // a,b,c 3개의 데이터를 다른 메서드로 이동을 시켜보자
        /*int[] arr=new int[3];
        arr[0]=a;
        arr[1]=b;
        arr[2]=c;*/
        int[] arr={a, b, c};
        //int sum=Ch03_09.hap(a,b,c);
        int sum=Ch03_09.hap(arr);
        System.out.println(sum);
    }
    // 정수 3개을 매개변수로 받아서 총합을 구하여 리턴하는 메서드를 정의
    public static int hap(int[] arr){
        //int sum=a+b+c; // + +
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i]; // sum+=arr[i]
        }
        return sum;
    }
}
