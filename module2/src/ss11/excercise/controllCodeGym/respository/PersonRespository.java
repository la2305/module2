package ss11.excercise.controllCodeGym.respository;

import ss11.excercise.controllCodeGym.common.ReadAndCoppy;
import ss11.excercise.controllCodeGym.model.Person;
import ss11.excercise.controllCodeGym.model.Student;
import ss11.excercise.controllCodeGym.model.Teacher;

import java.util.ArrayList;
import java.util.List;

public class PersonRespository implements IPersonRespository {
    private static List<Person> persons = new ArrayList<>();


    @Override
    public List<Person> getAll() {
        persons = ReadAndCoppy.readFile();
        return persons;
    }

    @Override
    public void addPerson(Person person) {
        persons = ReadAndCoppy.readFile();
        persons.add(person);
        ReadAndCoppy.writeFile(persons);
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
        persons = ReadAndCoppy.readFile();
        persons.remove(person);
        ReadAndCoppy.writeFile(persons);
    }
}
