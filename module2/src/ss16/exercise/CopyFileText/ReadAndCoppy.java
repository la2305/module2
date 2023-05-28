package ss16.exercise.CopyFileText;

import com.sun.source.tree.TryTree;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReadAndCoppy {
    public static List<Integer> readFile(String filePath) {
        List<Integer> list = new ArrayList<>();
        try {
            File file = new File(filePath);
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                list.add(Integer.parseInt(line));
            }
            bufferedReader.close();
        }catch (IOException e){
            System.out.println("File không tồn tại hoặc nội dung có lỗi");
        } catch (Exception e) {
            System.err.println("Error");
        }
        return list;
    }

    public static void writeFile(String Path, List<Integer> integer) {
        try {
            File file = new File(Path);
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Integer n : integer) {
                System.out.println(n);
                bufferedWriter.write(n + "");
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("File không tồn tại hoặc có nội dung lỗi");
        } catch (Exception e) {
            System.out.println("error");
        }
    }

    public static void main(String[] args) {
        //Đường dẫn đầu vào file cần coppy
        List<Integer> numbers = readFile("module2/src/ss16/exercise/CopyFileText/alo.txt");
        //Đường dẫn đầu ra file được ghi
        writeFile("module2/src/ss16/exercise/CopyFileText/alo123.txt", numbers);
    }
}
