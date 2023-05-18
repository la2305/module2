package ss8.excerciseMain;

public class TennisGame {
    public static final char One_Score = 1;
    public static final char Second_Score = 2;
    public static final char Third_Score = 3;
    public static final char Zero_Score = 0;


    public static String getScoreCompare(int scoreOfFirstPlayer, int scoreOfSecondPlayer) {
        String announceScore = "";
        int differenceScoreOfTwoPlayers;
        if (scoreOfFirstPlayer == scoreOfSecondPlayer) {
            switch (scoreOfFirstPlayer) {
                case Zero_Score:
                    announceScore = "Zero-All";
                    break;
                case One_Score:
                    announceScore = "Fifteen-All";
                    break;
                case Second_Score:
                    announceScore = "Thirty-All";
                    break;
                case Third_Score:
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
                case Zero_Score:
                    announceScore += "Zero";
                    break;
                case One_Score:
                    announceScore += "Fifteen";
                    break;
                case Second_Score:
                    announceScore += "Thirty";
                    break;
                case Third_Score:
                    announceScore += "Forty";
                    break;
            }
        }
        return announceScore;
    }
}
