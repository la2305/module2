package ss17.copy_binary;

import ss17.practice.Text;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CopyBinary implements Serializable {
    public static void main(String[] args) {
        List<Text> customersListFromFile = readFile("module2/src/ss17/copy_binary/123.txt");
        writeFile(customersListFromFile,"module2/src/ss17/copy_binary/12345.txt");
    }

    public static void writeFile(List<Text> customerList, String path) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(path);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(customerList);
            objectOutputStream.flush();
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            System.out.println("Không tìm thấy file");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }catch (Exception e){
            System.out.println("error");
        }
    }

    public static List<Text> readFile(String path) {
        List<Text> customerList = new ArrayList<>();
        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            byte[] lengthByte = fileInputStream.readAllBytes();
            System.out.println("Kích thước file là: "+lengthByte.length);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            customerList = (List<Text>) objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
        } catch (FileNotFoundException e) {
            System.out.println("Không tìm thấy file");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Không tìm thấy class");
        }catch (Exception e){
            System.out.println("error");
        }
        return customerList;
    }
}
