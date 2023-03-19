import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class Questions {

    public void vievQuestions() {
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

        for (String category : objects.keySet()) {
            Object[] object = objects.get(category);
            ArrayList<String> questions = (ArrayList<String>)object[0];
            ArrayList<String> answers = (ArrayList<String>)object[1];
            ArrayList<String> difficulties = (ArrayList<String>)object[2];
            System.out.println(category);
            System.out.println("Questions: " + questions.toString());
            System.out.println("Answers: " + answers.toString());
            System.out.println("Difficulties: " + difficulties.toString() + "\n");
        }
    }
}