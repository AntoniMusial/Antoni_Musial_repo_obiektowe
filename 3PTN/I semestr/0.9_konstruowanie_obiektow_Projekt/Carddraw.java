import java.util.Random;

public class Carddraw {
    Random r = new Random();

    public void shuffle() {
        String[] cards = new String[] {"Inna", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Lady", "King", "As"};
        Integer[] points = new Integer[] {0, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10, 11};
        int a = r.nextInt(14);

        if (a == 1) {
            System.out.print(cards[0] + " [0pt]");
        } else if (a == 2) {
            System.out.print(cards[1] + " [2pt]");
        } else if (a == 3) {
            System.out.print(cards[2] + " [3pt]");
        } else if (a == 4) {
            System.out.print(cards[3] + " [4pt]");
        } else if (a == 5) {
            System.out.print(cards[4] + " [5pt]");
        } else if (a == 6) {
            System.out.print(cards[5] + " [6pt]");
        } else if (a == 7) {
            System.out.print(cards[6] + " [7pt]");
        } else if (a == 8) {
            System.out.print(cards[7] + " [8pt]");
        } else if (a == 9) {
            System.out.print(cards[8] + " [9pt]");
        } else if (a == 10) {
            System.out.print(cards[9] + " [10pt]");
        } else if (a == 11) {
            System.out.print(cards[10] + " [10pt]");
        } else if (a == 12) {
            System.out.print(cards[11] + " [10pt]");
        } else if (a == 13) {
            System.out.print(cards[12] + " [10pt]");
        } else if (a == 14) {
            System.out.print(cards[13] + " [11pt]");
        }
    }
    public static void main(String[] args) {
        Carddraw carddraw = new Carddraw();
        System.out.print("Your cards: ");
        carddraw.shuffle();
    }
}