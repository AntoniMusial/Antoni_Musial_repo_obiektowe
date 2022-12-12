public class Main {
    public static void main(String[] args) {
        Carddraw carddraw = new Carddraw();

        System.out.println("Your cards: ");
        carddraw.shuffle();
        carddraw.shuffle();

        System.out.println("Croupier cards: ");
        carddraw.shuffle();
        carddraw.shuffle();
    }
}