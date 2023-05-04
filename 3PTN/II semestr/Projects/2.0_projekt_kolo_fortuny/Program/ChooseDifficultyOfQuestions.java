import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class ChooseDifficultyOfQuestions extends Questions {
    private Integer DifficultyOfQuestions;

    public Integer getDifficultyOfQuestions() {
        return DifficultyOfQuestions;
    }

    public void setDifficultyOfQuestions(Integer difficultyOfQuestions) {
        DifficultyOfQuestions = difficultyOfQuestions;
    }

    public void chooseDifficulty() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Choose the difficulty of questions (1 - easy, 2 - medium, 3 - hard) | ");
        this.DifficultyOfQuestions = scanner.nextInt();
    }

    public void randomizeDifficulty() {
        Random rand = new Random();
        this.DifficultyOfQuestions = rand.nextInt(3) + 1; // losuje od 1 do 3
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
