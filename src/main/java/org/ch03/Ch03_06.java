package org.ch03;
public class Ch03_06 {
    public static void main(String[] args) {
       float a=78.8f;
       float b=56.7f;
       // a+b=?
       Ch03_06.floatHap(a, b); // Call By Value(값전달)
       //System.out.println(f); // 135.5
    }
    // Q. 두개의 실수 데이터를 매개변수로 받아서 / 총합을 구하여 / 리턴하는 / 메서드를 정의
    public static void floatHap(float a, float b){
        float f=a+b;
        System.out.println(f);
        //return f;
    }
}
