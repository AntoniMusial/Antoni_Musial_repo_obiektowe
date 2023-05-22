import java.util.HashMap;

public class Points {
    private HashMap<String, Integer> points;

    public Points(String[] players) {
        points = new HashMap<>();
        for (String player : players) {
            points.put(player, 0);
        }
    }

    public HashMap<String, Integer> getPoints() {
        return points;
    }

    public void countPoints(String playerName, boolean isConsonantGuessed, boolean isAnswerGuessed, int difficulty) {
        int currentPoints = points.getOrDefault(playerName, 0);
        
        // Assign points based on difficulty level for each correct answer
        if (isAnswerGuessed) {
            int answerPoints = 0;
            switch (difficulty) {
                case 1:
                    answerPoints = 10;
                    break;
                case 2:
                    answerPoints = 20;
                    break;
                case 3:
                    answerPoints = 30;
                    break;
            }
            currentPoints += answerPoints;
        }
        
        // Assign points based on difficulty level for each correct consonant
        if (isConsonantGuessed) {
            int consonantPoints = 0;
            switch (difficulty) {
                case 1:
                    consonantPoints = 1;
                    break;
                case 2:
                    consonantPoints = 2;
                    break;
                case 3:
                    consonantPoints = 3;
                    break;
            }
            currentPoints += consonantPoints;
        }
        
        points.put(playerName, currentPoints);
    }
}