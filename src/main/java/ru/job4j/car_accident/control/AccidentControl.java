package ru.job4j.car_accident.control;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import ru.job4j.car_accident.model.Accident;
import ru.job4j.car_accident.repository.AccidentMem;


@Controller
public class AccidentControl {
    private final AccidentMem accidents;

    public AccidentControl(AccidentMem accidents) {
        this.accidents = accidents;
    }

    @GetMapping("/create")
    public String create() {
        return "create";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute Accident accident) {
        accidents.create(accident);
        return "redirect:/";
    }
    @PostMapping("/edit")
    public String edit(@ModelAttribute Accident accident) {
        accidents.edit(accident);
        return "redirect:/";
    }

    @GetMapping("/edit")
    public String edit(Model model) {
        return "edit";
    }
}