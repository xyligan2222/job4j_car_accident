package ru.job4j.car_accident.repository;

import org.springframework.stereotype.Repository;
import ru.job4j.car_accident.model.Accident;
import ru.job4j.car_accident.model.AccidentType;
import ru.job4j.car_accident.model.Rule;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

//@Repository
public class AccidentMem {
//      `  private final HashMap<Integer, Accident> accidents = new HashMap<>();
//        private static final AtomicInteger ID = new AtomicInteger(5);
//        private final HashMap<Integer, AccidentType> types = new HashMap<>();
//        private  HashMap<Integer, Rule> rules = new HashMap<>();
//
//        private AccidentMem() {
//            types.put(0, AccidentType.of(0, "не выбрано"));
//            types.put(1, AccidentType.of(1, "Превышение скорости"));
//            types.put(2, AccidentType.of(2, "Пересечение двух сплошных полос"));
//            types.put(3, AccidentType.of(3, "Проезд на красный свет "));
//            types.put(4, AccidentType.of(4, "Остановка в неположенном месте"));
//
//            rules.put(0, Rule.of(0, "Статья 1"));
//            rules.put(1, Rule.of(1, "Статья 2"));
//            rules.put(2, Rule.of(2, "Статья 3"));
//            rules.put(3, Rule.of(3, "Статья 4"));
//        }
//
//        public Collection<Accident> findAllAccidents() {
//            return accidents.values();
//        }
//
//        public void create(Accident accident){
//            int currentId = ID.getAndIncrement();
//            accidents.put(currentId, new Accident(currentId, accident.getName(),
//                    accident.getText(), accident.getAddress(), accident.getType(), accident.getRules()));
//        }
//
//        public void edit(Accident accident){
//            accidents.replace(accident.getId(),accident);
//        }
//
//        public HashSet<Rule> convertRules (String[] rule){
//            HashSet<Rule> hashSet = new HashSet<>();
//                for (String rul: rule) {
//                    if (rules.containsKey(Integer.parseInt(rul))){
//                        hashSet.add(rules.get(Integer.parseInt(rul)));
//
//                    }
//                }
//            return hashSet;
//        }
//
//        public Collection<AccidentType> getAllTypes() {
//            return types.values();
//        }
//
//        public AccidentType findAccidentTypeById(int id) {
//            return types.get(id);
//        }
//
//        public Collection<Rule> getAllRules() {
//            return rules.values();
//        }
//
//        public void removeRules() {
//            rules = null;
//        }`


}
