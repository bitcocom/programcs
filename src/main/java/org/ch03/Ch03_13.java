package org.ch03;

public class Ch03_13 {
    public static void main(String[] args) {
        // 자바 -> 문법, 변수, 자료형, 선언, 할당
        // 연산자 : 산술, 논리, 관계 연산자 => 이항 연산자
        int a,b;
        a=10;
        b=20;
        int sum=a+b;
        int mod=a%2; // %(나머지)
        System.out.println(mod); // 0
        int div=a/2; // /(몫)
        System.out.println(div); // 5
        // 논리연산자 => true, false
        boolean tf=(a>0 && b<0); //  true && false : and
        System.out.println(tf); // false

        boolean tf1=(a>0 || b<0); //  true || false : or
        System.out.println(tf1); // true

        boolean tf2=!(a>0); // !(부정) : true->false, false->true
        System.out.println(tf2); // false

        //관계연산자 : 대소비교 => true, false
        System.out.println((a>b)); // false
        System.out.println((a==b));// false
        System.out.println((a!=b));// true
        System.out.println((a>=b));// false
        System.out.println((a<=b));// false
    }
}
