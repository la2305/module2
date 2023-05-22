package ss11.excercise.controllCodeGym.respository;

import ss11.excercise.controllCodeGym.model.Person;

import java.util.ArrayList;
import java.util.List;

public class StudentPersonRespository implements IPersonRespository {
    private static List<Person> personStudents = new ArrayList<>();

    static {
        personStudents.add(new Person("1-001", "Lê La 1", "25/05/1998", true, "C03",5));
        personStudents.add(new Person("1-002", "Lê La 2", "25/05/1999", true, "C03",10));
    }

    @Override
    public List<Person> getAll() {
        return personStudents;
    }

    @Override
    public void addPerson(Person person) {
        personStudents.add(person);
    }

    @Override
    public Person getById(String id) {
        for (Person person : personStudents) {
            if (person.getPersonId().equals(id)) {
                return person;
            }
        }
        return null;
    }

    @Override
    public void removePerson(Person person) {
        personStudents.remove(person);
    }
}
