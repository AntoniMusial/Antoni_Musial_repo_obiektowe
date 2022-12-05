public class Pola_statyczne {
    public static void main(String[] args) {
        Numbers numbers = new Numbers();
        numbers.getL1();
        numbers.getL2();
        numbers.obliczN();
        System.out.println("Wyliczanie sumy l1 oraz l2");
        numbers.showMiltiply();
        System.out.println("\n");

        //ZMIANA l1 NA 3 I PONOWNE WYLICZANIE SUMY l1 * l2 - poczatek
        numbers.setL1(3);
        System.out.println("Zamiana wartości l1 na 3 i ponowne wyliczanie sumy l1 oraz l2");
        numbers.showMiltiply();
        System.out.println("\n");
        //ZMIANA l1 NA 3 I PONOWNE WYLICZANIE SUMY l1 * l2 - koniec

        //ZMIANA l1 NA 7 I PONOWNE WYLICZANIE SUMY l1 * l2 - poczatek
        numbers.setL1(7);
        System.out.println("Zamiana wartości l1 na 7 i ponowne wyliczanie sumy l1 oraz l2");
        numbers.showMiltiply();
        System.out.println("\n");
        //ZMIANA l1 NA 7 I PONOWNE WYLICZANIE SUMY l1 * l2 - koniec
    }
}