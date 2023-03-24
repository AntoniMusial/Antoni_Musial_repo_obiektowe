import java.util.Scanner;

public class Play {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Help help = new Help();
        Settings settings = new Settings();
        Questions questions = new Questions();
        
        int Choose;
        do {
            System.out.print("1 - Play\n2 - Settings\n3 - Help\n4 - Exit\n----------------------\nChoose number | ");
            Choose = sc.nextInt();

            if (Choose == 1) { // Play
                settings.cls();
                System.out.println("You choosed | Play\n----------------------");
                questions.vievQuestions();
                System.out.println(questions.answer[1]);
            } else if (Choose == 2) { // Settings
                settings.cls();
                System.out.println("You choosed | Settings\n----------------------");

                do {
                    System.out.print("1 - Players\n2 - Rounds\n3 - Back\n----------------------\nChoose number | ");
                    Choose = sc.nextInt();

                    if (Choose == 1) {
                        settings.cls();
                        System.out.println("You choosed | Players\n----------------------");
                        
                        do {
                            System.out.print("1 - Set players\n2 - View players\n3 - Back\n----------------------\nChoose number | ");
                            Choose = sc.nextInt();
        
                            if (Choose == 1) {
                                settings.cls();
                                System.out.println("You choosed | Set players\n----------------------");
                                settings.setPlayers();
                            } else if (Choose == 2) {
                                settings.cls();
                                System.out.println("You choosed | View players\n----------------------");
                                settings.viewPlayers();
                            } else if (Choose == 3) {
                                settings.cls();
                                System.out.println("You choosed | Back\n----------------------");
                            } else {
                                settings.cls();
                                System.out.println("Wrong number\n----------------------");
                            }
                        }
                        while (Choose != 3);
                    } else if (Choose == 2) {
                        settings.cls();
                        System.out.println("You choosed | Rounds\n----------------------");

                        do {
                            System.out.print("1 - Set number of rounds\n2 - View number of rounds\n3 - Back\n----------------------\nChoose number | ");
                            Choose = sc.nextInt();
        
                            if (Choose == 1) {
                                settings.cls();
                                System.out.println("You choosed | Set number of rounds");
                                settings.setRounds();
                            } else if (Choose == 2) {
                                settings.cls();
                                System.out.println("You choosed | View number of rounds");
                                settings.vievRounds();
                            } else if (Choose == 3) {
                                settings.cls();
                                System.out.println("You choosed | Back\n----------------------");
                            } else {
                                settings.cls();
                                System.out.println("Wrong number\n----------------------");
                            }
                        }
                        while (Choose != 3);
                    } else if (Choose == 3) {
                        settings.cls();
                        System.out.println("You choosed | Back\n----------------------");
                    } else {
                        settings.cls();
                        System.out.println("Wrong number\n----------------------");
                    }
                }
                while (Choose != 3);
            } else if (Choose == 3) { // Help
                help.instruction();
            } else if (Choose == 4) { // Exit
                settings.cls();
                System.out.println("You choosed | Exit\n\nShutting down...");
            } else {
                settings.cls();
                System.out.println("Wrong number\n----------------------");
            }
        }
        while (Choose != 4);
    }
}
