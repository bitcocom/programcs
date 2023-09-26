package org.ch04;

public class CoffeeMathine {
    // 상태정보, 속성, 멤버변수
    private double coffeePrice;
    private double currentBalance;
    private int coffeeStock;
    // 초기화
    public CoffeeMathine(){
        coffeePrice=1.5;
        currentBalance=0.0;
        coffeeStock=10;
    }
    public void insertMoney(double amount){
        currentBalance+=amount;
    }
    public void selectCoffee(){
        if(currentBalance>=coffeePrice){
            if(coffeeStock>0){
                System.out.println("커피 출력!");
                currentBalance-=coffeePrice;
                coffeeStock--;
            }else{
                System.out.println("커피가 모두 소진 되었습니다.");
            }//
        }else{
            System.out.println("돈이 부족합니다. "+(coffeePrice-currentBalance)+"원 더 투입 해주세요.");
        }
    }
    public double returnChange(){
        double change=currentBalance;
        currentBalance=0.0;
        return change;
    }
}
