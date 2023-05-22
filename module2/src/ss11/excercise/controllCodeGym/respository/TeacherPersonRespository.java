package ss11.excercise.controllCodeGym.respository;

import ss11.excercise.controllCodeGym.model.Person;

import java.util.ArrayList;
import java.util.List;

public class TeacherPersonRespository implements IPersonRespository{
    private static List<Person> personTeachers = new ArrayList<>();
    static {
        personTeachers.add(new Person("1-003","Lê Độ 3","23/06/1990",true,"dạy tiếng anh"));
        personTeachers.add(new Person("1-004","Lê Độ 4","23/06/1989",false,"dạy tiếng pháp"));
    }
    @Override
    public List<Person> getAll() {
        return personTeachers;
    }

    @Override
    public void addPerson(Person person) {
        personTeachers.add(person);
    }

    @Override
    public Person getById(String id) {
        for (Person person: personTeachers) {
            if (person.getPersonId().equals(id)){
                return person;
            }
        }
        return null;
    }

    @Override
    public void removePerson(Person person) {
        personTeachers.remove(person);
    }
}
