package org.example;

public class Model1 {
    public static void main(String[] args) {
        int a,b,sum;
        a=1;
        b=1;
        //sum=a+b;
        sum= Model1.hap(a,b);
        System.out.println(sum);//2
    }
    public static int hap(int a, int b){
        int sum=a+b;
        return sum;
    }
}
