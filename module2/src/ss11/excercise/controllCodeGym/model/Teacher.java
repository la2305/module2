package ss11.excercise.controllCodeGym.model;

public class Teacher extends Person{
    private String specialize;

    public Teacher(String personId, String personName, String personDate, boolean gender, String specialize) {
        super(personId, personName, personDate, gender);
        this.specialize = specialize;
    }

    public String getSpecialize() {
        return specialize;
    }

    public void setSpecialize(String specialize) {
        this.specialize = specialize;
    }

    @Override
    public String toString() {
        return super.toString()+"Teacher{" +
                "specialize='" + specialize + '\'' +
                '}';
    }
}
