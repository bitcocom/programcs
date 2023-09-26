package org.ch05;

public class Ch05_02 {
    public static void main(String[] args) {
        //회원 가입
        MemberVO member=new MemberVO("aaaa","aaaa","나디비", 32, "aaa@naver.com");
        MemberDAO dao=new MemberDAO();
        dao.memberInsert(member); // 성공
        System.out.println("가입성공");
    }
}
