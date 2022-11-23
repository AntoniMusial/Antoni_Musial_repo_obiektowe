import java.util.Scanner;

public class Main {
    

    public static void main(String[] args) {
        Obliczenia obliczenia = Obliczenia new;
          
        Scanner scanner = new Scanner(System.in);
        //PORADNIK
        System.out.println("========\nPORADNIK\n========");
        //KONIEC PORADNIKA

        //WYBIERZ DZIAŁANIE
        System.out.println("\n==========\nPodaj znak");
        String znak = scanner.nextLine();
        System.out.println(""); 
        System.out.println(znak + "\n");

        //WYBIERZ LICZBY
        

        //OKRESLANIE DZIAŁANIA
        if (znak.equals("*")) {     //MNOŻENIE
            System.out.println("========\nMnozenie\n");
            //PODAJ LICZBY
            System.out.println("\n==========\nPodaj l1");
            l1 = scanner.nextInt();
            System.out.println("\n==========\nPodaj l2");
            l2 = scanner.nextInt();

            //WYWOŁANIE FUNKCJI
        } else if (znak.equals("/")) { //DZIELENIE
            System.out.println("Dzielenie");
        } else if (znak.equals("+")) { //DODAWANIE
            System.out.println("Dodawanie");
        } else if (znak.equals("-")) { //ODEJMOWANIE
            System.out.println("Odejmowanie");
        } else if (znak.equals("potega")) { //POTĘGOWANIE
            System.out.println("Potęgowanie");
        } else if (znak.equals("pierwiastek")) { //PIERWIASTKOWANIE
            System.out.println("Pierwiastkowanie");
        }
    }
}
