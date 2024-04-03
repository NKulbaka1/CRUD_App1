package ru.kulbaka.springcourse.dao;

import org.springframework.stereotype.Component;
import ru.kulbaka.springcourse.models.Person;

import java.util.ArrayList;
import java.util.List;

@Component
public class PersonDAO {
    private static int PEOPLE_COUNT;
    private List<Person> people;

    public PersonDAO(){
        people = new ArrayList<>();

        people.add(new Person(++PEOPLE_COUNT, "Oleg"));
        people.add(new Person(++PEOPLE_COUNT, "Darya"));
        people.add(new Person(++PEOPLE_COUNT, "Nikita"));
    }

    public List<Person> index(){
        return people;
    }

    public Person show(int id){
        return people.stream()
                .filter(person -> person.getId() == id)
                .findAny()
                .orElse(null);
    }
}
