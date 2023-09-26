package org.ch05;
import java.sql.*;
import java.util.ArrayList;

public class MemberDAO {
   private Connection conn;
   private Statement st; // X -> ?(X)
   private PreparedStatement ps; // O
   private ResultSet rs;
   public void getConnection(){
       String URL="jdbc:mysql://localhost:3306/csjava";
       String username="root";
       String password="12345";
       try{
           Class.forName("com.mysql.cj.jdbc.Driver");
           conn=DriverManager.getConnection(URL, username, password);
       }catch(Exception e){
           e.printStackTrace();
       }
   }// 연결
   public void memberInsert(MemberVO vo){
       getConnection(); // ? -> 파라메터(1,2,3,4---->
       String SQL="insert into member(mem_id, mem_pass, mem_name, mem_age, mem_email) values(?,?,?,?,?)";
       try{
          ps=conn.prepareStatement(SQL); // 미리 SQL컴파일시킴
          ps.setString(1, vo.getMem_id());
          ps.setString(2, vo.getMem_pass());
          ps.setString(3,vo.getMem_name());
          ps.setInt(4, vo.getMem_age());
          ps.setString(5, vo.getMem_email());
          ps.executeUpdate();//실행
       }catch(Exception e){
           e.printStackTrace();
       }
   }
   public ArrayList<MemberVO> getMembers(){
       getConnection();
       String SQL="select * from member"; // ?
       ArrayList<MemberVO> list=new ArrayList<MemberVO>();
       try{
           ps=conn.prepareStatement(SQL);
           rs=ps.executeQuery();
           while (rs.next()){ // true, false
             Long id=rs.getLong("id");
             String mem_id=rs.getString("mem_id");
             String mem_pass=rs.getString("mem_pass");
             String mem_name=rs.getString("mem_name");
             int mem_age=rs.getInt("mem_age");
             String mem_email=rs.getString("mem_email");
             // 묶어주고(VO)->담아주고(ArrayList)
             MemberVO vo=new MemberVO(id,mem_id,mem_pass,mem_name,mem_age,mem_email);
             list.add(vo);
           }
       }catch(Exception e){
           e.printStackTrace();
       }
       return list;
   }
}

