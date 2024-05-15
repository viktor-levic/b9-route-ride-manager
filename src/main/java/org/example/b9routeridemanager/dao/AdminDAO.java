package org.example.b9routeridemanager.dao;

import org.example.b9routeridemanager.config.HibernateUtil;
import org.example.b9routeridemanager.entities.LogisticsInfo.Route;
import org.example.b9routeridemanager.entities.RolesInfo.Cashier;
import org.example.b9routeridemanager.entities.Ticket;
import org.example.b9routeridemanager.entities.TicketStatus;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.HibernateException;

public class AdminDAO extends TicketDAO {

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

    // Метод для перевірки статусу квитка
    public TicketStatus checkTicketStatus(long ticketId) {
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
        return ticket != null ? ticket.getStatus() : null;
    }

    // Метод для додавання касира
    public void addCashier(Cashier cashier) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.save(cashier);
            transaction.commit();
        } catch (HibernateException e) {
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
            // Додайте додаткову обробку винятків, якщо необхідно
        } finally {
            session.close();
        }
    }

    // Метод для видалення касира
    public void deleteCashier(long cashierId) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            Cashier cashier = session.get(Cashier.class, cashierId);
            if (cashier != null) {
                session.delete(cashier);
            }
            transaction.commit();
        } catch (HibernateException e) {
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
            // Додайте додаткову обробку винятків, якщо необхідно
        } finally {
            session.close();
        }
    }

    // Метод для зміни ціни квитка
    public void changeTicketPrice(long ticketId, double newPrice) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            Ticket ticket = session.get(Ticket.class, ticketId);
            if (ticket != null) {
                ticket.setPrice(newPrice);
                session.update(ticket);
            }
            transaction.commit();
        } catch (HibernateException e) {
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
            // Додайте додаткову обробку винятків, якщо необхідно
        } finally {
            session.close();
        }
    }

    // Метод для зміни маршруту у квитку
    public void changeTicketRoute(long ticketId, Route newRoute) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            Ticket ticket = session.get(Ticket.class, ticketId);
            if (ticket != null) {
                ticket.setRoute(newRoute);
                session.update(ticket);
            }
            transaction.commit();
        } catch (HibernateException e) {
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
            // Додайте додаткову обробку винятків, якщо необхідно
        } finally {
            session.close();
        }
    }
}

