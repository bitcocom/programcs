package org.ch05;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
// Java & JPA 프로그래밍(*)
public class Ch05_04 {
    public static void main(String[] args) {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("YourPersistenceUnitName");
        EntityManager em=emf.createEntityManager();
        em.getTransaction().begin();

        MemberVO member=new MemberVO("dddd","dddd","나나나", 51, "dddd@naver.com");
        em.persist(member); // insert SQL~

        em.getTransaction().commit();
        em.close();
        emf.close();
        System.out.println("등록성공");
    }
}
