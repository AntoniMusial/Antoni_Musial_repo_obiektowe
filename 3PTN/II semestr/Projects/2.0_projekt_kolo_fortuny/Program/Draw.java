import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Draw {
    private HashMap<String, Object[]> questions;
    private Random random;
    
    public Draw() {
        Questions q = new Questions();
        questions = q.viewQuestions();
        random = new Random();
    }
    
    public String drawCategory() {
        ArrayList<String> categories = new ArrayList<>(questions.keySet());
        int randomIndex = random.nextInt(categories.size());
        String category = categories.get(randomIndex);
    
        System.out.println("Randomly chosen category: " + category);
        return category;
    }
    
    public Integer drawDifficultyForCategory(String category) {
        Object[] object = questions.get(category);
        ArrayList<Integer> difficulties = (ArrayList<Integer>) object[2];
        int randomIndex = random.nextInt(difficulties.size());
        Integer difficulty = difficulties.get(randomIndex);
    
        System.out.println("Randomly chosen difficulty for category " + category + ": " + difficulty);
        return difficulty;
    }
    
    public void drawQuestionForDifficultyAndCategory(String category, Integer difficulty) {
        Object[] object = questions.get(category);
        ArrayList<String> questions = (ArrayList<String>) object[0];
        ArrayList<String> difficulties = (ArrayList<String>) object[2];
        ArrayList<String> filteredQuestions = new ArrayList<>();
        
        for (int i = 0; i < difficulties.size(); i++) {
            if (difficulties.get(i).equals(difficulty)) {
                filteredQuestions.add(questions.get(i));
            }
        }
        
        if (filteredQuestions.isEmpty()) {
            System.out.println("There are no questions with difficulty " + difficulty + " in category " + category);
        } else {
            int randomIndex = random.nextInt(filteredQuestions.size());
            String question = filteredQuestions.get(randomIndex);
            System.out.println("Randomly chosen question for difficulty " + difficulty + " in category " + category + ": " + question);
        }
    }

    public String randomCategory() {
        ArrayList<String> categories = new ArrayList<>(questions.keySet());
        int randomIndex = random.nextInt(categories.size());
        String category = categories.get(randomIndex);
    
        System.out.println("Randomly chosen category: " + category);
        return category;
    }
    
    
    public static void main(String[] args) {
        Draw draw = new Draw();
        String category = draw.drawCategory();
        Integer difficulty = draw.drawDifficultyForCategory(category);
        draw.drawQuestionForDifficultyAndCategory(category, difficulty);
        draw.randomCategory();
    }
}
