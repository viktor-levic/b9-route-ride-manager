package org.example.b9routeridemanager.interactiondb;

import org.example.b9routeridemanager.tables.roles.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class AddingNewUser {
        public static void main(String[] args) {
            // Створення фабрики сесій Hibernate
            SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

            // Створення нового об'єкта User
            User user_1 = new User(1, "John Snow", "josnow", "lullaby");

            // Відкриваємо нову сесію Hibernate
            Session session = sessionFactory.openSession();
            session.beginTransaction();

            // Збереження об'єкта User у базу даних
            session.persist(user_1);

            // Завершення транзакції та закриття сесії
            session.getTransaction().commit();
            session.close();

            // Закриття фабрики сесій
            sessionFactory.close();
        }
}

