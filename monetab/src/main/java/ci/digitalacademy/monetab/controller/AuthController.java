package ci.digitalacademy.monetab.controller;

import ci.digitalacademy.monetab.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class AuthController {

    @GetMapping
    public String index() {
        return "auth/index";
    }
}
