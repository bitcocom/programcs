package org.example;

public class CalHap {
    private int a;
    private int b;
    private int sum;
    public CalHap(int a,int b){ // 객체의 초기화
        this.a=a;
        this.b=b;
    }
    public void hap(){
        this.sum=this.a+this.b;
    }
    public int getSum(){
        return this.sum;
    }
}
