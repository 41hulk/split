package rw.ntarelabs.split.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import rw.ntarelabs.split.model.User;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {
    @GetMapping("variable-expression")
    public String variableExpression(Model model) {
        User user = new User("ntare", "guy@gmail.com", "ADMIN", "M");
        model.addAttribute("user", user);
        return "variable-expression";
    }

    @GetMapping("selection-expression")
    public String selectionExpression(Model model) {
        User user = new User("ntare", "guy@gmail.com", "ADMIN", "M");
        model.addAttribute("user", user);
        return "selection-expression";
    }

    @GetMapping("message-expression")
    public String messageExpression() {
        return "message-expression";
    }

    @GetMapping("link-expression")
    public String linkExpression(Model model) {
        model.addAttribute("id",1);
        return "link-expression";
    }

    @GetMapping("/fragment-expression")
    public String FragmentExpression() {
        return "fragment-expression";
    }

    @GetMapping("/users")
    public String users(Model model ) {
        User admin = new User("ntare", "guy@gmail.com", "ADMIN", "M");
        User guy = new User("ntare", "guy@gmail.com", "ADMIN", "M");
        User meena =  new User("meena", "guy@gmail.com", "ADMIN", "M");
        List<User> users = new ArrayList<>();
        users.add(admin);
        users.add(meena);
        users.add(guy);
        model.addAttribute("users", users);
        return "users";
    }

    @GetMapping("/if-unless")
    public String ifUnless(Model model ) {
        User admin = new User("admin", "guy@gmail.com", "ADMIN", "M");
        User guy = new User("stare", "guy@gmail.com", "USER", "M");
        User meena =  new User("meena", "gruy@gmail.com", "ADMIN", "F");
        List<User> users = new ArrayList<>();
        users.add(admin);
        users.add(meena);
        users.add(guy);
        model.addAttribute("users", users);
        return "if-unless";
    }

    @GetMapping("switch-case")
    public String switchCase(Model model) {
        User user = new User("ntare", "guy@gmail.com", "USERS", "M");
        model.addAttribute("user", user);
        return "switch-case";
    }
}

