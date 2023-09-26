package org.example;
// 소스코드(원시코드,고급언어) ----컴파일(컴파일러:javac.exe)---->기계어
// OnePlusTwo.java
// 중간어코드 : OnePlusTwo.class
// Run-1)컴파일->2)실행
public class OnePlusTwo {
    public static void main(String[] args) {
        // 1+1=?
        int a,b,sum; // 변수선언->int(크기:4byte, 종류:정수)
        a=1; // 대입, 할당
        b=1;
        sum=a+b;
        System.out.println(sum); // 2
    }
}
