package ss11.excercise.controllCodeGym.model;

import java.util.Date;
import java.util.Objects;

public class Person {
    private String personId;
    private String personName;
    private String personDate;
    private String personClass;
    private boolean gender;
    private float personPoint;

    private String personSpecialize;
    public Person(){

    }

    public Person(String personId, String personName, String personDate,boolean gender, String personClass, float personPoint) {
        this.personId = personId;
        this.personName = personName;
        this.gender =gender;
        this.personDate = personDate;
        this.personClass = personClass;
        this.personPoint = personPoint;
    }
    public Person(String personId, String personName, String personDate,boolean gender, String personSpecialize) {
        this.personId = personId;
        this.personName = personName;
        this.gender =gender;
        this.personDate = personDate;
        this.personSpecialize = personSpecialize;
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

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
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

    public String getPersonClass() {
        return personClass;
    }

    public void setPersonClass(String personClass) {
        this.personClass = personClass;
    }

    public float getPersonPoint() {
        return personPoint;
    }

    public void setPersonPoint(float personPoint) {
        this.personPoint = personPoint;
    }

    public String getPersonSpecialize() {
        return personSpecialize;
    }

    public void setPersonSpecialize(String personSpecialize) {
        this.personSpecialize = personSpecialize;
    }

    @Override
    public String toString() {
        return "Person{" +
                "personId='" + personId + '\'' +
                ", personName='" + personName + '\'' +
                ", personDate=" + personDate +
                ", personClass='" + personClass + '\'' +
                ", personPoint=" + personPoint +
                ", personSpecialize='" + personSpecialize + '\'' +
                '}';
    }
}
