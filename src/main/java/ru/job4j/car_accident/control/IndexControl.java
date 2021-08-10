package ru.job4j.car_accident.control;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.job4j.car_accident.service.AccidentService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class IndexControl {
    private final AccidentService service;

    public IndexControl(AccidentService service) {
        this.service = service;
    }
    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("users", service.findAllAccident());
        model.addAttribute("types", service.getAllTypes());
        return "index";
    }
}