package org.ch04;

import org.poly1.Radio;
import org.poly1.RemoCon;
import org.poly1.TV;

public class Ch04_14 {
    public static void main(String[] args) {
        //리모콘으로 TV와 Radio를 동작 시켜보세요.
        RemoCon remo=new TV();
        remo.chUp(); // ?
        remo.chDown();// ?

        remo=new Radio();
        remo.chUp();// ?
        remo.chDown();// ?

    }
}
