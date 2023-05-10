import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class ChooseDifficultyOfQuestions extends Questions {
    Settings settings;
    Play play = new Play();
    private Integer DifficultyOfQuestions = 0;

    public ChooseDifficultyOfQuestions(Settings settings) { this.settings = settings; }
    public Integer getDifficultyOfQuestions() { return DifficultyOfQuestions; }
    public void setDifficultyOfQuestions(Integer difficultyOfQuestions) { DifficultyOfQuestions = difficultyOfQuestions; }

    public void chooseDifficulty() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Choose the difficulty of questions (1 - easy, 2 - medium, 3 - hard) | ");
        this.DifficultyOfQuestions = scanner.nextInt();
    }

    public void randomizeDifficulty() {
        Random rand = new Random();
        this.DifficultyOfQuestions = rand.nextInt(3) + 1; // losuje od 1 do 3
    }

    public void setIncreasedDifficulty() {
        Integer NumberOfRounds = settings.getNumberOfRounds();
        Integer CurrentRound = play.getCurrentRound();
        System.out.println(NumberOfRounds);

        if (NumberOfRounds == 3) {
            if (CurrentRound == 1) { this.DifficultyOfQuestions = 1; }
            if (CurrentRound == 2) { this.DifficultyOfQuestions = 2; }
            if (CurrentRound == 3) { this.DifficultyOfQuestions = 3; }

        } else if (NumberOfRounds == 4) {
            if (CurrentRound == 1) { this.DifficultyOfQuestions = 1; }
            if (CurrentRound == 2) { this.DifficultyOfQuestions = 2; }
            if (CurrentRound == 3) { this.DifficultyOfQuestions = 3; }
            if (CurrentRound == 4) { this.DifficultyOfQuestions = 3; }

        }
    }

    @Override
    public void displayQuestions() {
        HashMap<String, Object[]> objects = viewQuestions();
        for (String category : objects.keySet()) {
            Object[] object = objects.get(category);
            ArrayList<String> questions = (ArrayList<String>)object[0];
            ArrayList<String> answers = (ArrayList<String>)object[1];
            ArrayList<String> difficulties = (ArrayList<String>)object[2];
            
            System.out.println("Category | " + category + "\n");
            for (int i = 0; i < questions.size(); i++) {
                if (difficulties.get(i).equals(DifficultyOfQuestions.toString())) {
                    System.out.print("Question | " + questions.get(i) + "\n");
                    System.out.print("Answer | " + answers.get(i) + "\n");
                    System.out.print("Difficulty | " + difficulties.get(i) + "\n\n");
                }
            }
            System.out.print("\n");
        }
    }
}
