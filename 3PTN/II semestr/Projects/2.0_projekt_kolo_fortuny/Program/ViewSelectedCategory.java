import java.util.HashMap;

public class ViewSelectedCategory extends ChooseCategory {
    public void view(String selectedCategory) {
        Questions questions = new Questions();
        HashMap<String, Object[]> objects = questions.viewQuestions();
        Object[] selectedcategory = objects.get(selectedCategory);
        for (Object category : selectedcategory) {
            System.out.println(category);
        }
    }
}
