package ss11.excercise.controllCodeGym.model;

import java.util.Date;
import java.util.Objects;

public class Person {
    private String personId;
    private String personName;
    private String personDate;
    private boolean gender;

    public Person(String personId, String personName, String personDate, boolean gender) {
        this.personId = personId;
        this.personName = personName;
        this.personDate = personDate;
        this.gender = gender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(personId, person.personId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(personId);
    }

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getPersonDate() {
        return personDate;
    }

    public void setPersonDate(String personDate) {
        this.personDate = personDate;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "personId='" + personId + '\'' +
                ", personName='" + personName + '\'' +
                ", personDate='" + personDate + '\'' +
                ", gender=" + gender +
                '}';
    }
}
