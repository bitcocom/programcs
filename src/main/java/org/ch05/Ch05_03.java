package org.ch05;

import java.util.ArrayList;

public class Ch05_03 {
    public static void main(String[] args) {
        MemberDAO dao=new MemberDAO();
        ArrayList<MemberVO> list=dao.getMembers();
        for(MemberVO member  :  list){
            System.out.println(member);
        }
    }
}
