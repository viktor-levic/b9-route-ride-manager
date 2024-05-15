package org.example.b9routeridemanager.services.admin;

import org.example.b9routeridemanager.entities.LogisticsInfo.Route;
import org.example.b9routeridemanager.entities.RolesInfo.Cashier;
import org.example.b9routeridemanager.entities.Ticket;
import org.example.b9routeridemanager.entities.TicketStatus;


public interface AdminService {
    void addTicket(Ticket ticket);
    Ticket getTicket(long ticketId);
    TicketStatus checkTicketStatus(long ticketId);
    void addCashier(Cashier cashier);
    void deleteCashier(long cashierId);
    void changeTicketPrice(long ticketId, double newPrice);
    void changeTicketRoute(long ticketId, Route newRoute);
}
