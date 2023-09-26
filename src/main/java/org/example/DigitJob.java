package org.example;

public class DigitJob implements Runnable{
    public void run(){
        // 1~100까지 출력하는 코드를 작성
        try {
            for (int i = 1; i <= 100; i++) {
                System.out.print(i);
                Thread.sleep(1000);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
