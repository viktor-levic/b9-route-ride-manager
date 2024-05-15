package org.example.b9routeridemanager.services.moderator;

import org.example.b9routeridemanager.dao.ModeratorDAO;
import org.example.b9routeridemanager.entities.RolesInfo.Cashier;
import org.example.b9routeridemanager.entities.Ticket;
import org.example.b9routeridemanager.entities.TicketStatus;

public class ModeratorServiceImpl implements ModeratorService {

    private ModeratorDAO moderatorDAO;

    public ModeratorServiceImpl() {
        this.moderatorDAO = new ModeratorDAO();
    }

    @Override
    public void addTicket(Ticket ticket) {
        moderatorDAO.addTicket(ticket);
    }

    @Override
    public Ticket getTicket(long ticketId) {
        return moderatorDAO.getTicket(ticketId);
    }

    @Override
    public TicketStatus checkTicketStatus(long ticketId) {
        return moderatorDAO.checkTicketStatus(ticketId);
    }

    @Override
    public void addCashier(Cashier cashier) {
        moderatorDAO.addCashier(cashier);
    }

    @Override
    public void deleteCashier(long cashierId) {
        moderatorDAO.deleteCashier(cashierId);
    }
}
