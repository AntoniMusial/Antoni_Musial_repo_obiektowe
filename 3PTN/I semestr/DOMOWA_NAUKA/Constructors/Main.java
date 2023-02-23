public class Main {

    public static void main(String[] args) {
        Czlowiek Olivia = new Czlowiek("Olivia");
        //Olivia.imie = "Olivia";
        System.out.println("Imie: " + Olivia.imie);
        System.out.println("Liczebnosc: " + Czlowiek.liczebnosc);

        Czlowiek Jakub = new Czlowiek();
        Jakub.imie = "Jakub";
        System.out.println("\nImie: " + Jakub.imie);
        System.out.println("Liczebnosc: " + Czlowiek.liczebnosc);
    }
}