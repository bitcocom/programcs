package org.ch04;

import com.google.gson.Gson;
import org.ch03.MemberVO;

public class Ch04_05 {
    public static void main(String[] args) {
        // 다른 회사에서 제공 하는 API
        // json API(Gson, org.json)
        // JSON -> 객체(Object=VO,DTO)를 규칙이 있는 문자열 형태(String)로 변환 시켜주는 API
        // { key:value,key:value ~~ }
        Gson g=new Gson();
        MemberVO vo=new MemberVO("나길동", 33, "010-1111-1111");
        String json=g.toJson(vo);
        System.out.println(json); // ?
        // {"name":"나길동","age":33,"phone":"010-1111-1111"}
    }
}
