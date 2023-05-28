package ss100;

public class alo {
    public static void main(String[] args) {
        try {
            int data = 5 / 0;
        } finally {
            System.out.println("Khối lệnh finally luôn được thực thi");
        }
        System.out.println("Finished!");
    }
}
