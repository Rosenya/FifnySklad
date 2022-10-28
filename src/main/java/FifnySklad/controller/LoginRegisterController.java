package FifnySklad.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginRegisterController {

    @GetMapping("/login")
    public String getLogin() {
        return "loginPages/login";
    }

    @GetMapping("/register")
    public String getRegister() {
        return "loginPages/register";
    }


}