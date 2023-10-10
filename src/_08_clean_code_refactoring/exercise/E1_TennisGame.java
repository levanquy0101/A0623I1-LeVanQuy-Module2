package _08_clean_code_refactoring.exercise;

public class E1_TennisGame {
    private static final int LOVE = 0;
    private static final int FIFTEEN = 1;
    private static final int THIRTY = 2;
    private static final int FORTY = 3;

    public static String getScore(String player1Name, String player2Name, int m_score1, int m_score2) {
        if (m_score1 == m_score2) {
            return getEqualScore(m_score1);
        } else if (m_score1 >= 4 || m_score2 >= 4) {
            return getAdvantageOrWinScore(m_score1, m_score2);
        } else {
            return getRegularScore(m_score1, m_score2);
        }
    }

    private static String getEqualScore(int m_score1) {
        switch (m_score1) {
            case LOVE:
                return "Love-All";
            case FIFTEEN:
                return "Fifteen-All";
            case THIRTY:
                return "Thirty-All";
            case FORTY:
                return "Forty-All";
            default:
                return "Deuce";
        }
    }

    private static String getAdvantageOrWinScore(int m_score1, int m_score2) {
        int minusResult = m_score1 - m_score2;
        if (minusResult == 1) {
            return "Advantage player1";
        } else if (minusResult == -1) {
            return "Advantage player2";
        } else if (minusResult >= 2) {
            return "Win for player1";
        } else {
            return "Win for player2";
        }
    }

    private static String getRegularScore(int m_score1, int m_score2) {
        String score = "";
        for (int i = 1; i < 3; i++) {
            int tempScore = (i == 1) ? m_score1 : m_score2;
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
            if (i == 1) {
                score += "-";
            }
        }
        return score;
    }
}
