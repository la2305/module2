package ss11.excercise.controllCodeGym.respository;

import ss11.excercise.controllCodeGym.model.Person;
import ss11.excercise.controllCodeGym.model.Student;
import ss11.excercise.controllCodeGym.model.Teacher;

import java.util.ArrayList;
import java.util.List;

public class PersonRespository implements IPersonRespository {
    private static List<Person> persons = new ArrayList<>();

    static {
        persons.add(new Student("1-001", "La 1", "25/05/2000", true, "C03", 5));
        persons.add(new Teacher("2-001", "Lu 1", "25/05/1990", true, "Dạy tiếng anh"));
    }

    @Override
    public List<Person> getAll() {
        return persons;
    }

    @Override
    public void addPerson(Person person) {
        persons.add(person);
    }

    @Override
    public Person getById(String id) {
        for (Person person:persons) {
            if (person.getPersonId().equals(id)){
                return person;
            }
        }
        return null;
    }

    @Override
    public void removePerson(Person person) {
        persons.remove(person);
    }
}
