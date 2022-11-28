import java.util.Scanner;

public class Main {
    

    public static void main(String[] args) {
        //TWORZENIE OBIEKTU
        Obliczenia obliczenia = new Obliczenia();

        //SCANNER
        Scanner scanner = new Scanner(System.in);

        //PORADNIK
        System.out.println("========\nPORADNIK\n========");
        //KONIEC PORADNIKA

        //PODAJ LICZBE 1
        System.out.println("\n=====================\nPodaj pierwsza liczbe");
        Double l1 = scanner.nextDouble();

        //PODAJ DZIALANIE
        System.out.println("\nPodaj znak");
        String znak = scanner.next();

        //WARUNKI
        if (znak.equals("+")) {
            System.out.println("\nPodaj druga liczbe");
            Double l2 = scanner.nextDouble(); //POBRANIE DRUGIEJ LICZBY
            obliczenia.obliczeniaDodawanie(l1, l2);
        } else if (znak.equals("-")) {
            System.out.println("\nPodaj druga liczbe");
            Double l2 = scanner.nextDouble(); //POBRANIE DRUGIEJ LICZBY
            obliczenia.obliczeniaOdejmowanie(l1, l2);
        } else if (znak.equals("*")) {
            System.out.println("\nPodaj druga liczbe");
            Double l2 = scanner.nextDouble(); //POBRANIE DRUGIEJ LICZBY
            obliczenia.obliczeniaMnozenie(l1, l2);
        } else if (znak.equals("/")) {
            System.out.println("\nPodaj druga liczbe");
            Double l2 = scanner.nextDouble(); //POBRANIE DRUGIEJ LICZBY
            obliczenia.obliczeniaDzielenie(l1, l2);
        } else if (znak.equals("^")) {
            System.out.println("\nPodaj druga liczbe");
            Double l2 = scanner.nextDouble(); //POBRANIE DRUGIEJ LICZBY
            obliczenia.obliczeniaPotega(l1, l2);
        } else if (znak.equals("^^")) {
            obliczenia.obliczeniaPierwiastek(l1);
        }
    }
}
