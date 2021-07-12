package ru.job4j.car_accident.service;

import org.springframework.stereotype.Service;
import ru.job4j.car_accident.model.Accident;
import ru.job4j.car_accident.repository.AccidentMem;

import java.util.Collection;
import java.util.HashMap;

@Service
public class AccidentService {
    private final AccidentMem store;

    public AccidentService(AccidentMem store) {
        this.store = store;
    }

    public Collection<Accident> findAllAccident() {
        return  store.findAllAccidents();
    }

}
