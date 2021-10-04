package ru.job4j.car_accident.model;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.util.Objects;
import java.util.Set;
@Entity
@Table(name = "accident")
public class Accident {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
//    private String text;
//    private String address;
//    private AccidentType type;
//    private Set<Rule> rules;

    public Accident() {
    }

    public Accident(int id, String name) {
        this.id = id;
        this.name = name;
    }

//    public Accident(int id, String name, String text, String address, AccidentType type, Set<Rule> rules) {
//        this.id = id;
//        this.name = name;
//        this.text = text;
//        this.address = address;
//        this.type = type;
//        this.rules = rules;
//    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public String getText() {
//        return text;
//    }
//
//    public void setText(String text) {
//        this.text = text;
//    }
//
//    public String getAddress() {
//        return address;
//    }
//
//    public void setAddress(String address) {
//        this.address = address;
//    }
//
//    public AccidentType getType() {
//        return type;
//    }
//
//    public void setType(AccidentType type) {
//        this.type = type;
//    }
//
//    public Set<Rule> getRules() {
//        return rules;
//    }
//
//    public void setRules(Set<Rule> rules) {
//        this.rules = rules;
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Accident accident = (Accident) o;
        return id == accident.id
                && Objects.equals(name, accident.name);
//                && Objects.equals(text, accident.text)
//                && Objects.equals(address, accident.address)
//                && Objects.equals(type, accident.type)
//                && Objects.equals(rules, accident.rules);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Accident{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}