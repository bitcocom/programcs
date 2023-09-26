package org.ch04;

import org.module.IntArray;

public class Ch04_02 {
    public static void main(String[] args) {
        // 배열처럼 동작하는 클래스(라이브러리, API)
        int[] a=new int[3]; // 1. 배열생성하는 동작
        a[0]=10; // 2. 배열에 데이터를 저장하는 동작
        a[1]=20;
        a[2]=30;
        int data=a[1]; // 3. 주어진 위치의 배열 원소의 값을 얻어 오는 동작
        int len=a.length; // 4. 배열의 길이를 구하는 동작
        System.out.println(a[2]); // 5. 배열의 값을 출력하는 동작

        IntArray arr=new IntArray(5); // 10
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(50);
        arr.add(20); // ? 배열의 크기를 조정~~
        arr.add(30);

        for(int i=0;i<arr.size();i++){
            int imsi=arr.get(i);
            System.out.println(imsi);
        }
    }
}
