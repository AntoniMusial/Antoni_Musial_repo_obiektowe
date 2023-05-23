import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Points {
    private HashMap<String, Integer> points;
    private HashMap<String, Integer> cash;
    static Random rng = new Random();
    private static Integer cashFromWheelOfFortune[] = {0, 1500, 250, 150, 200, 300, 500, 1000, 350, 1, 400}; // 0 - Bankrut, 1 - Stop
    private static Integer randomIndex;
    private static Integer randomCash;

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

    public static void randomMoney() {
        randomIndex = rng.nextInt(cashFromWheelOfFortune.length);
        randomCash = cashFromWheelOfFortune[randomIndex];
    }

    public void countCash(String playerName, boolean isConsonantGuessed, boolean isAnswerGuessed) {
        int currentCash = cash.getOrDefault(playerName, 0);
        int money
        
        // Assign cash for each correct consonant
        if (isConsonantGuessed) {
            
        }
        
        // Assign cash for each correct answer
        if (isAnswerGuessed) {
            cash.put(playerName, currentCash);
        }        
    }

    public static void main(String[] args) {
        Points.randomMoney();
    }
}