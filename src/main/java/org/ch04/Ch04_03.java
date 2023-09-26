package org.ch04;
import org.ch03.MemberDAO;
import org.ch03.MemberVO;

import java.util.*; // ArrayList
public class Ch04_03 {
    public static void main(String[] args) {
        // 배열[] -> IntArray(API) -> 개선 -> 자바에서 제공하는 API(ArrayList)
        // 배열의 단점 : 1)크기가 고정
        // int[] a=new int[5]; // 크기5로 결정 -> 가변적으로 크기를 조정
        // 동일한 데이터만 저장가능 -> 2) 서로 다른 타입의 데이터를 넣을 수가 없다
        // IntArray <--- ArrayList를 흉내 내기
        // ArrayList는 내부에 Object[] 모든 객체를 저장 가능하다.
        // ArrayList -> MemberVO[]
        ArrayList<MemberVO> list=new ArrayList<MemberVO>(); // 10size
        list.add(new MemberVO("나길동", 30, "010-1111-1111"));
        list.add(new MemberVO("이길동", 33, "010-2222-2222"));
        list.add(new MemberVO("조길동", 23, "010-3333-3333"));
        list.add(new MemberVO("박길동", 43, "010-4444-4444"));

        for(int  i=0;i<list.size();i++){
            MemberVO mem =list.get(i);
            System.out.println(mem.toString());
        }
        // int -> Integer
        ArrayList<Integer> intList=new ArrayList<Integer>(1);
        intList.add(10);
        intList.add(20);
        intList.add(30);
        intList.add(40);
        intList.add(50);
        // 향상된 for
        for(int data :  intList ){
            System.out.println(data);
        }
    }
}

