import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class Questions {

    public HashMap<String, Object[]> viewQuestions() {
        String csvFile = "Questions.csv";
        String line;
        String csvSplitBy = ",";
        HashMap<String, Object[]> objects = new HashMap<>();
    
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
    
            while ((line = br.readLine()) != null) {
    
                String[] values = line.split(csvSplitBy);
    
                String category = values[0];
                String question = values[1];
                String answer = values[2];
                String difficulty = values[3];
    
                if (!objects.containsKey(category)) {
                    Object[] object = new Object[3];
                    object[0] = new ArrayList<String>();
                    object[1] = new ArrayList<String>();
                    object[2] = new ArrayList<String>();
                    objects.put(category, object);
                }
    
                ((ArrayList<String>)objects.get(category)[0]).add(question);
                ((ArrayList<String>)objects.get(category)[1]).add(answer);
                ((ArrayList<String>)objects.get(category)[2]).add(difficulty);
            }
    
        } catch (IOException e) {
            e.printStackTrace();
        }
    
        return objects;
    }
    
    public void displayQuestions() {
        HashMap<String, Object[]> objects = viewQuestions();
        for (String category : objects.keySet()) {
            Object[] object = objects.get(category);
            ArrayList<String> questions = (ArrayList<String>)object[0];
            ArrayList<String> answers = (ArrayList<String>)object[1];
            ArrayList<String> difficulties = (ArrayList<String>)object[2];
            
            System.out.println("Category | " + category + "\n");
            for (int i = 0; i < questions.size(); i++) {
                System.out.print("Question | " + questions.get(i) + "\n");
                System.out.print("Answer | " + answers.get(i) + "\n");
                System.out.print("Difficulty | " + difficulties.get(i) + "\n\n");
            }
            System.out.print("\n");
        }
    }

    public void displayQuestions(String difficulty) {
        HashMap<String, Object[]> objects = viewQuestions();
        for (String category : objects.keySet()) {
            Object[] object = objects.get(category);
            ArrayList<String> questions = (ArrayList<String>) object[0];
            ArrayList<String> answers = (ArrayList<String>) object[1];
            ArrayList<String> difficulties = (ArrayList<String>) object[2];
    
            System.out.println("Category | " + category + "\n");
            for (int i = 0; i < questions.size(); i++) {
                if (difficulties.get(i).equals(difficulty)) {  // dodajemy warunek, aby wyświetlać pytania tylko z wybranej trudności
                    System.out.print("Question | " + questions.get(i) + "\n");
                    System.out.print("Answer | " + answers.get(i) + "\n");
                    System.out.print("Difficulty | " + difficulties.get(i) + "\n\n");
                }
            }
            System.out.print("\n");
        }
    }
    

    public ArrayList<String> getCategoryNames() {
        ArrayList<String> categoryNames = new ArrayList<>();
        HashMap<String, Object[]> objects = viewQuestions();
        for (String category : objects.keySet()) {
            categoryNames.add(category);
        }
        return categoryNames;
    }    
}
