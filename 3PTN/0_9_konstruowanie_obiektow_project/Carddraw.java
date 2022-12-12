import java.util.Random;

public class Carddraw {
    Random r = new Random();

    public int sum_of_points_player;
    public int getSum_of_points_player() {
        return sum_of_points_player;
    }

    public void setSum_of_points_player(int sum_of_points_player) {
        this.sum_of_points_player = sum_of_points_player;
    }
    public int sum_of_points_croupier;

    public int getSum_of_points_croupier() {
        return sum_of_points_croupier;
    }

    public void setSum_of_points_croupier(int sum_of_points_croupier) {
        this.sum_of_points_croupier = sum_of_points_croupier;
    }

    public void shuffleCroupier() {
        String[] cards = new String[] {"Inna", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Lady", "King", "As"};


        int a = r.nextInt(14);
        if (a == 1) {
            sum_of_points_croupier += 0;
            System.out.print("Croupier cards: " + cards[0] + " [0pt] & ");
        } else if (a == 2) {
            sum_of_points_croupier += 2;
            System.out.print("Croupier cards: " + cards[1] + " [2pt] & ");
        } else if (a == 3) {
            sum_of_points_croupier += 3;
            System.out.print("Croupier cards: " + cards[2] + " [3pt] & ");
        } else if (a == 4) {
            sum_of_points_croupier += 4;
            System.out.print("Croupier cards: " + cards[3] + " [4pt] & ");
        } else if (a == 5) {
            sum_of_points_croupier += 5;
            System.out.print("Croupier cards: " + cards[4] + " [5pt] & ");
        } else if (a == 6) {
            sum_of_points_croupier += 6;
            System.out.print("Croupier cards: " + cards[5] + " [6pt] & ");
        } else if (a == 7) {
            sum_of_points_croupier += 7;
            System.out.print("Croupier cards: " + cards[6] + " [7pt] & ");
        } else if (a == 8) {
            sum_of_points_croupier += 8;
            System.out.print("Croupier cards: " + cards[7] + " [8pt] & ");
        } else if (a == 9) {
            sum_of_points_croupier += 9;
            System.out.print("Croupier cards: " + cards[8] + " [9pt] & ");
        } else if (a == 10) {
            sum_of_points_croupier += 10;
            System.out.print("Croupier cards: " + cards[9] + " [10pt] & ");
        } else if (a == 11) {
            sum_of_points_croupier += 10;
            System.out.print("Croupier cards: " + cards[10] + " [10pt] & ");
        } else if (a == 12) {
            sum_of_points_croupier += 10;
            System.out.print("Croupier cards: " + cards[11] + " [10pt] & ");
        } else if (a == 13) {
            sum_of_points_croupier += 10;
            System.out.print("Croupier cards: " + cards[12] + " [10pt] & ");
        } else if (a == 14) {
            sum_of_points_croupier += 11;
            System.out.print("Croupier cards: " + cards[13] + " [11pt] & ");
        }

        a = r.nextInt(14);
        if (a == 1) {
            sum_of_points_croupier += 0;
            System.out.print(cards[0] + " [0pt], sum of points: " + sum_of_points_croupier);
        } else if (a == 2) {
            sum_of_points_croupier += 2;
            System.out.print(cards[1] + " [2pt], sum of points: " + sum_of_points_croupier);
        } else if (a == 3) {
            sum_of_points_croupier += 3;
            System.out.print(cards[2] + " [3pt], sum of points: " + sum_of_points_croupier);
        } else if (a == 4) {
            sum_of_points_croupier += 4;
            System.out.print(cards[3] + " [4pt], sum of points: " + sum_of_points_croupier);
        } else if (a == 5) {
            sum_of_points_croupier += 5;
            System.out.print(cards[4] + " [5pt], sum of points: " + sum_of_points_croupier);
        } else if (a == 6) {
            sum_of_points_croupier += 6;
            System.out.print(cards[5] + " [6pt], sum of points: " + sum_of_points_croupier);
        } else if (a == 7) {
            sum_of_points_croupier += 7;
            System.out.print(cards[6] + " [7pt], sum of points: " + sum_of_points_croupier);
        } else if (a == 8) {
            sum_of_points_croupier += 8;
            System.out.print(cards[7] + " [8pt], sum of points: " + sum_of_points_croupier);
        } else if (a == 9) {
            sum_of_points_croupier += 9;
            System.out.print(cards[8] + " [9pt], sum of points: " + sum_of_points_croupier);
        } else if (a == 10) {
            sum_of_points_croupier += 10;
            System.out.print(cards[9] + " [10pt], sum of points: " + sum_of_points_croupier);
        } else if (a == 11) {
            sum_of_points_croupier += 10;
            System.out.print(cards[10] + " [10pt], sum of points: " + sum_of_points_croupier);
        } else if (a == 12) {
            sum_of_points_croupier += 10;
            System.out.print(cards[11] + " [10pt], sum of points: " + sum_of_points_croupier);
        } else if (a == 13) {
            sum_of_points_croupier += 10;
            System.out.print(cards[12] + " [10pt], sum of points: " + sum_of_points_croupier);
        } else if (a == 14) {
            sum_of_points_croupier += 11;
            System.out.print(cards[13] + " [11pt], sum of points: " + sum_of_points_croupier);
        }
    }

    public void shufflePlayer() {
        String[] cards = new String[] {"Inna", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Lady", "King", "As"};

        int a = r.nextInt(14);
        if (a == 1) {
            sum_of_points_player += 0;
            System.out.print("Your cards: " + cards[0] + " [0pt] & ");
        } else if (a == 2) {
            sum_of_points_player += 2;
            System.out.print("Your cards: " + cards[1] + " [2pt] & ");
        } else if (a == 3) {
            sum_of_points_player += 3;
            System.out.print("Your cards: " + cards[2] + " [3pt] & ");
        } else if (a == 4) {
            sum_of_points_player += 4;
            System.out.print("Your cards: " + cards[3] + " [4pt] & ");
        } else if (a == 5) {
            sum_of_points_player += 5;
            System.out.print("Your cards: " + cards[4] + " [5pt] & ");
        } else if (a == 6) {
            sum_of_points_player += 6;
            System.out.print("Your cards: " + cards[5] + " [6pt] & ");
        } else if (a == 7) {
            sum_of_points_player += 7;
            System.out.print("Your cards: " + cards[6] + " [7pt] & ");
        } else if (a == 8) {
            sum_of_points_player += 8;
            System.out.print("Your cards: " + cards[7] + " [8pt] & ");
        } else if (a == 9) {
            sum_of_points_player += 9;
            System.out.print("Your cards: " + cards[8] + " [9pt] & ");
        } else if (a == 10) {
            sum_of_points_player += 10;
            System.out.print("Your cards: " + cards[9] + " [10pt] & ");
        } else if (a == 11) {
            sum_of_points_player += 10;
            System.out.print("Your cards: " + cards[10] + " [10pt] & ");
        } else if (a == 12) {
            sum_of_points_player += 10;
            System.out.print("Your cards: " + cards[11] + " [10pt] & ");
        } else if (a == 13) {
            sum_of_points_player += 10;
            System.out.print("Your cards: " + cards[12] + " [10pt] & ");
        } else if (a == 14) {
            sum_of_points_player += 11;
            System.out.print("Your cards: " + cards[13] + " [11pt] & ");
        }

        a = r.nextInt(14);
        if (a == 1) {
            sum_of_points_player += 0;
            System.out.print(cards[0] + " [0pt], sum of points: " + sum_of_points_player + "\n\n");
        } else if (a == 2) {
            sum_of_points_player += 2;
            System.out.print(cards[1] + " [2pt], sum of points: " + sum_of_points_player + "\n\n");
        } else if (a == 3) {
            sum_of_points_player += 3;
            System.out.print(cards[2] + " [3pt], sum of points: " + sum_of_points_player + "\n\n");
        } else if (a == 4) {
            sum_of_points_player += 4;
            System.out.print(cards[3] + " [4pt], sum of points: " + sum_of_points_player + "\n\n");
        } else if (a == 5) {
            sum_of_points_player += 5;
            System.out.print(cards[4] + " [5pt], sum of points: " + sum_of_points_player + "\n\n");
        } else if (a == 6) {
            sum_of_points_player += 6;
            System.out.print(cards[5] + " [6pt], sum of points: " + sum_of_points_player + "\n\n");
        } else if (a == 7) {
            sum_of_points_player += 7;
            System.out.print(cards[6] + " [7pt], sum of points: " + sum_of_points_player + "\n\n");
        } else if (a == 8) {
            sum_of_points_player += 8;
            System.out.print(cards[7] + " [8pt], sum of points: " + sum_of_points_player + "\n\n");
        } else if (a == 9) {
            sum_of_points_player += 9;
            System.out.print(cards[8] + " [9pt], sum of points: " + sum_of_points_player + "\n\n");
        } else if (a == 10) {
            sum_of_points_player += 10;
            System.out.print(cards[9] + " [10pt], sum of points: " + sum_of_points_player + "\n\n");
        } else if (a == 11) {
            sum_of_points_player += 10;
            System.out.print(cards[10] + " [10pt], sum of points: " + sum_of_points_player + "\n\n");
        } else if (a == 12) {
            sum_of_points_player += 10;
            System.out.print(cards[11] + " [10pt], sum of points: " + sum_of_points_player + "\n\n");
        } else if (a == 13) {
            sum_of_points_player += 10;
            System.out.print(cards[12] + " [10pt], sum of points: " + sum_of_points_player + "\n\n");
        } else if (a == 14) {
            sum_of_points_player += 11;
            System.out.print(cards[13] + " [11pt], sum of points: " + sum_of_points_player + "\n\n");
        }
    }

    public void winner() {
        if (sum_of_points_croupier < sum_of_points_player) {
            System.out.println("\nWygrales");
        } else if (sum_of_points_croupier > sum_of_points_player) {
            System.out.println("\nPrzejebales");
        } else if (sum_of_points_croupier == sum_of_points_player) {
            System.out.println("\nHolera remis...");
        }
    }
    public static void main(String[] args) {
        Carddraw carddraw = new Carddraw();
        carddraw.shufflePlayer();
        carddraw.shuffleCroupier();
        carddraw.winner();
    }
}