/*

package org.example.b9routeridemanager.service;


import org.example.b9routeridemanager.entities.RolesInfo.Admin;
import org.example.b9routeridemanager.entities.RolesInfo.Cashier;
import org.example.b9routeridemanager.entities.RolesInfo.Moderator;
import org.example.b9routeridemanager.repositories.AdminRepository;
import org.example.b9routeridemanager.repositories.CashierRepository;
import org.example.b9routeridemanager.repositories.ModeratorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.security.core.userdetails.User.UserBuilder;


@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private AdminRepository adminRepository;

    @Autowired
    private CashierRepository cashierRepository;

    @Autowired
    private ModeratorRepository moderatorRepository;

    @Override
    public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException {
        UserBuilder builder;
        Admin admin = adminRepository.findByName(name);
        if (admin != null) {
            builder = org.springframework.security.core.userdetails.User.withUsername(name);
            builder.password(admin.getPassword());
            builder.roles("ADMIN");
        } else {
            Cashier cashier = cashierRepository.findByName(name);
            if (cashier != null) {
                builder = org.springframework.security.core.userdetails.User.withUsername(name);
                builder.password(cashier.getPassword());
                builder.roles("CASHIER");
            } else {
                Moderator moderator = moderatorRepository.findByName(name);
                if (moderator != null) {
                    builder = org.springframework.security.core.userdetails.User.withUsername(name);
                    builder.password(moderator.getPassword());
                    builder.roles("MODERATOR");
                } else {
                    throw new UsernameNotFoundException("User not found");
                }
            }
        }
        return builder.build();
    }
}

 */