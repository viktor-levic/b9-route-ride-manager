package org.example.b9routeridemanager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping("/")
    public String showLoginPage() {
        return "home";
    }

    @GetMapping("/home")
    public String showHomePage() {
        return "home";
    }

    @GetMapping("/login")
    public String showLoginPageAgain() {
        return "login";
    }

    @GetMapping("/cashier")
    public String showCashierPage() {
        return "cashier";
    }


    @GetMapping("/moderator")
    public String showModeratorPage() {
        return "moderator";
    }

    @GetMapping("/admin")
    public String showAdminPage() {
        return "admin";
    }

    @GetMapping("/admin/cashier")
    public String showAdminCashierPage() {
        return "cashier";
    }
}
