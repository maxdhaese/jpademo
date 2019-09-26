package be.intecbrussel;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("datasourceLocal");
        EntityManager em =
                emf.createEntityManager();


       Visitor visitor = new Visitor();
        em.getTransaction().begin();
        visitor.setAge(29);
        visitor.setName("Max");
        em.persist(visitor);
        em.getTransaction().commit();
        System.out.println("Visitor saved");


        em.close();
        emf.close();
    }
}
