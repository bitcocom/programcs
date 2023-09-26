package org.poly1;

public class Radio implements RemoCon{
    public void chUp(){
        System.out.println("Radio의 채널이 올라간다");
    }
    public void chDown(){
        System.out.println("Radio의 채널이 내려간다");
    }
    public void internet(){
        System.out.println("인터넷 기능이 지원되지 않는다.");
    }
}
