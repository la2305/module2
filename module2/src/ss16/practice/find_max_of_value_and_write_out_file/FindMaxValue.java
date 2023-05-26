package ss16.practice.find_max_of_value_and_write_out_file;

import java.util.List;

public class FindMaxValue {
    public static int findMax(List<Integer> numbers) {
        int max = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            if (max < numbers.get(i)) {
                max = numbers.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<Integer> numbers = readAndWriteFile.readFile("C:\\Users\\La\\Desktop\\number.txt");
        int maxValue = findMax(numbers);
        readAndWriteFile.writeFile("C:\\Users\\La\\Desktop\\result.txt", maxValue);
    }
}
