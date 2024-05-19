package org.example.b9routeridemanager.repositories;


import org.example.b9routeridemanager.entities.RolesInfo.Moderator;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ModeratorRepository extends JpaRepository<Moderator, Long> {
    Moderator findByName(String name);
}

