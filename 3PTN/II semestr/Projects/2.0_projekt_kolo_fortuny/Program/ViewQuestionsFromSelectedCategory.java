import java.util.HashMap;
public class ViewQuestionsFromSelectedCategory extends ChooseCategory {
    public void view(String selectedCategory) {
        Questions questions = new Questions();
        HashMap<String, Object[]> objects = questions.viewQuestions();

        Object[] selectedQuestions = objects.get(selectedCategory);
        for (Object question : selectedQuestions) {
            System.out.println(question);
        }
    }
}
