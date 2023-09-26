package org.ch03;

public class Ch03_11 {
    // 메서드->동작(method), 행위 : 함수-> 기능(function)
    public static void main(String[] args) {
        //회원 관리에 필요한 클래스를 모델링(설계)
        //회원(MemberVO) : 이름, 나이, 전화번호....
        // 객체생성
        MemberVO m=new MemberVO();
        m.setName("나길동");
        //m.age=10000; 직접접근이 않된->위험
        m.setAge(45);
        m.setPhone("010-1111-1111");
        System.out.println(m.getName()+" "+m.getAge()+" "+m.getPhone());

        MemberVO m1=new MemberVO("이길동", 41,"010-2222-2222");
        // MemberVO{name='이길동', age=41, phone='010-2222-2222'}
        System.out.println(m1.toString()); // 회원 전체정보가 한번에 출력
    }
}
