package org.example.b9routeridemanager.services.cashier;

import org.example.b9routeridemanager.dao.CashierDAO;
import org.example.b9routeridemanager.entities.Ticket;


public class CashierServiceImpl implements CashierService {

    private CashierDAO cashierDAO;

    public CashierServiceImpl() {
        this.cashierDAO = new CashierDAO();
    }

    @Override
    public void addTicket(Ticket ticket) {
        cashierDAO.addTicket(ticket);
    }

    @Override
    public Ticket getTicket(long ticketId) {
        return cashierDAO.getTicket(ticketId);
    }
}
