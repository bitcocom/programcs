package org.ch03;
// DAO : 데이터베이스와 연동(연결)하는 객체, CRUD
public class MemberDAO {
  // 1. 데이터베이스 연결
  public void connect(){
      // URL, username, password -->DataBase
      System.out.println("데이터베이스를 연결하는 동작");
  }
  // 2. table에 데이터를 저장(insert : Create)
  public void create(MemberVO vo){
      // insert into member values(vo.getName(), vo.getAge(), vo.getPhone())
      System.out.println("테이블에 데이터를 저장하는 동작");
  }
  // 3. table에 저장된 데이터를 조회(select : Read)
  public void select(){
      // select * from member
      // MemberVO 묶어 주고->배열에다 저장을 해야 한다.
      System.out.println("테이블에서 전체 회원 목록을 가져오는 동작");
  }
  // 4. 데이터를 수정(update : Update)
  public void update(MemberVO vo){
      // update member set age=vo.getAge(),phone=vo.getPhone()
      // where id=3
      System.out.println("테이블에서 일치하는 회원의 정보를 수정하는 동작");
  }
  // 5. 데이터를 삭제(delete : Delete)
  public void delete(int id){
      // delete from member where id=2
      System.out.println("테이블에서 일치하는 회원을 삭제하는 동작");
  }
}
