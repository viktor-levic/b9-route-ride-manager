package org.example.b9routeridemanager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PageController {

    @GetMapping("/")
    public String showLoginPage() {
        return "home";
    }

    @GetMapping("/login")
    public String showLoginPageAgain() {
        return "login";
    }

    @GetMapping("/index")
    public String showIndexPage() {
        return "index";
    }

    @GetMapping("/home")
    public String showHomePage() {
        return "home";
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
