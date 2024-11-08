package fr.diginamic;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class ConnexionJpa {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("demo-jpa");
        EntityManager em = emf.createEntityManager();

        if (em.isOpen()) {
            System.out.println("Connexion à la base de données établie.");
        } else {
            System.out.println("La connexion à la base de données a échoué.");
        }

        em.close();
        emf.close();
    }
}
