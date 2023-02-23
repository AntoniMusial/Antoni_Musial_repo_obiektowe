public class Gamelogic {
    Carddraw carddraw = new Carddraw();

    public void start() {
        carddraw.shufflePlayer();
        carddraw.shuffleCroupier();
    }

    public static void main(String[] args) {
        Gamelogic gamelogic = new Gamelogic();

        gamelogic.start();
    }
}
