import java.util.ArrayList;
import java.util.Scanner;
import java.util.Locale.Category;

public class Play {
    private static Integer difficulty = 0;
    private static Integer NumberOfRounds;
    private static Boolean rngCategory = null;
    private static Integer Choose;
    private static Integer NumberOfPlayers;
    private static String[] PlayersName;
    private static Integer CurrentRound = 1;
    private static String selectedCategory = "";
    private static String PlayerAnswer = "";
    
    public static String getSelectedCategory() { return selectedCategory; }
    public static void setSelectedCategory(String selectedCategory) { Play.selectedCategory = selectedCategory; }

    public static Boolean getRngCategory() { return rngCategory; }
    public static void setRngCategory(Boolean rngCategory) { Play.rngCategory = rngCategory; }

    public static Integer getCurrentRound() { return CurrentRound; }
    public static void setCurrentRound(Integer currentRound) { CurrentRound = currentRound; }

    public static Integer getNumberOfRounds() { return NumberOfRounds; }
    public static void setNumberOfRounds(Integer numberOfRounds) { NumberOfRounds = numberOfRounds; }

    public static Integer getNumberOfPlayers() { return NumberOfPlayers; }
    public static void setNumberOfPlayers(Integer numberOfPlayers) { NumberOfPlayers = numberOfPlayers; }
    
    public static String[] getPlayersName() { return PlayersName; }
    public static void setPlayersName(String[] playersName) { PlayersName = playersName; }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Help help = new Help();
        Settings settings = new Settings();
        Questions questions = new Questions();
        ChooseCategory chooseCategory = new ChooseCategory();
        ViewQuestionsFromSelectedCategory viewQuestionsFromSelectedCategory = new ViewQuestionsFromSelectedCategory();
        ViewSelectedCategory viewSelectedCategory = new ViewSelectedCategory();
        Draw draw = new Draw();
        ChooseDifficultyOfQuestions chooseDifficultyOfQuestions = new ChooseDifficultyOfQuestions(settings);

