package ss11.excercise.controllCodeGym.model;

public class Student extends  Person{
    private String className;
    private float point;

    public Student(String personId, String personName, String personDate, boolean gender, String className, float point) {
        super(personId, personName, personDate, gender);
        this.className = className;
        this.point = point;
    }


    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public float getPoint() {
        return point;
    }

    public void setPoint(float point) {
        this.point = point;
    }

    @Override
    public String toString() {
        return super.toString()+"Student{" +
                "className='" + className + '\'' +
                ", point=" + point +
                '}';
    }
}
