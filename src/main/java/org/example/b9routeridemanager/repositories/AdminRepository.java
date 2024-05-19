package org.example.b9routeridemanager.repositories;

import org.example.b9routeridemanager.entities.RolesInfo.Admin;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AdminRepository extends JpaRepository<Admin, Long> {
    Admin findByName(String name);
}
