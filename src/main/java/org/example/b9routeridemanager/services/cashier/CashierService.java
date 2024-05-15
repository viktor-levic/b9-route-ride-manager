package org.example.b9routeridemanager.services.cashier;

import org.example.b9routeridemanager.entities.Ticket;


public interface CashierService {
    void addTicket(Ticket ticket);
    Ticket getTicket(long ticketId);
}
