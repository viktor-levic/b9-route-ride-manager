package org.example.b9routeridemanager.repositories;


import org.example.b9routeridemanager.entities.RolesInfo.Cashier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CashierRepository extends JpaRepository<Cashier, Long> {
    Cashier findByName(String name);
}
