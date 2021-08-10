package ru.job4j.car_accident.repository;

import org.springframework.stereotype.Repository;
import ru.job4j.car_accident.model.Accident;
import ru.job4j.car_accident.model.AccidentType;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

@Repository
public class AccidentMem {
    private final HashMap<Integer, Accident> accidents = new HashMap<>();
    private static final AtomicInteger ID = new AtomicInteger(5);
    private final HashMap<Integer, AccidentType> types = new HashMap<>();

    private AccidentMem() {
        types.put(0, AccidentType.of(0, "не выбрано"));
        types.put(1, AccidentType.of(1, "Превышение скорости"));
        types.put(2, AccidentType.of(2, "Пересечение двух сплошных полос"));
        types.put(3, AccidentType.of(3, "Проезд на красный свет "));
        types.put(4, AccidentType.of(4, "Остановка в неположенном месте"));
    }

    public Collection<Accident> findAllAccidents() {
        return accidents.values();
    }

    public void create(Accident accident){
        int currentId = ID.getAndIncrement();
        accidents.put(currentId, new Accident(currentId, accident.getName(),
                accident.getText(), accident.getAddress(), accident.getType()));
    }

    public void edit(Accident accident){
        accidents.replace(accident.getId(),accident);
    }

    public Collection<AccidentType> getAllTypes() {
        return types.values();
    }

    public AccidentType findAccidentTypeById(int id) {
        return types.get(id);
    }


}
