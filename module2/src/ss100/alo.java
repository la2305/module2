package ss100;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class alo {
    public static List<Integer> readFile(String path) {
        List<Integer> list = new ArrayList<>();
        try {
            File file = new File(path);
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                list.add(Integer.parseInt(line));
            }
            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("File gốc không tìm thấy hoặc bị lỗi");
        } catch (Exception e) {
            System.out.println("Error");
        }
        return list;
    }

    public static void writeFile(String path, List<Integer> integers) {
        try {
            File file = new File(path);
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Integer n : integers) {
                System.out.println(n);
                bufferedWriter.write(n + "");
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("File mới không tìm thấy hoặc bị lỗi");
        } catch (Exception e) {
            System.out.println("Error");
        }
    }

    public static void main(String[] args) {
        List<Integer> alo = readFile("module2/src/ss100/filegoc");
        writeFile("module2/src/ss100/filemoi", alo);
    }
}
