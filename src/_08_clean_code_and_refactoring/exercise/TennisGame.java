package _08_clean_code_and_refactoring.exercise;

public class TennisGame {
    public static void main(String[] args) {
        System.out.println(getScore("uyen1","uyen2",9,10));
    }

    public static String getScore(String player1Name, String player2Name, int scorePlayer1, int scorePlayer2) {
        String score = "";

        int minusResult;
        int tempScore = 0;
        boolean isScore = scorePlayer1 == scorePlayer2;
        boolean isScore2 = scorePlayer1 >= 4 || scorePlayer2 >= 4;
        if (isScore) {
            score = getScore(scorePlayer1);
        } else if (isScore2) {
            getStringScore(scorePlayer1, scorePlayer2, score);
        } else {
            minusResult=scorePlayer1-scorePlayer2;
            findWinGamer(minusResult);
        }
        return score;
    }

    public static void getStringScore(int scorePlayer1, int scorePlayer2, String score) {
        final int LOVE = 0;
        final int FIFTEEN = 1;
        final int THIRTY = 2;
        final int FORTY = 3;
        int tempScore;
        for (int i = 1; i < 3; i++) {
            if (i == 1) tempScore = scorePlayer1;
            else {
                score += "-";
                tempScore = scorePlayer2;
            }
            switch (tempScore) {
                case LOVE:
                    score += "Love";
                    break;
                case FIFTEEN:
                    score += "Fifteen";
                    break;
                case THIRTY:
                    score += "Thirty";
                    break;
                case FORTY:
                    score += "Forty";
                    break;
            }
        }
    }

    public static String getScore(int scorePlayer1) {
        String score;
        final int LOVE = 0;
        final int FIFTEEN = 1;
        final int THIRTY = 2;
        final int FORTY = 3;
        switch (scorePlayer1) {
            case LOVE:
                score = "Love-All";
                break;
            case FIFTEEN:
                score = "Fifteen-All";
                break;
            case THIRTY:
                score = "Thirty-All";
                break;
            case FORTY:
                score = "Forty-All";
                break;
            default:
                score = "Deuce";
                break;

        }
        return score;
    }

    public static String findWinGamer(int minusResult) {
        String score;
        if (minusResult == 1) {
            score = "Advantage player1";
        }
        else if (minusResult == -1) {
            score = "Advantage player2";
        }
        else if (minusResult >= 2){
            score = "Win for player1";
        }
        else{
            score = "Win for player2";
        }
        return score;
    }
}
