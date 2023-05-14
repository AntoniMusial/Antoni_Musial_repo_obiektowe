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
    
    public void drawQuestionForDifficultyAndCategory(String selectedCategory, Integer difficulty) {
        Questions questions = new Questions();
        HashMap<String, Object[]> objects = questions.viewQuestions();
    
        Object[] object = objects.get(selectedCategory);
        ArrayList<String> questionsList = (ArrayList<String>) object[0];
        ArrayList<String> difficulties = (ArrayList<String>) object[2];
        ArrayList<String> filteredQuestions = new ArrayList<>();
    
        for (int i = 0; i < difficulties.size(); i++) {
            if (difficulties.get(i).equals(difficulty.toString())) {
                filteredQuestions.add(questionsList.get(i));
            }
        }
    
        if (filteredQuestions.isEmpty()) {
            System.out.println("There are no questions with difficulty " + difficulty + " in category " + selectedCategory);
        } else {
            Random random = new Random();
            int randomIndex = random.nextInt(filteredQuestions.size());
            String question = filteredQuestions.get(randomIndex);
            System.out.println("Randomly chosen question for difficulty " + difficulty + " in category " + selectedCategory + ": " + question);
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
