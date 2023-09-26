package org.ch03;

public class Ch03_12 {
    public static void main(String[] args) {
        MemberDAO dao=new MemberDAO();
        dao.connect(); // 연결
        // 회원데이터를 입력을 받았 다고 가정?
        MemberVO  vo=new MemberVO("나길동", 34, "010-1111-1111");
        dao.create(vo);
        dao.select();
        MemberVO  vo1=new MemberVO("나길동", 55, "010-2222-2222");
        dao.update(vo1);
        dao.delete(1);
    }
}
