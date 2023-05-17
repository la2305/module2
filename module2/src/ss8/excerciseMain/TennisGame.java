package ss8.excerciseMain;

public class TennisGame {
    public static final char one_score = 1;
    public static final char second_score = 2;
    public static final char third_score = 3;
    public static final char zero_score = 0;


    public static String getScore(String playerFirstName, String playerSecondName, int scoreOfFirstPlayer, int scoreOfSecondPlayer) {
        String announceScore = "";
        int differenceScoreOfTwoPlayers;
        if (scoreOfFirstPlayer == scoreOfSecondPlayer) {
            switch (scoreOfFirstPlayer) {
                case zero_score:
                    announceScore = "Zero-All";
                    break;
                case one_score:
                    announceScore = "Fifteen-All";
                    break;
                case second_score:
                    announceScore = "Thirty-All";
                    break;
                case third_score:
                    announceScore = "Forty-All";
                    break;
                default:
                    announceScore = "Deuce";
                    break;
            }
        } else if (scoreOfFirstPlayer >= 4 || scoreOfSecondPlayer >= 4) {
            differenceScoreOfTwoPlayers = scoreOfFirstPlayer - scoreOfSecondPlayer;
            if (differenceScoreOfTwoPlayers == 1) announceScore = "Advantage for first player";
            else if (differenceScoreOfTwoPlayers == -1) announceScore = "Advantage for second player";
            else if (differenceScoreOfTwoPlayers >= 2) announceScore = "Win for first player";
            else announceScore = "Win for second player";
        } else {
            switch (scoreOfFirstPlayer) {
                case zero_score:
                    announceScore += "Zero";
                    break;
                case one_score:
                    announceScore += "Fifteen";
                    break;
                case second_score:
                    announceScore += "Thirty";
                    break;
                case third_score:
                    announceScore += "Forty";
                    break;
            }
            announceScore += "-";
            switch (scoreOfSecondPlayer) {
                case zero_score:
                    announceScore += "Zero";
                    break;
                case one_score:
                    announceScore += "Fifteen";
                    break;
                case second_score:
                    announceScore += "Thirty";
                    break;
                case third_score:
                    announceScore += "Forty";
                    break;
            }
        }
        return announceScore;
    }

//    public static void main(String[] args) {
//        System.out.println(getScore("AAA", "BBB", 0, 3));
//    }
}
