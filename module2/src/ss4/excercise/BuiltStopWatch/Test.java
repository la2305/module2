package ss4.excercise.BuiltStopWatch;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BuiltStopWatch test = new BuiltStopWatch();
        System.out.println("Enter a character to start couting time");
        int enterToStart = scanner.nextInt();
        test.start();
        System.out.println("Enter a character to end couting time");
        int enterToEnd = scanner.nextInt();
        test.stop();
        System.out.println("Elapsed time: "+(-test.getElapsedTime()/1000)+" second");
    }
}
