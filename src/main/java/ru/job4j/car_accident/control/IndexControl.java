package ru.job4j.car_accident.control;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.job4j.car_accident.repository.AccidentJdbcTemplate;
import ru.job4j.car_accident.service.AccidentService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class IndexControl {
    private final AccidentJdbcTemplate accidents;

    public IndexControl(AccidentJdbcTemplate accidents) {
        this.accidents = accidents;
    }

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("accidents", accidents.getAll());
        return "index";
    }
}