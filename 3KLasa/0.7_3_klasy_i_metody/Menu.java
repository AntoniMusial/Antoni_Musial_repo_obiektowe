import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

import javax.xml.crypto.Data;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("==========================================================\nWitam w programie CRUD\n==========================================================\nKONTYNUUJĄC WYRAŻASZ ZGODĘ NA UDOSTĘPNIANIE TWOICH DANYCH\n==========================================================");
        System.out.println("Czas na twój wybór\nWpisz 1, jeżeli chcesz utworzyć dane użytkownika\nWpisz 2, jeżeli chcesz odczytac dane użytkownika\nWpisz 3, jeżeli chcesz modyfikować dane użytkownika\nWpisz 4, jeżeli chcesz usunąć dane użytkownika\n==========================================================\nMój wybór: ");
        int wybor = scanner.nextInt();
        switch (wybor) {
            case 1:
                File plik = new File("nazwa_pliku.txt");
                
                ArrayList<String> imie = new ArrayList<String>();
                System.out.println("=================================\nJak masz na imię: ");
                imie.add(scanner.nextLine());

                ArrayList<String> nazwisko = new ArrayList<String>();
                System.out.println("=================================\nJak masz na nazwisko: ");
                nazwisko.add(scanner.nextLine());

                ArrayList<String> data_urodzenia = new ArrayList<String>();
                System.out.println("=================================\n([rok]-[miesiąc]-[dzień] | np. 2006-02-19) Kiedy się urodziłeś: ");
                data_urodzenia.add(scanner.nextLine());

                ArrayList<String> mail = new ArrayList<String>();
                System.out.println("=================================\nWprowadź swój E-mail: ");
                mail.add(scanner.nextLine());

                System.out.println(imie + ";" + nazwisko + ";" + data_urodzenia + ";" + mail);
            break;
        }
    }
}
