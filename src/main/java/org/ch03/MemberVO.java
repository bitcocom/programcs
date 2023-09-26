package org.ch03;
//회원(Object) -> [이름, 나이, 전화번호]..........
// 설계-> 잘 설계를 해야 한다.
public class MemberVO {
    // private int id;
    // 1. 모든 멤버변수는 정보은닉(private)
    private String name;
    private int age;
    private String phone;
    // 1.디폴트생성자(생략)를 명시적으로 만들자.
    public MemberVO(){
        // 초기화
    }
    // 2.생성자메서드를 중복정의(Overloading)하여 초기화를 할 수 있다.
    public MemberVO(String name, int age, String phone){
      this.name=name;
      this.age=age;
      this.phone=phone;
    }
    // 2. setter, getter method
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    // 객체가 가지고 있는 값을 한번에 리턴해 주는 메서드 : toString()
    @Override
    public String toString() {
        return "MemberVO{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                '}';
    }
}
