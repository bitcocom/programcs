package org.ch03;

public class Ch03_01 {
    public static void main(String[] args) {
        // DataType(자료형)
        // 1. 기본자료형 : int, float, char, boolean
        // 2. 객체자료형(사용자정의자료형) : class -> Book
        int a; // 선언
        a=10;
        int b=10; //선언+초기화
        double f=67.55;
        char c='A';
        char c1='박'; // 한글->2byte
        boolean b1=true;
        boolean b2=false;
        // 문자열(String) : "APPLE"
        // String -> 사용자정의자료형
        String s="APPLE";
        // 책 한권의 데이터를 저장할 변수를 선언?
        // 객체생성
        Book book=new Book();
        book.title="Head First Java";
        book.author="박매일";
        book.company="한빛네트워크";
        book.price=30000;
        book.page=500;
        System.out.println(book.title);
        System.out.println(book.author);
        System.out.println(book.company);
        System.out.println(book.price);
        System.out.println(book.page);
    }
}
