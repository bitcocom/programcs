package org.ch03;

public class Ch03_14 {
    public static void main(String[] args) {
        // 단항연산자(++, --)
        // ++ : 1씩 증가연산자
        // -- : 1씩 감소연산자
        int a=10;
        a++; // a=a+1; 후위형연산자
        System.out.println(a); // 11
        a--; // a=a-1;
        System.out.println(a); // 10

        // ++a; // 전위형연산자
        int x=1;
        System.out.println(x++); //1
        System.out.println(x);   //2

        System.out.println(++x); //3
    }
}
