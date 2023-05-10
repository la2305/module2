package ss3.practice;

public class DesignShape {
    public static void main(String[] args) {
        for (int i = 1; i < 6; i++) {
            for (int j = 0; j < 2*6-1; j++) {
                if (6 - i-1 == j || j == 6 + i -1|| i == 6 - 1){
                    System.out.print(i);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }
}
