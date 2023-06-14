package ss20_algorithm;

public class Unit21 {
    public static void main(String[] args) {
        int n = 12;
        int nGiaiThua = 1;
        for (int i = 1; i <= n; i++) {
            nGiaiThua *= i;
        }
        String string = String.valueOf(nGiaiThua);
        String [] array =string.split("");
        for (int i = array.length-1; i > 0; i--) {
            if (!array[i].equals("0")){
                System.out.println(array[i]);
                break;
            }
        }

    }
}
