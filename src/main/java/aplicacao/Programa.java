package aplicacao;
import dominio.Pessoa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Programa {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa(null,"Jessica", "jessy@teste.com");
        Pessoa p2 = new Pessoa(null,"Sonia", "sonia@teste.com");

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("aulaTreino");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        em.persist(p1);
        em.persist(p2);
        em.getTransaction().commit();
    }
}
