package ru.job4j.car_accident.repository;

import org.springframework.stereotype.Repository;
import ru.job4j.car_accident.model.Accident;

import java.util.Collection;
import java.util.HashMap;

@Repository
public class AccidentMem {
    private final HashMap<Integer, Accident> accidents = new HashMap<>();

    private AccidentMem() {
        accidents.put(1, new Accident(1, "Петр", "Описание ", "Брянск"));
        accidents.put(2, new Accident(2, "Андрей", "Описание 2", "СПб"));
        accidents.put(3, new Accident(3, "Коля", "Описание 3", "СПб"));
        accidents.put(4, new Accident(4, "Армянин", "Описание 4", "Москва"));
    }

    public Collection<Accident> findAllAccidents() {
        return accidents.values();
    }
}
