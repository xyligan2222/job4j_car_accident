package ru.job4j.car_accident.control;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.job4j.car_accident.model.Accident;
import ru.job4j.car_accident.model.AccidentType;
import ru.job4j.car_accident.model.Rule;
import ru.job4j.car_accident.repository.AccidentMem;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;


//@Controller
public class AccidentControl {
//    private final AccidentMem accidents;
//
//    public AccidentControl(AccidentMem accidents) {
//        this.accidents = accidents;
//    }
//
//    @GetMapping("/create")
//    public String create(Model model) {
//        model.addAttribute("types", accidents.getAllTypes());
//        model.addAttribute("rules", accidents.getAllRules());
//        return "create";
//    }
//
//    @PostMapping("/save")
//    public String save(@ModelAttribute Accident accident, HttpServletRequest req) {
//        String[] ids = req.getParameterValues("rIds");
//        AccidentType type = accidents.findAccidentTypeById(accident.getType().getId());
//        HashSet<Rule> rulesHash = accidents.convertRules(ids);
//        accident.setType(type);
//        accident.setRules(rulesHash);
//        accidents.create(accident);
//        return "redirect:/";
//    }
//    @PostMapping("/edit")
//    public String edit(@ModelAttribute Accident accident, HttpServletRequest req) {
//        String[] ids = req.getParameterValues("rIds");
//        AccidentType type = accidents.findAccidentTypeById(accident.getType().getId());
//        HashSet<Rule>rulesHash = accidents.convertRules(ids);
//        accident.setType(type);
//        accident.setRules(rulesHash);
//        accidents.edit(accident);
//        return "redirect:/";
//    }
//
//    @GetMapping("/edit")
//    public String edit(Model model) {
//        model.addAttribute("types", accidents.getAllTypes());
//        model.addAttribute("rules", accidents.getAllRules());
//        return "edit";
//    }
}