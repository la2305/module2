package ss8.excercise;

public class abc {
    public static final char ADDITION = '+';
    public static final char SUBTRACTION = '-';
    public static final char MULTIPLICATION = '*';
    public static final char DIVISION = '/';
    public static String getScore(String playerFirstName, String playerSecondName, int scoreOfFirtPlayer, int scoreOfSecondPlayer) {
        String scoreString = "";
        int startingPoint = 0;
        if (scoreOfFirtPlayer == scoreOfSecondPlayer) {
            switch (scoreOfFirtPlayer) {
                case 0:
                    scoreString = "Love";
                    break;
                case 1:
                    scoreString = "Fifteen";
                    break;
                case 2:
                    scoreString = "Thirty";
                    break;
                case 3:
                    scoreString = "Forty";
                    break;
                default:
                    scoreString = "Deuce";
                    break;

            }
        } else if (scoreOfFirtPlayer >= 4 || scoreOfSecondPlayer >= 4) {
            int scoreDifferenceOfTwoPlayers = scoreOfFirtPlayer - scoreOfSecondPlayer;
            if (scoreDifferenceOfTwoPlayers == 1) scoreString = "Advantage for first player";
            else if (scoreDifferenceOfTwoPlayers == -1) scoreString = "Advantage for second player";
            else if (scoreDifferenceOfTwoPlayers >= 2) scoreString = "Win for first player ";
            else scoreString = "Win for second player";
        } else {
            for (int i = 1; i < 3; i++) {
                if (i == 1) startingPoint = scoreOfFirtPlayer;
                else {
                    scoreString += "-";
                    startingPoint = scoreOfSecondPlayer;
                }
                switch (startingPoint) {
                    case 0:
                        scoreString += "Love";
                        break;
                    case 1:
                        scoreString += "Fifteen";
                        break;
                    case 2:
                        scoreString += "Thirty";
                        break;
                    case 3:
                        scoreString += "Forty";
                        break;
                }
            }
        }
        return scoreString;
    }
}
