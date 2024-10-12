package rw.ntarelabs.split.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWorldController {
    @GetMapping("/hello-world")
    public String HelloWorld(Model model) {
        model.addAttribute("message", "hello worlds");
        return "hello-world";
    }
}
