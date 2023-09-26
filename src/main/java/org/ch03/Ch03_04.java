package org.ch03;

public class Ch03_04 {
    public static void main(String[] args) {
        // 책 3권 저장
        Book[] b=new Book[3];
        b[0]=new Book();
        b[1]=new Book();
        b[2]=new Book();

        b[0].title="자바";
        b[0].author="홍길동";
        b[0].company="이지스퍼블리싱";
        b[0].page=500;
        b[0].price=35000;

        b[1].title="자바";
        b[1].author="홍길동";
        b[1].company="이지스퍼블리싱";
        b[1].page=500;
        b[1].price=35000;

        b[2].title="자바";
        b[2].author="홍길동";
        b[2].company="이지스퍼블리싱";
        b[2].page=500;
        b[2].price=35000;

        for(int i=0;i<b.length;i++) {
            System.out.println(b[i].title + " " + b[i].author + " " + b[i].company + " " + b[i].page + " " + b[i].price);
        }
    }
}
