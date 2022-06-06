package FifnySklad.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class AdminController {

    @GetMapping("/admin")
    public String getIndex() {

        return "admin";
    }
}
