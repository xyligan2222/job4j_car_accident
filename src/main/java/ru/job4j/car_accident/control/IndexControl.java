package ru.job4j.car_accident.control;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class IndexControl {
    @GetMapping("/")
    public String index(Model model) {
        List<String> list = new ArrayList<String>();
        list.add("Petr");
        list.add("Andrew");
        list.add("Kolya");
        list.add("Kesha");
        list.add("Petr II");
        model.addAttribute("users", list);
        return "index";
    }
}