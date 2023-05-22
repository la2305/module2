package ss11.excercise.controllCodeGym.respository;

import ss11.excercise.controllCodeGym.model.Person;

import java.util.List;

public interface IPersonRespository {
    List<Person> getAll();
    void addPerson(Person person);
    Person getById(String id);
    void removePerson(Person person);
}
