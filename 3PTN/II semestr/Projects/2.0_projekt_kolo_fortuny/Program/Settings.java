import java.util.Scanner;

public class Settings {
    int NumberOfPlayers;
    String[] PlayersName;
    int NumberOfRounds;
    int i;

    public void cls() {
        System.out.print("\033[H\033[2J");  
        System.out.flush(); 
    }

    public void setPlayers() {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Choose the number of players (maximum 4) | ");
            NumberOfPlayers = sc.nextInt();

            if (NumberOfPlayers > 4) {
                System.out.println("Maximum number of players is 4. Please try again.\n----------------------");
            }
        } while (NumberOfPlayers > 4);

        System.out.print("----------------------\nNumber of players | " + NumberOfPlayers + "\n\nTheir names\n");

        PlayersName = new String[NumberOfPlayers];
        for (i = 0; i < NumberOfPlayers; i++) {
            System.out.print("\t" + (i+1) + ". ");
            PlayersName[i] = sc.next();
        }
        
        System.out.println("----------------------");
    }

    public void viewPlayers() {
        System.out.println("Players' names");

        for (i = 0; i < NumberOfPlayers; i++) {
            System.out.println("\t" + (i+1) + ". " + PlayersName[i]);
        }

        System.out.println("----------------------");
    }

    public void setRounds() {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Choose the number of rounds (maximum 4) | ");
            NumberOfRounds = sc.nextInt();

            if (NumberOfRounds > 4) {
                System.out.println("Maximum number of rounds is 4. Please try again.\n----------------------");
            }
        } while (NumberOfRounds > 4);

        System.out.println("----------------------\nNumber of rounds | " + NumberOfRounds + "\n----------------------");
    }

    public void vievRounds() {
        System.out.println("----------------------\nNumber of rounds | " + NumberOfRounds + "\n----------------------");
    }
}