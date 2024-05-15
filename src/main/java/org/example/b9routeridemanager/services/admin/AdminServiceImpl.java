package org.example.b9routeridemanager.services.admin;

import org.example.b9routeridemanager.dao.AdminDAO;
import org.example.b9routeridemanager.entities.LogisticsInfo.Route;
import org.example.b9routeridemanager.entities.RolesInfo.Cashier;
import org.example.b9routeridemanager.entities.Ticket;
import org.example.b9routeridemanager.entities.TicketStatus;

public class AdminServiceImpl implements AdminService {

    private AdminDAO adminDAO;

    public AdminServiceImpl() {
        this.adminDAO = new AdminDAO();
    }

    @Override
    public void addTicket(Ticket ticket) {
        adminDAO.addTicket(ticket);
    }

    @Override
    public Ticket getTicket(long ticketId) {
        return adminDAO.getTicket(ticketId);
    }

    @Override
    public TicketStatus checkTicketStatus(long ticketId) {
        return adminDAO.checkTicketStatus(ticketId);
    }

    @Override
    public void addCashier(Cashier cashier) {
        adminDAO.addCashier(cashier);
    }

    @Override
    public void deleteCashier(long cashierId) {
        adminDAO.deleteCashier(cashierId);
    }

    @Override
    public void changeTicketPrice(long ticketId, double newPrice) {
        adminDAO.changeTicketPrice(ticketId, newPrice);
    }

    @Override
    public void changeTicketRoute(long ticketId, Route newRoute) {
        adminDAO.changeTicketRoute(ticketId, newRoute);
    }
}

