package rw.ntarelabs.split.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import rw.ntarelabs.split.model.UserForm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class FormController {
    @GetMapping("register-form")
    public String register(Model model) {
        UserForm userForm = new UserForm();
        model.addAttribute("userForm", userForm);

        List<String> listProffession = Arrays.asList("Developer", "Tester", "Architect");
        model.addAttribute("listProfession", listProffession);
        return "register-form";
    }

    @PostMapping("register/save")
    public String submitForm(@ModelAttribute("userForm") UserForm userForm, Model model) {
        model.addAttribute("userForm", userForm);
        return "register-success";
    }

}
