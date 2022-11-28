public class Main {

    public static void main(String[] args) {
        Zwierze kot = new Zwierze();
        kot.glos = "Meow";
        kot.imie = "Mordok";
        kot.przedstawSie();
        kot.dajGlos(3);
        System.out.println("Kot \nImie: " + kot.imie + "\nGlos: " + kot.glos + "\n");

        Zwierze pies = new Zwierze();
        pies.imie = "Reksio";
        pies.glos = "HAU HAU KURWA";
        pies.przedstawSie();
        pies.dajGlos(1);
    }
}
