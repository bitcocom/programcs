package org.ch04;
//import java.lang.*; // String
public class Ch04_04 {
    public static void main(String[] args) {
        // String API(문자열 조작)
        // 문자열 객체를 생성
        String s=new String("APPLE");
        //String s1="APPLE"; // 문자열상수(리터럴)
        System.out.println(s.length()); // 5
        System.out.println(s.toLowerCase()); // apple
        System.out.println(s.replace("PL","@"));
        System.out.println(s.substring(2,4)); // "PL"
        System.out.println(s.charAt(3)); // 'L'

        // Integer
        String s1="100"; // 100(int)
        String s2="200"; // 200(int)
        System.out.println(s1+s2); //"100200" : +(결합)
        // s1+s2=300
        int sum=Integer.parseInt(s1)+Integer.parseInt(s2);
        System.out.println(sum); // 300

        int su1=100;
        int su2=200;
        // su1+su2=300 -> "100200"
        String str=String.valueOf(su1)+String.valueOf(s2);
        System.out.println(str);
    }
}
