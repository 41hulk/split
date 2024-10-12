package rw.ntarelabs.split.controller;

import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    @GetMapping("")
    public String index() {
        return "index";
    }

    @GetMapping("/banner")
    public String banner(Model model) {
        model.addAttribute("title", "Spring I/O 2024");
        model.addAttribute("message","Join us in Barcelona, Spain from May 30 – 31");
        return "01/banner :: banner";
    }
}
