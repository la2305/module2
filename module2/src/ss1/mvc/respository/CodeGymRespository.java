package ss1.mvc.respository;

import ss1.mvc.model.Student;

public class CodeGymRespository {
    static Student[] studentList = new Student[100];

    static {
        Student student1 = new Student(1, "la1", true, "C03");
        Student student2 = new Student(2, "la2", true, "C03");
        Student student3 = new Student(3, "la3", false, "C03");
        Student student4 = new Student(4, "la4", false, "C03");
        studentList[0] = student1;
        studentList[1] = student2;
        studentList[2] = student3;
        studentList[3] = student4;
    }

    public static Student[] getStudentList() {
        return studentList;
    }
}
