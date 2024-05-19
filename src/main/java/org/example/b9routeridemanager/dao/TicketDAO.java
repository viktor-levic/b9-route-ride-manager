package org.example.b9routeridemanager.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.example.b9routeridemanager.entities.Ticket;


public abstract class TicketDAO {

    private static final EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("PersistenceUnit");

    public void addTicket(Ticket ticket) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(ticket);
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    public Ticket getTicket(Long ticketId) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        Ticket ticket = entityManager.find(Ticket.class, ticketId);
        entityManager.close();
        return ticket;
    }
}
