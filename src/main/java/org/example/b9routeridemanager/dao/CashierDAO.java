package org.example.b9routeridemanager.dao;

import org.example.b9routeridemanager.config.HibernateUtil;
import org.example.b9routeridemanager.entities.Ticket;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class CashierDAO extends TicketDAO {

    @Override
    // Метод для додавання нового квитка
    public void addTicket(Ticket ticket) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.save(ticket);
            transaction.commit();
        } catch (HibernateException e) {
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
            // Додайте додаткову обробку винятків, якщо необхідно
        } finally {
            session.close();
        }
    }

    @Override
    // Метод для повернення квитка
    public Ticket getTicket(Long ticketId) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Ticket ticket = null;
        try {
            ticket = session.get(Ticket.class, ticketId);
        } catch (HibernateException e) {
            e.printStackTrace();
            // Додайте додаткову обробку винятків, якщо необхідно
        } finally {
            session.close();
        }
        return ticket;
    }

}
