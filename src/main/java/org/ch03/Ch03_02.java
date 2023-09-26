package org.ch03;

public class Ch03_02 {
    public static void main(String[] args) {
        // 정수 1개를 저장 하기 위한 [변수 선언]
        int a;
        a=10;
        System.out.println(a);
        // 정수 3개를 저장 하기 위한 [변수를 선언]
        int[] b=new int[3]; //배열생성->일반배열
        b[0]=10;
        b[1]=20;
        b[2]=30;
        System.out.println(b[0]+","+b[1]+","+b[2]);// 10,20,30
        // 책 1권을 저장 하기 위한 [변수 선언]
        Book c=new Book(); // 객체(Book)생성
        c.title="자바";
        c.author="홍길동";
        c.company="이지스퍼블리싱";
        c.page=500;
        c.price=35000;
        System.out.println(c.title+" "+c.author+" "+c.company+" "+c.page+" "+c.price);
        // 책 3권을 저장 하기 위한 [변수 선언]
        Book[] d=new Book[3]; // 객체배열
        d[0]=new Book();
        d[0].title="자바";
        d[0].author="홍길동";
        d[0].company="이지스퍼블리싱";
        d[0].page=500;
        d[0].price=35000;

        d[1]=new Book();
        d[1].title="인공지능";
        d[1].author="나길동";
        d[1].company="영진";
        d[1].page=400;
        d[1].price=31000;

        d[2]=new Book();
        d[2].title="오라클";
        d[2].author="조길동";
        d[2].company="대림";
        d[2].page=450;
        d[2].price=41000;

        System.out.println(d[0].title+" "+d[0].author+" "+d[0].company+" "+d[0].page+" "+d[0].price);
        System.out.println(d[1].title+" "+d[1].author+" "+d[1].company+" "+d[0].page+" "+d[1].price);
        System.out.println(d[2].title+" "+d[2].author+" "+d[2].company+" "+d[2].page+" "+d[2].price);

    }
}
