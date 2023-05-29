package ss11.excercise.controllCodeGym.common;

import ss11.excercise.controllCodeGym.model.Person;
import ss11.excercise.controllCodeGym.model.Student;
import ss11.excercise.controllCodeGym.model.Teacher;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndCoppy {
    private static final String FILE_PATH ="module2/src/ss11/excercise/controllCodeGym/data/person/person.csv";
    public static List<Person> readFile() {
        List<Person> list = new ArrayList<>();
        try {
            File file = new File(FILE_PATH);
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                String[] arrString =line.split(",");
                if (arrString.length ==6){
                    Person newStudent =new Student(arrString[0], arrString[1], arrString[2], Boolean.parseBoolean(arrString[3]), arrString[4], Float.parseFloat(arrString[5]));
                    list.add(newStudent);
                }else if (arrString.length ==5){
                    Person newTeacher = new Teacher(arrString[0], arrString[1], arrString[2], Boolean.parseBoolean(arrString[3]), arrString[4]);
                    list.add(newTeacher);
                }
            }
            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("File không tồn tại hoặc có nội dung lỗi");
        }catch (Exception e){
            System.out.println("error");
        }
        return list;
    }
    public static void writeFile(List<Person> persons){
        try {
            File file = new File(FILE_PATH);
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Person person:persons) {
                System.out.println(person);
                bufferedWriter.write(persons+"");
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
            bufferedWriter.close();
            fileWriter.close();
        }catch (IOException e) {
            System.out.println("File không tồn tại hoặc có nội dung lỗi");
        } catch (Exception e) {
            System.out.println("error");
        }
    }
}