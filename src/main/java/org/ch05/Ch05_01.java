package org.ch05;
import java.sql.*; //JDBC API
public class Ch05_01 {
    public static void main(String[] args) {
        // JDBC 프로그래밍 : mysql 접속 드라이버 다운로드(mvnrepositroy.com)
        String URL="jdbc:mysql://localhost:3306/csjava";
        String username="root";
        String password="12345";
        // 1. 드라이버 로딩
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            // 2. 연결객체생성
            Connection conn=DriverManager.getConnection(URL, username, password);
            System.out.println("접속성공"); // 접속성공
            // 회원가입
            String SQL="insert into member(mem_id, mem_pass, mem_name, mem_age, mem_email) " +
                    "values('bit','12345', '나길동',55,'bitcocom@naver.com')";
            // 3.SQL문장을 전송하는 객체
            Statement st=conn.createStatement();
            st.executeUpdate(SQL); // 실행
            System.out.println("가입성공");
        }catch(Exception e){
            e.printStackTrace(); // ?
        }
    }
}
