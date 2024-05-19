package org.example.b9routeridemanager.repositories;

import org.example.b9routeridemanager.entities.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Ticket, Long> {
}
