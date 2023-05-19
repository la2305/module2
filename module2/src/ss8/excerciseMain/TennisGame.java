package ss8.excerciseMain;

public class TennisGame {
    public static final char ONE_SCORE = 1;
    public static final char SECOND_SCORE = 2;
    public static final char THIRD_SCORE = 3;
    public static final char ZERO_SCORE = 0;


    public static String getScoreCompare(int scoreOfFirstPlayer, int scoreOfSecondPlayer) {
        String announceScore = "";
        int differenceScoreOfTwoPlayers;
        if (scoreOfFirstPlayer == scoreOfSecondPlayer) {
            switch (scoreOfFirstPlayer) {
                case ZERO_SCORE:
                    announceScore = "Zero-All";
                    break;
                case ONE_SCORE:
                    announceScore = "Fifteen-All";
                    break;
                case SECOND_SCORE:
                    announceScore = "Thirty-All";
                    break;
                case THIRD_SCORE:
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
        }
        return announceScore;
    }

    public static String getScoreOfEachOtherPlayer(int scoreOfFirstPlayer, int scoreOfSecondPlayer) {
        String announceScore = "";
        int startingPoint = 0;
        for (int i = 1; i < 3; i++) {
            if (i == 1) startingPoint = scoreOfFirstPlayer;
            else {
                announceScore += "-";
                startingPoint = scoreOfSecondPlayer;
            }
            switch (startingPoint) {
                case ZERO_SCORE:
                    announceScore += "Zero";
                    break;
                case ONE_SCORE:
                    announceScore += "Fifteen";
                    break;
                case SECOND_SCORE:
                    announceScore += "Thirty";
                    break;
                case THIRD_SCORE:
                    announceScore += "Forty";
                    break;
            }
        }
        return announceScore;
    }
}
