package org.example.b9routeridemanager.config;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.example.b9routeridemanager.entities.Ticket;
import org.example.b9routeridemanager.entities.RolesInfo.*;
import org.example.b9routeridemanager.entities.LogisticsInfo.*;


public class HibernateUtil {
    private static final SessionFactory sessionFactory = buildSessionFactory();

    private static SessionFactory buildSessionFactory() {
        try {
            // Створення об'єкта Configuration з конфігурацією Hibernate
            Configuration configuration = new Configuration().configure();

            // Додавання класів сутностей до конфігурації (якщо необхідно)
            configuration.addAnnotatedClass(Admin.class);
            configuration.addAnnotatedClass(Cashier.class);
            configuration.addAnnotatedClass(Moderator.class);
            configuration.addAnnotatedClass(Ticket.class);
            configuration.addAnnotatedClass(Route.class);
            configuration.addAnnotatedClass(City.class);

            // Створення реєстру сервісів і побудова фабрики сесій
            StandardServiceRegistryBuilder serviceRegistryBuilder = new StandardServiceRegistryBuilder()
                    .applySettings(configuration.getProperties());
            return configuration.buildSessionFactory(serviceRegistryBuilder.build());
        } catch (Throwable ex) {
            // Виведення помилки при ініціалізації фабрики сесій
            System.err.println("Помилка при ініціалізації фабрики сесій: " + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public static void shutdown() {
        // Закриття фабрики сесій
        getSessionFactory().close();
    }
}
