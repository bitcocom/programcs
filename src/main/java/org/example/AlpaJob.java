package org.example;

public class AlpaJob implements Runnable{
    public void run(){
        // 1~100까지 출력하는 코드를 작성
        try {
            for (char i = 'A'; i <= 'Z'; i++) {
                System.out.print(i);
                Thread.sleep(1000); // 1초(다른 스레드로 Context Switching이 된다)
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
