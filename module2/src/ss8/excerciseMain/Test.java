package ss8.excerciseMain;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter score of first player");
        int scoreOfFirstPlayer = scanner.nextInt();
        System.out.println("Enter score of second player");
        int scoreOfSecondPlayer = scanner.nextInt();
        if (scoreOfFirstPlayer == scoreOfSecondPlayer || scoreOfFirstPlayer>=4 || scoreOfSecondPlayer>=4){
            System.out.println(TennisGame.getScoreCompare(scoreOfFirstPlayer,scoreOfSecondPlayer));
        } else {
            System.out.println(TennisGame.getScoreOfPlayer(scoreOfFirstPlayer,scoreOfSecondPlayer));
        }
    }
}
