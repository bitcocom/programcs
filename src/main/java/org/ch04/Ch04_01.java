package org.ch04;

public class Ch04_01 {
    public static void main(String[] args) {
        // 객체생성
        CoffeeMathine cm=new CoffeeMathine();
        cm.insertMoney(1.0);
        cm.selectCoffee();
        double change=cm.returnChange();
        System.out.println("거스름돈:"+change);
    }
}
