package ru.job4j.car_accident.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import ru.job4j.car_accident.model.Accident;

import java.util.List;

@Repository
public class AccidentHibernate {
    private final SessionFactory sf;

    public AccidentHibernate(SessionFactory sf) {
        this.sf = sf;
    }

    public Accident save(Accident accident) {
        try (Session session = sf.openSession()) {
            session.save(accident);
            return accident;
        }
    }

    public List<Accident> getAll() {
        try (Session session = sf.openSession()) {
            return session
                    .createQuery("select a.name from Accident as A ", Accident.class)
                    .list();
        }
    }
}
