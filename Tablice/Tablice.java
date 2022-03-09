package Tablice;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;
public class Tablice {
    public static void main (String[]args) {
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            int ocena = r.nextInt(6);
            int[] tab_ocena = new int[10];
            if (ocena == 0) {
                tab_ocena[i] = 1;
                System.out.println(tab_ocena[i]);
            } else if (ocena == 1) {
                tab_ocena[i] = 2;
                System.out.println(tab_ocena[i]);
            } else if (ocena == 2) {
                tab_ocena[i] = 3;
                System.out.println(tab_ocena[i]);
            } else if (ocena == 3) {
                tab_ocena[i] = 4;
                System.out.println(tab_ocena[i]);
            } else if (ocena == 4) {
                tab_ocena[i] = 5;
                System.out.println(tab_ocena[i]);
            } else if (ocena == 5) {
                tab_ocena[i] = 6;
                System.out.println(tab_ocena[i]);
            }
        }

        File uczniowietxt = new File("uczniowie.txt");
        String[] tab_uczniowie = new String[10];
        for (int j = 0; j <= 10; j++) {
            Scanner odczyt = uczniowietxt;
            tab_uczniowie[j] = odczyt.nextLine();
        }
        System.out.println(tab_uczniowie[1]);

        /*try {
            Scanner sc = new Scanner(uczniowie);
            while(sc.hasNext()) {
                String line = sc.nextLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.print("line");*/
    }
}
