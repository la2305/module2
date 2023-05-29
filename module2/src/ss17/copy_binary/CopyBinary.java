package ss17.copy_binary;

import ss17.practice.Customer;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CopyBinary implements Serializable {
    public static void main(String[] args) {
        List<Customer> customersListFromFile = readFile("module2/src/ss17/copy_binary/123.txt");
        writeFile(customersListFromFile,"module2/src/ss17/copy_binary/12345.txt");
    }

    public static void writeFile(List<Customer> customerList, String path) {
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
            System.out.println("Không đọc đươợc file");
        }catch (Exception e){
            System.out.println("error");
        }
    }

    public static List<Customer> readFile(String path) {
        List<Customer> customerList = new ArrayList<>();
        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            customerList = (List<Customer>) objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
        } catch (FileNotFoundException e) {
            System.out.println("Không tìm thấy file");
        } catch (IOException e) {
            System.out.println("Không đọc được file");
        } catch (ClassNotFoundException e) {
            System.out.println("Không tìm thấy class");
        }catch (Exception e){
            System.out.println("error");
        }
        return customerList;
    }
}
