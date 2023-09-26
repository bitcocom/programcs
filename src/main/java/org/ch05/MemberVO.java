package org.ch05;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class MemberVO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String mem_id;  // mem_id
    private String mem_pass;
    private String mem_name;
    private int mem_age;
    private String mem_email;
    public MemberVO() {
    }
    public MemberVO(Long id, String mem_id, String mem_pass, String mem_name, int mem_age, String mem_email) {
        this.id = id;
        this.mem_id = mem_id;
        this.mem_pass = mem_pass;
        this.mem_name = mem_name;
        this.mem_age = mem_age;
        this.mem_email = mem_email;
    }
    public MemberVO(String mem_id, String mem_pass, String mem_name, int mem_age, String mem_email) {
        this.mem_id = mem_id;
        this.mem_pass = mem_pass;
        this.mem_name = mem_name;
        this.mem_age = mem_age;
        this.mem_email = mem_email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMem_id() {
        return mem_id;
    }

    public void setMem_id(String mem_id) {
        this.mem_id = mem_id;
    }

    public String getMem_pass() {
        return mem_pass;
    }

    public void setMem_pass(String mem_pass) {
        this.mem_pass = mem_pass;
    }

    public String getMem_name() {
        return mem_name;
    }

    public void setMem_name(String mem_name) {
        this.mem_name = mem_name;
    }

    public int getMem_age() {
        return mem_age;
    }

    public void setMem_age(int mem_age) {
        this.mem_age = mem_age;
    }

    public String getMem_email() {
        return mem_email;
    }

    public void setMem_email(String mem_email) {
        this.mem_email = mem_email;
    }

    @Override
    public String toString() {
        return "MemberVO{" +
                "id=" + id +
                ", mem_id='" + mem_id + '\'' +
                ", mem_pass='" + mem_pass + '\'' +
                ", mem_name='" + mem_name + '\'' +
                ", mem_age=" + mem_age +
                ", mem_email='" + mem_email + '\'' +
                '}';
    }
}
