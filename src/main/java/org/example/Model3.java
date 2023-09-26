package org.example;

public class Model3 {
    public static void main(String[] args) {
        int a=1;
        int b=1;
        //객체를 생성
        CalHap ch=new CalHap(a,b);
        ch.hap(); // 1+1=?
        int sum=ch.getSum();
        System.out.println(sum); // 2
    }
}