        do {
            System.out.print("1 - Play\n2 - Settings\n3 - Help\n4 - Exit\n----------------------\nSelect number | ");
            Choose = sc.nextInt();

            if (Choose == 1) { // Play
                settings.cls();
                System.out.println("You have selected | Play\n----------------------");

                difficulty = chooseDifficultyOfQuestions.getDifficultyOfQuestions();
                NumberOfRounds = settings.getNumberOfRounds();
                NumberOfPlayers = settings.getNumberOfPlayers();
                PlayersName = settings.getPlayersName();
                selectedCategory = chooseCategory.getSelectedCategory();

                System.out.println("Checking your settings...\n");
                if (NumberOfPlayers != 0) { System.out.println("Number of players | Set"); }
                else { System.out.println("Number of players | Not set"); }
                if (PlayersName != null) { System.out.println("Players' name | Set"); }
                else { System.out.println("Players' name | Not set"); }
                if (NumberOfRounds != 0) { System.out.println("Number of rounds | Set"); }
                else { System.out.println("Number of rounds | Not set"); }
                if (difficulty != 0) { System.out.println("Difficulty | Set"); }
                else { System.out.println("Difficulty | Not set"); }
                if (selectedCategory != null && rngCategory != null) { System.out.println("Category | Set"); }
                else { System.out.println("Category | Not set"); }

                if (NumberOfPlayers != 0) {
                    if (PlayersName != null) {
                        if (NumberOfRounds != 0) {
                            if (difficulty != 0) {
                                if (selectedCategory != "" && rngCategory != null) {
                                    String question = draw.drawQuestionForDifficultyAndCategory(selectedCategory, difficulty);
                                    draw.answerPlayer(selectedCategory, question);

                                } else { System.out.println("Set category before starting the game.");}
                            } else { System.out.println("Set difficulty before starting the game.");}
                        } else { System.out.println("Set number of rounds before starting the game.");}
                    } else { System.out.println("Set players before starting the game.");}
                } else { System.out.println("Set numbers of players before starting the game.");}
                
            } else if (Choose == 2) { // Settings
                settings.cls();
                System.out.println("You have selected | Settings\n----------------------");

                do {
                    System.out.print("1 - Players\n2 - Rounds\n3 - Questions\n4 - Back\n----------------------\nSelect number | ");
                    Choose = sc.nextInt();

                    if (Choose == 1) {
                        settings.cls();
                        System.out.println("You have selected | Players\n----------------------");
                        
                        do {
                            System.out.print("1 - Set players\n2 - View players\n3 - Back\n----------------------\nSelect number | ");
                            Choose = sc.nextInt();
        
                            if (Choose == 1) {
                                settings.cls();
                                System.out.println("You have selected | Set players\n----------------------");

                                settings.setPlayers();
                                PlayersName = settings.getPlayersName();
                                NumberOfPlayers = settings.getNumberOfPlayers();

                            } else if (Choose == 2) {
                                settings.cls();
                                System.out.println("You have selected | View players\n----------------------");

                                settings.viewPlayers();

                            } else {
                                settings.cls();
                                System.out.println("Wrong number\n----------------------");

                            }
                        } while (Choose != 3);  Choose = 0;
                        
                    } else if (Choose == 2) {
                        settings.cls();
                        System.out.println("You have selected | Rounds\n----------------------");

                        do {
                            System.out.print("1 - Set number of rounds\n2 - View number of rounds\n3 - Back\n----------------------\nSelect number | ");
                            Choose = sc.nextInt();
        
                            if (Choose == 1) {
                                settings.cls();
                                System.out.println("You have selected | Set number of rounds");

                                settings.setRounds();
                                NumberOfRounds = settings.getNumberOfRounds();

                            } else if (Choose == 2) {
                                settings.cls();
                                System.out.println("You have selected | View number of rounds");

                                settings.viewRounds();

                            } else {
                                settings.cls();
                                System.out.println("Wrong number\n----------------------");

                            }
                        } while (Choose != 3);  Choose = 0;

                    } else if (Choose == 3) {
                        settings.cls();
                        System.out.println("You have selected | Questions\n----------------------");

                        do {
                            System.out.print("1 - Categories\n2 - Difficulty of questions\n3 - Display questions\n4 - Back\n----------------------\nSelect number | ");
                            Choose = sc.nextInt();

                            if (Choose == 1) {
                                settings.cls();
                                System.out.println("You have selected | Categories\n----------------------");

                                do {
                                    System.out.print("1 - Set categories\n2 - View all categories\n3 - View selected category\n4 - Back\n----------------------\nSelect number | ");
                                    Choose = sc.nextInt();

                                    if (Choose == 1) {
                                        settings.cls();
                                        System.out.println("You have selected | Set categories");
        
                                        do {
                                            System.out.print("1 - Random\n2 - Set Category\n3 - Back\n----------------------\nSelect number | ");
                                            Choose = sc.nextInt();
                        
                                            if (Choose == 1) {
                                                settings.cls();
                                                System.out.println("You have selected | Random");

                                                rngCategory = true;
                                                selectedCategory = "";
                                                selectedCategory = chooseCategory.setSelectedCategory(selectedCategory);
                                                setRngCategory(rngCategory);

                                                System.out.println("Now the questions in game will come from random categories.");
                
                                            } else if (Choose == 2) {
                                                settings.cls();
                                                System.out.println("You have selected | Set Category");

                                                rngCategory = false;
                                                chooseCategory.choose();
                                                setRngCategory(rngCategory);
                
                                            } else {
                                                settings.cls();
                                                System.out.println("Wrong number\n----------------------");
                
                                            }
                                        } while (Choose != 3);  Choose = 0;
        
                                    } else if (Choose == 2) {
                                        settings.cls();
                                        System.out.println("You have selected | View all categories");

                                        ArrayList<String> categoryNames = questions.getCategoryNames();
                                        for (String categoryName : categoryNames) {
                                            System.out.print("\n\t" + categoryName);
                                        }
                                        System.out.println("\n----------------------");
        
                                    } else if (Choose == 3) {
                                        settings.cls();
                                        System.out.println("You have selected | View selected category\n----------------------");
        
                                        selectedCategory = chooseCategory.getSelectedCategory();
                                        rngCategory = getRngCategory();

                                        if (rngCategory == null) { System.out.println("You haven't chosen any category."); }
                                        else if (rngCategory == true) { System.out.println("You chose a random category, if we showed it to you it wouldn't be random!"); }
                                        else { System.out.println("Selected category | " + selectedCategory); } 
                                    } else {
                                        settings.cls();
                                        System.out.println("Wrong number\n----------------------");
        
                                    }
                                } while (Choose != 4);  Choose = 0;

                            } else if (Choose == 2) {
                                settings.cls();
                                System.out.println("You have selected | Difficulty of questions");

                                do {
                                    System.out.print("1 - Set difficulty of questions\n2 - Set random difficulty of questions\n3 - Set increases difficulty (Only if you set number of rounds to minimum 3) [Recommended]\n4 - Back\n----------------------\nSelect number | ");
                                    Choose = sc.nextInt();

                                    if (Choose == 1) {
                                        settings.cls();
                                        System.out.println("You have selected | Set difficulty of questions");

                                        chooseDifficultyOfQuestions.chooseDifficulty();
                                        difficulty = chooseDifficultyOfQuestions.getDifficultyOfQuestions();

                                    } else if (Choose == 2) {
                                        settings.cls();
                                        System.out.println("You have selected | Set random difficulty of questions");

                                        chooseDifficultyOfQuestions.randomizeDifficulty();
                                        difficulty = chooseDifficultyOfQuestions.getDifficultyOfQuestions();

                                    } else if (Choose == 3) {
                                        settings.cls();
                                        System.out.println("You have selected | Set increases difficulty");
    
                                        NumberOfRounds = settings.getNumberOfRounds();
                                        if (NumberOfRounds >= 3) {
                                            chooseDifficultyOfQuestions.setIncreasedDifficulty();

                                        } else {
                                            System.out.println("Set number of rounds to 3 or bigger\nYour current number of rounds | " + NumberOfRounds);

                                        }


                                    } else {
                                        settings.cls();
                                        System.out.println("Wrong number\n----------------------");

                                    }
                                } while (Choose != 4);  Choose = 0;

                            } else if (Choose == 3) {
                                settings.cls();
                                System.out.println("You have selected | Display questions");

                                if (difficulty != 0) {
                                    chooseDifficultyOfQuestions.displayQuestions(difficulty.toString());

                                } else {
                                    questions.displayQuestions();
                                }

                            } else {
                                settings.cls();
                                System.out.println("Wrong number\n----------------------");

                            }
                        }
                        while (Choose != 4);
                        Choose = 0;
                    }
                } while (Choose != 4);  Choose = 0;

            } else if (Choose == 3) { // Help
                help.instruction();

            } else if (Choose == 4) { // Exit
                settings.cls();
                System.out.println("You have selected | Exit\n\nShutting down...");

            } else {
                settings.cls();
                System.out.println("Wrong number\n----------------------");

            }
        } while (Choose != 4);  Choose = 0;
    }
}
