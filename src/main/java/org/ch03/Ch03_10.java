package org.ch03;

public class Ch03_10 {
    public static void main(String[] args) {
        // 책이라는 데이터를 개별적으로 저장했다.
        String title="자바의 신";
        String company="제이펍";
        String author="나길동";
        int price=28000;
        int page=670;
        // 위 데이터를 이동
        // bookPrint(title,company,author,price,page);
        Book b=new Book(); // 서로 다른 타입의 데이터를 하나로 묶을때 사용한다.
        b.title=title;
        b.company=company;
        b.author=author;
        b.price=price;
        b.page=page;
        bookPrint(b);
    }
    //책정보 5개를 매개변수로 받아서 출력하는 메서드를 정의
    public static void bookPrint(Book b){
        System.out.println(b.title+" "+b.company+" "+b.author+" "+b.price+" "+b.page);
    }
}
