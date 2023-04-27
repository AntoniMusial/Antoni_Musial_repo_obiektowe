import java.util.Scanner;

public class Play {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Help help = new Help();
        Settings settings = new Settings();
        Questions questions = new Questions();
        ChooseCategory chooseCategory = new ChooseCategory();
        ViewQuestionsFromSelectedCategory viewQuestionsFromSelectedCategory = new ViewQuestionsFromSelectedCategory();
        ViewSelectedCategory viewSelectedCategory = new ViewSelectedCategory();
        Draw draw = new Draw();
        
        int Choose;
        do {
            System.out.print("1 - Play\n2 - Settings\n3 - Help\n4 - Exit\n----------------------\nSelect number | ");
            Choose = sc.nextInt();

            if (Choose == 1) { // Play
                settings.cls();
                System.out.println("You have selected | Play\n----------------------");
                questions.displayQuestions();
                
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

                            } else if (Choose == 2) {
                                settings.cls();
                                System.out.println("You have selected | View players\n----------------------");
                                settings.viewPlayers();

                            } else {
                                settings.cls();
                                System.out.println("Wrong number\n----------------------");

                            }
                        }
                        while (Choose != 3);
                        
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

                            } else if (Choose == 2) {
                                settings.cls();
                                System.out.println("You have selected | View number of rounds");
                                settings.vievRounds();

                            } else {
                                settings.cls();
                                System.out.println("Wrong number\n----------------------");

                            }
                        }
                        while (Choose != 3);

                    } else if (Choose == 3) {
                        settings.cls();
                        System.out.println("You have selected | Questions\n----------------------");

                        do {
                            System.out.print("1 - Categories\n2 - Difficulty of questions\n3 - Questions\n4 - Back\n----------------------\nSelect number | ");
                            Choose = sc.nextInt();

                            if (Choose == 1) {
                                settings.cls();
                                System.out.println("You have selected | Categories");

                                do {
                                    System.out.print("1 - Set categories\n2 - Set random categories\n3 - View all categories\n4 - View selected category\n5 - Back\n----------------------\nSelect number | ");
                                    Choose = sc.nextInt();

                                    if (Choose == 1) {
                                        settings.cls();
                                        System.out.println("You have selected | Set categories");
        
                                        do {
                                            System.out.print("1 - Random\n2 - Set 1 Category\n3 - Back\n----------------------\nSelect number | ");
                                            Choose = sc.nextInt();
                        
                                            if (Choose == 1) {
                                                settings.cls();
                                                System.out.println("You have selected | Random");
                                                System.out.println("Now the questions in game will come from random categories.");
                
                                            } else if (Choose == 2) {
                                                settings.cls();
                                                System.out.println("You have selected | Set 1 Category");
                                                chooseCategory.choose();
                
                                            } else {
                                                settings.cls();
                                                System.out.println("Wrong number\n----------------------");
                
                                            }
                                        }
                                        while (Choose != 3);
        
                                    } else if (Choose == 2) {
                                        settings.cls();
                                        System.out.println("You have selected | Set random categories");
        
                                    } else if (Choose == 3) {
                                        settings.cls();
                                        System.out.println("You have selected | View all categories");
                                        settings.vievRounds();
        
                                    } else if (Choose == 4) {
                                        settings.cls();
                                        System.out.println("You have selected | View selected category\n----------------------");
        
                                        viewSelectedCategory.view(chooseCategory.selectedCategory);
                                        System.out.println("Selected category: " + chooseCategory.selectedCategory);
        
                                    } else {
                                        settings.cls();
                                        System.out.println("Wrong number\n----------------------");
        
                                    }
                                }
                                while (Choose != 5);

                            } else if (Choose == 2) {
                                settings.cls();
                                System.out.println("You have selected | Difficulty of questions");

                            } else if (Choose == 3) {
                                settings.cls();
                                System.out.println("You have selected | Questions");

                            } else {
                                settings.cls();
                                System.out.println("Wrong number\n----------------------");

                            }
                        }
                        while (Choose != 4);
                    }
                }
                while (Choose != 3);

            } else if (Choose == 3) { // Help
                help.instruction();

            } else if (Choose == 4) { // Exit
                settings.cls();
                System.out.println("You have selected | Exit\n\nShutting down...");

            } else {
                settings.cls();
                System.out.println("Wrong number\n----------------------");

            }
        }
        while (Choose != 4);
    }
}
