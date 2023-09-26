package org.ch03;

public class Ch03_03 {
    public static void main(String[] args) {
        int b,c,d; // 정수 3000개
        b=10;
        c=20;
        d=30;
        int hap=b+c+d; //60
        System.out.println(hap);// 60

        int[] a=new int[3]; // 정수 3000개
        System.out.println(a.length); // 배열의 길이->반복회수
        a[0]=10;
        a[1]=20;
        a[2]=30;

        for(int i=0;i<a.length;i++) {
            System.out.println(a[i]); // i=0->1->2
        }
        // 누적
        int sum=0;
        for(int i=0;i<a.length;i++) {
            sum = sum + a[i]; // 60
        }
        System.out.println(sum);// 60
    }
}
