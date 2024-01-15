package be.tftic.java.exo.mvc.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

@Controller
public class CoreController {

    @GetMapping({
            "",
            "index",
            "index.html"
    })
    public String home(Model model){
        model.addAttribute("date", LocalDate.now());
        return "core/index";
    }

}
