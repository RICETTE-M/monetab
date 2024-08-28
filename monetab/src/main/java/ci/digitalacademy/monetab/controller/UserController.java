package ci.digitalacademy.monetab.controller;

import ci.digitalacademy.monetab.models.Student;
import ci.digitalacademy.monetab.models.Teacher;
import ci.digitalacademy.monetab.models.User;
import ci.digitalacademy.monetab.services.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/users")
@RequiredArgsConstructor
@Slf4j
public class UserController {

    private final UserService userService;

    @GetMapping
    public String showUserPage(Model model) {
        List<User> users = userService.findAll();
        model.addAttribute("users", users);
        return "user/user";
    }

    @PostMapping("/saveUser")
    public String saveUser(User user) {
        log.debug("Request to save user : {}", user);
        userService.save(user);
        return "redirect:/users";
    }

    @GetMapping("/Id")
    public String showUserIdPage(Model model, @PathVariable long id) {
        log.debug("Request to show update user forms");
        Optional<User> user = userService.findById(id);
        if (user.isPresent()) {
            model.addAttribute("user", user.get());
            return "user/updateUser";
        } else {
            return "redirect:/users";
        }
    }

    @GetMapping("adduser")
    public String showAddUserPage(Model model) {
        log.debug("Request to show add user");
        model.addAttribute("user", new User());
        return "user/form";
    }
    @GetMapping("updateuser")
    public String showUpdateUserPage() {
        return "user/form";
    }
}
