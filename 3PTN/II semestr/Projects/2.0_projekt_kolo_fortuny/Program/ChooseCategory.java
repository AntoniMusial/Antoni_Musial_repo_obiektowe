import java.util.Scanner;
import java.util.HashMap;

public class ChooseCategory extends Questions {
    public void choose() {
        Questions questions = new Questions();
        HashMap<String, Object[]> objects = questions.viewQuestions();
        System.out.println("Categories");
        for (String category : objects.keySet()) {
            System.out.println(category);
        }
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Wybierz kategorię | ");
        String selectedCategory = scanner.nextLine();
        
        while (!objects.containsKey(selectedCategory)) {
            System.out.println("Not Found this category | " + selectedCategory);
            System.out.print("Please choose other category | ");
            selectedCategory = scanner.nextLine();
        }
        
        Object[] selectedQuestions = objects.get(selectedCategory);
        for (Object question : selectedQuestions) {
            System.out.println(question);
        }
    }    

    public static void main(String[] args) {
        ChooseCategory choosecategory = new ChooseCategory();
        choosecategory.choose();
    }
}
