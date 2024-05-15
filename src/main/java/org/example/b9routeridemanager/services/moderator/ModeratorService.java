package org.example.b9routeridemanager.services.moderator;

import org.example.b9routeridemanager.entities.RolesInfo.Cashier;
import org.example.b9routeridemanager.entities.Ticket;
import org.example.b9routeridemanager.entities.TicketStatus;

public interface ModeratorService {
    void addTicket(Ticket ticket);
    Ticket getTicket(long ticketId);
    TicketStatus checkTicketStatus(long ticketId);
    void addCashier(Cashier cashier);
    void deleteCashier(long cashierId);
}
