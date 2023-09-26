package org.ch03;

public class Ch03_19 {
    public static void main(String[] args) {
        // 1. 메모리 교환(swap) => 정렬
        int a=10;
        int b=20;
        System.out.println("교환전 a:"+a);
        System.out.println("교환전 b:"+b);
        int tmp;
        tmp=a;
        a=b;
        b=tmp;
        System.out.println("교환후 a:"+a);
        System.out.println("교환후 b:"+b);

        MemberVO m1=new MemberVO("나길동",30,"010-1111-1111");
        MemberVO m2=new MemberVO("김길동",40,"010-2222-2222");
        System.out.println(m1.toString());
        System.out.println(m2.toString());

        MemberVO imsi;
        imsi=m1;
        m1=m2;
        m2=imsi;

        System.out.println(m1.toString());
        System.out.println(m2.toString());
    }

}
