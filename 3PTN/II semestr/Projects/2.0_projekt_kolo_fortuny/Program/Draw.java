import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Draw {
    private HashMap<String, Object[]> questions;
    private Random random;
    private Scanner scanner;
    private static Integer NumberOfRounds = 4;
    private static Integer NumberOfPlayers;
    private static String[] PlayersName = {"andrew", "dupa", "spierdalaj"};
    private static Integer CurrentRound = 0;
    private static String userAnswer;
    private ArrayList<String> drawnQuestions;
    
    public Draw() {
        Questions q = new Questions();
        questions = q.viewQuestions();
        random = new Random();
        scanner = new Scanner(System.in);
        drawnQuestions = new ArrayList<>();
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
        ArrayList<?> difficulties = (ArrayList<?>) object[2];
        int randomIndex = random.nextInt(difficulties.size());
        Integer difficulty = Integer.parseInt((String) difficulties.get(randomIndex)); // Parse the String to Integer
        
        System.out.println("Randomly chosen difficulty for category " + category + ": " + difficulty);
        return difficulty;
    }       

    public String drawQuestionForDifficultyAndCategory(String selectedCategory, Integer difficulty) {
        Questions questionsObj = new Questions();
        HashMap<String, Object[]> objects = questionsObj.viewQuestions();
        String question = null;
    
        Object[] object = objects.get(selectedCategory);
        ArrayList<String> questionsList = (ArrayList<String>) object[0];
        ArrayList<String> difficulties = (ArrayList<String>) object[2];
        ArrayList<String> filteredQuestions = new ArrayList<>();
    
        for (int i = 0; i < difficulties.size(); i++) {
            if (Integer.parseInt(difficulties.get(i)) == difficulty) {
                String currentQuestion = questionsList.get(i);
                if (!drawnQuestions.contains(currentQuestion)) {
                    filteredQuestions.add(currentQuestion);
                }
            }
        }
    
        if (filteredQuestions.isEmpty()) {
            System.out.println("There are no questions with difficulty " + difficulty + " in category " + selectedCategory);
        } else {
            int randomIndex = random.nextInt(filteredQuestions.size());
            question = filteredQuestions.get(randomIndex);
            drawnQuestions.add(question);
        }
    
        return question;
    }       
    
    public String randomCategory() {
        ArrayList<String> categories = new ArrayList<>(questions.keySet());
        int randomIndex = random.nextInt(categories.size());
        String category = categories.get(randomIndex);
    
        System.out.println("Randomly chosen category: " + category);
        return category;
    }
    
    public String answerPlayer(String category, String question, Integer numberOfPlayers) {
        HashMap<Character, Integer> consonantCount = new HashMap<>();
        StringBuilder censoredAnswer = new StringBuilder();
        numberOfPlayers = 3;
    
        // Pobierz odpowiedzi dla danej kategorii
        Object[] object = questions.get(category);
        ArrayList<String> answers = (ArrayList<String>) object[1];
        
        // Znajdź indeks pytania w liście pytań
        int questionIndex = ((ArrayList<String>) object[0]).indexOf(question);
        if (questionIndex == -1) {
            System.out.println("Question not found.");
            return null;
        }
        
        // Pobierz odpowiedź dla pytania
        String answer = answers.get(questionIndex);
    
        // Iteruj przez odpowiedź i ocenzuruj spółgłoskami
        for (int i = 0; i < answer.length(); i++) {
            char c = answer.charAt(i);
            if (Character.isLetter(c) && isConsonant(c)) {
                if (!consonantCount.containsKey(c)) {
                    censoredAnswer.append("*");
                } else {
                    censoredAnswer.append(c);
                }
                consonantCount.put(c, consonantCount.getOrDefault(c, 0) + 1);
            } else {
                censoredAnswer.append(c);
            }
        }
        
        do {
            // Wyświetl kategorię, trudność pytania, pytanie i ocenzurowaną odpowiedź
            System.out.println("Category | " + category);
            System.out.println("Question | " + question);
            System.out.println("Censored Answer | " + censoredAnswer.toString());
            
            // Pobierz odpowiedź od użytkownika w pętli dopóki nie będzie poprawna
            for (int i = 0; i < numberOfPlayers; i++) {
                System.out.println("Your turn " + PlayersName[i]);
                userAnswer = scanner.nextLine();
                
                if (userAnswer.equalsIgnoreCase(answer)) {
                    System.out.println("Congratulations! You answered correctly.");
                    return "Correct";
                } else if (userAnswer.length() == 1 && isConsonant(userAnswer.charAt(0))) {
                    // Jeżeli użytkownik podał spółgłoskę, sprawdź czy występuje w ocenzurowanej odpowiedzi
                    char consonant = Character.toLowerCase(userAnswer.charAt(0));
                    if (consonantCount.containsKey(consonant)) {
                        // Usuń cenzurę dla podanej spółgłoski
                        int index = censoredAnswer.indexOf("*");
                        while (index != -1) {
                            if (Character.toLowerCase(answer.charAt(index)) == consonant) {
                                censoredAnswer.setCharAt(index, answer.charAt(index));
                            }
                            index = censoredAnswer.indexOf("*", index + 1);
                        }
                        System.out.println("Censored Answer (after revealing | " + consonant + ") | " + censoredAnswer.toString());
                    } else {
                        System.out.println("The consonant does not exist in the censored answer.");
                    }
                } else {
                    System.out.println("Sorry, your answer is incorrect.");
                }
            }
        } while (!censoredAnswer.toString().equals(answer));
        
        return "Round is Over";
    }    
       
    // Metoda pomocnicza do sprawdzania, czy znak jest spółgłoską
    private boolean isConsonant(char c) {
        c = Character.toLowerCase(c);
        return c >= 'b' && c <= 'z' && c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u';
    }
    
    public static void main(String[] args) {
        Draw draw = new Draw();
        String selectedCategory = "Robotics";
        Integer difficulty = 1;

        do {
            CurrentRound ++;
            System.out.println("Current round | " + CurrentRound + "/" + NumberOfRounds);
            String question = draw.drawQuestionForDifficultyAndCategory(selectedCategory, difficulty);
            String result = draw.answerPlayer(selectedCategory, question, NumberOfPlayers);
            System.out.println("Result | " + result);
        } while (CurrentRound != NumberOfRounds);
    }
}
