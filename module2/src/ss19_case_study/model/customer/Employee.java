package ss19_case_study.model.customer;

public class Employee extends Person{
    private String level;
    private String position;
    private float salary;

    public Employee(String id, String name, String date, boolean gender, String identityCardNumber, String numberPhone, String email, String level, String location, float salary) {
        super(id, name, date, gender, identityCardNumber, numberPhone, email);
        this.level = level;
        this.position = location;
        this.salary = salary;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "level='" + level + '\'' +
                ", location='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }
}
