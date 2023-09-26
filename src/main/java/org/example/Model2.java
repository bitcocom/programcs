package org.example;

public class Model2 {
    // 디폴트 생성자 메서드(객체의 초기화를 담당하는 역할)
    public Model2(){
        System.out.println("Model2()");
    }
    public static void main(String[] args) {
        int a,b,sum;
        a=1;
        b=1;
        //sum=a+b;
        //sum= Model2.hap(a,b);
        Model2 m2=new Model2();
        sum=m2.hap(a,b);
        System.out.println(sum);//2
    }
    public int hap(int a, int b){
        int sum=a+b;
        return sum;
    }
}
