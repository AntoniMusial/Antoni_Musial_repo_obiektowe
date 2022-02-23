import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
public class AntoniMusial {
    public static void main (String[]args) throws FileNotFoundException {
        System.out.println("Witam w 10 pytaniowym Quizie o nieznanym temacie.\nPytania są otwarte, czyli odpowiedź jest jedna i zazwyczaj jest to jedno do 3 słów\n");
        Scanner scan = new Scanner(System.in);

        String[] pytan = new String[100];
        pytan[0] = "Jakie zwierze jest kotem i ma wielką grzywę? [za 3pkt]"; //lew
        pytan[1] = "James Bond jest agentem: [za 6pkt]"; //brytyjskim
        pytan[2] = "Peszel, to: [za 9pkt]"; //karbowana rura na kable
        pytan[3] = "Który owoc kryje w sobie więcej, niż jedno nasiono? [za 6pkt]"; //gruszka
        pytan[4] = "Stolicą tego kraju jest Warszawa: [za 3pkt]"; //Polska
        pytan[5] = "Stolica Japonii: [za 3pkt]"; //Tokio
        pytan[6] = "Stolica Chin: [za 3pkt]"; //Pekin
        pytan[7] = "Stolica Chorwacji: [za 3pkt]"; //Zagrzeb
        pytan[8] = "Stolica Cypru: [za 3pkt]"; //Nikozja
        pytan[9] = "Stolica Australii: [za 3pkt]"; //Canberra
        pytan[10] = "Stolica Belgii: [za 3pkt]"; //Bruksela
        pytan[11] = "Stolica Białorusi: [za 3pkt]"; //Mińsk
        pytan[12] = "Stolica Danii: [za 3pkt]"; //Kopenhaga
        pytan[13] = "Stolica Francji: [za 3pkt]"; //Paryż
        pytan[14] = "Stolica Grecji: [za 3pkt]"; //Ateny
        pytan[15] = "Stolica Hiszpanii: [za 3pkt]"; //Madryt
        pytan[16] = "Stolica Izraelu: [za 3pkt]"; //Jerozolima
        pytan[17] = "Stolica Kenia: [za 3pkt]"; //Nairobi
        pytan[18] = "Stolica Litwy: [za 3pkt]"; //Wilno
        pytan[19] = "Stolica Łotwy: [za 3pkt]"; //Ryga
        pytan[20] = "Stolica Monako: [za 3pkt]"; //Monako
        pytan[21] = "Stolica Niemiec: [za 3pkt]"; //Berlin
        pytan[22] = "Stolica Rosji: [za 3pkt]"; //Moskwa
        pytan[23] = "Stolica Słowacja: [za 3pkt]"; //Bratysława
        pytan[24] = "Stolica Turcja: [za 3pkt]"; //Ankara
        pytan[25] = "Stolica Ukraina: [za 3pkt]"; //Kijów
        pytan[26] = "Stolica Włoch: [za 3pkt]"; //Rzym  
        pytan[27] = "Stolica Kosowo: [za 3pkt]"; //Krisztina
        pytan[28] = "Stolica Urugwaju: [za 3pkt]"; //Montevideo
        pytan[29] = "Stolica Szwecji: [za 3pkt]"; //Sztokholm
        pytan[30] = "Stolica Stanów Zjednoczonych: [za 3pkt]"; //Waszyngton
        pytan[31] = "Największy kraj na świecie: [za 3pkt]"; //Rosja
        pytan[32] = "Maksymalna liczba INT: [za 9pkt]"; //2 147 483 647
        pytan[33] = "Minimalna liczba INT: [za 9pkt]"; //-2 147 483 648
        pytan[34] = "Najpopularniejszy język programowania: [za 6pkt]"; //JavaScript
        pytan[35] = "Jezyk, którego głównie używa się podczas programowania (np. Niemiecki): [za 3pkt]"; //Angielski
        pytan[36] = "W jakim języku programowania jest ten program: [za 3pkt]"; //Java
        pytan[37] = "Ulubiony system operacyjny Pana Adama: [za 3pkt]"; //Linux
        pytan[38] = "Najpopularniejszy system operacyjny: [za 3pkt]"; //Windows
        pytan[39] = "2 + 2 = [za 3pkt]"; //4
        pytan[40] = "Banan jest to (owoc czy ważywo): [za 3pkt]"; //Owoc
        pytan[41] = "Do jakiego rzędu ssaków należą hieny? [za 9pkt]"; //Drapieżne
        pytan[42] = "Dzień obchodzony każdego roku poprzez robienie żartów: [za 3pkt]"; //Prima Aprilis
        pytan[43] = "Z jakim święcem kojarz się zwyczaj 'Cukierek albo psikus'? [za 3pkt]"; //Halloween
        pytan[44] = "Czym jest Pegaz w mitologii greckiej? [za 6pkt]"; //Koń ze skrzydłami
        pytan[45] = "Imię najlepszego przyjaciela Asteriksa z Francuskiego komiksu 'Asteriks': [za 3pkt]"; //Obeliks
        pytan[46] = "Jaka trawa jest ulubionym pokarmem pandy? [za 6pkt]"; //Bambus
        pytan[47] = "Jak nazywa się miejsce o bardzo bujnej roślinności w pustyni? [za 9pkt]"; //Oaza
        pytan[48] = "Kto jest chłopakiem w Barbie? [za 3pkt]"; //Ken
        pytan[49] = "Na podstawie, której baśni Hansa Christiana Andersena powstał film animowany 'Kraina lodu'? [za 6pkt]"; //Królowa Śniegu
        pytan[50] = "Co to jest 'Shawshank' w filmie 'Skazani na Shawshank' [za 9pkt]"; //Więzienie
        pytan[51] = "Jak się nazywa przyrząd nawigacyjny [za 3pkt]"; //Kompas
        pytan[52] = "Jak nazywa się organizm, który żyje na lub wewnątrz innego organizmu wyrządając mu krzywdę? [za 6pkt]"; //Pasożyt
        pytan[53] = "Który organ ciała odpowiada za zmysł dotyku [za 6pkt]"; //Skóra
        pytan[54] = "Czym jest cukier cukierniczy [za 9pkt]"; //Cukier puder
        pytan[55] = "Jak nazywa się duże pomieszczenie do tańców [za 3pkt]"; //Sala balowa
        pytan[56] = "Jakiego kraju symbolem jest zielona koniczyna? [za 9pkt]"; //Irlandia
        pytan[57] = "Co jest głównym składnikiem szarlotki? [za 3pkt]"; //Jabłka
        pytan[58] = "Najbardziej znany symbol chrześcijaństwa [za 6pkt]"; //Krzyż
        pytan[59] = "Jak nazywa się słynny zakażony las, znajdujący się w czarnobylskiej strefie zamkniętej? [za 9pkt]"; //Czerwony las
        pytan[60] = "Co to jest syndrom sztokholmski? [za 9pkt]"; //Stan psychiczny
        pytan[61] = "Zwierzęta, które budują tamy: [za 3pkt]"; //Bobry
        pytan[62] = "Z czego składa się lód? [za 3pkt]"; //Woda
        pytan[63] = "Która z substancji chemicznych często występuje w zmywaczu do paznokci? [za 9pkt]"; //Aceton
        pytan[64] = "Barwa nazywająca się magenta: [za 9pkt]"; //anilina
        pytan[65] = "Jaka roślina uważana jest za przynosząca szczęście? [za 3pkt]"; //czterolistna koniczyna
        pytan[66] = "W jakim sporcie używana jest piłka golfowa? [za 3pkt]"; //Golf
        pytan[67] = "Czym jest hemofobia? [za 9pkt]"; //Strach przed krwią
        pytan[68] = "Które przedsiębiorstwo w 1922r. stworzyło pierwsze żelki w formie misiów [za 6pkt]"; //Haribo
        pytan[69] = "Jaką witaminę dostarczają owoce cytrusowe? [za 3pkt]"; //C
        pytan[70] = "Co jest folklorystycznym symbolem wielkanocy [za 6pkt]"; //Zając
        pytan[71] = "Jakie święto jest celebrowane we Francji 14 lipca? [za 6pkt]"; //Święto Narodowe Francji
        pytan[72] = "Która z siedmiu starożytnych cudów świata stoi do dziś [za 6pkt]"; //Piramida Cheopsa
        pytan[73] = "Jaki jest największy na świecie las tropikalny? [za 3pkt]"; //Amazoński
        pytan[74] = "Która bajka Disneya została zainspirowana baśnią 'Królowa Śniegu' Hansa Christiana Andersena? [za 6pkt]"; //Kraina lodu
        pytan[75] = "Jak nazywa się składane krzesło używane jako mebel ogrodowy na plaży? [za 3pkt]"; //Leżak
        pytan[76] = "Która rasa psów gończych słynie z uroczego wyglądu i krótkich nóg? [za 6pkt]"; //Jamnik
        pytan[77] = "Jakiego zwierzęcia stadium larwalnym jest gąsienica [za 3pkt]"; //Motyl
        pytan[78] = "Uwalnianie jakiego gazu z ludzkiej krwi jest jedną z podstawowych funkcji płuc? [za 3pkt]"; //Dwutlenek węgla
        pytan[79] = "Jaki pierwiastek zabił Napoleona [za 9pkt]"; //Arsen
        pytan[80] = "Które zwierzę ma 3 serca, 9 mózgów i niebieską krew? [za 9pkt]"; //Ośmiornica
        pytan[81] = "Główny bohater kreskówki 'Spangebob' [za 3pkt]"; //Spangebob Kanciastoporty
        pytan[82] = "Rozwinięcie skrótu IQ: [za 9pkt]"; //Intelligence Quotient
        pytan[83] = "Jakim rodzajem ubrania jest płaszcz? [za 9pkt]"; //Wierzchnie okrycie ciała
        pytan[84] = "Jaki owoc dodaje się do hawajskiej pizzy? [za 3pkt]"; //Ananas
        pytan[85] = "Którzy rzeźbiarz stworzył Pinokio? [za 9pkt]"; //Dżepetto
        pytan[86] = "Jaki trujący owoc zjadła śnieżka w filmie animowanym 'Królewna Śnieżka i siedmiu krasnoludków'? [za 6pkt]"; //Jabłko
        pytan[87] = "Co to reinkarnacja? [za 6pkt]"; //Odrodzenie duszy w innym ciele
        pytan[88] = "Czym jest dermatofagia? [za 9pkt]"; //Obgryzanie skóry
        pytan[89] = "Gdzie znajduje się Ściana Płaczu [za 6pkt]"; //Jerozolima
        pytan[90] = "Które zwierzę ma największe poroże? [za 6pkt]"; //Jeleń
        pytan[91] = "X Games to impreza jakich sportów? [za 9pkt]"; //Sporty ekstremalne
        pytan[92] = "Jakiego koloru jest upierzenie sroki zwyczajnej [za 9pkt]"; //Czarnego i białego
        pytan[93] = "Kim jest Cristiano Ronaldo? [za 3pkt]"; //Piłkarz
        pytan[94] = "Która brytyjska gra znana jest w Ameryce jako 'Tic-tac-toe'? [za 9pkt]"; //Kółko i krzyżyk
        pytan[95] = "Cienkie, płaskie, okrągłe ciasto smażone z obu stron: [za 3pkt]"; //Naleśnik
        pytan[96] = "Jak nazywa się stopiona skała, która spływa na powierzchnię Ziemi? [za 3pkt]"; //Lawa
        pytan[97] = "Jak nazywa się długie pieczywo z chrupiącą skórką i miekkim rdzeniem? [za 3pkt]"; //Bagietka
        pytan[98] = "Film 'Park Jurajski' cechuje się jednym z najbardziej kultowych przedstawień, jakiego dinozaura? [za 9pkt]"; //Tyranozaur
        pytan[99] = "Które wymarłe zwierzę jest blisko spokrewnione ze słoniami? [za 3pkt]"; //Mamut

        String[] odpowiedz = new String[100];
        odpowiedz[0] = "lew";
        odpowiedz[1] = "brytyjskim";
        odpowiedz[2] = "karbowana rura na kable";
        odpowiedz[3] = "gruszka";
        odpowiedz[4] = "Polska";
        odpowiedz[5] = "Tokio";
        odpowiedz[6] = "Pekin";
        odpowiedz[7] = "Zagrzeb";
        odpowiedz[8] = "Nikozja";
        odpowiedz[9] = "Canberra";
        odpowiedz[10] = "Bruksela";
        odpowiedz[11] = "Mińsk";
        odpowiedz[12] = "Kopenhaga";
        odpowiedz[13] = "Paryż";
        odpowiedz[14] = "Ateny";
        odpowiedz[15] = "Madryt";
        odpowiedz[16] = "Jerozolima";
        odpowiedz[17] = "Nairobi";
        odpowiedz[18] = "Wilno";
        odpowiedz[19] = "Ryga";
        odpowiedz[20] = "Monako";
        odpowiedz[21] = "Berlin";
        odpowiedz[22] = "Moskwa";
        odpowiedz[23] = "Bratysława";
        odpowiedz[24] = "Ankara";
        odpowiedz[25] = "Kijów";
        odpowiedz[26] = "Rzym";
        odpowiedz[27] = "Krisztina";
        odpowiedz[28] = "Montevideo";
        odpowiedz[29] = "Sztokholm";
        odpowiedz[30] = "Waszyngton";
        odpowiedz[31] = "Rosja";
        odpowiedz[32] = "2147483647";
        odpowiedz[33] = "-2147483647";
        odpowiedz[34] = "JavaScript";
        odpowiedz[35] = "Angielski";
        odpowiedz[36] = "Java";
        odpowiedz[37] = "Linux";
        odpowiedz[38] = "Windows";
        odpowiedz[39] = "4";
        odpowiedz[40] = "Owoc";
        odpowiedz[41] = "Drapieżne";
        odpowiedz[42] = "Prima Aprilis";
        odpowiedz[43] = "Halloween";
        odpowiedz[44] = "Koń ze skrzydłami";
        odpowiedz[45] = "Obeliks";
        odpowiedz[46] = "Bambus";
        odpowiedz[47] = "Oaza";
        odpowiedz[48] = "Ken";
        odpowiedz[49] = "Królowa Śniegu";
        odpowiedz[50] = "Więzienie";
        odpowiedz[51] = "Kompas";
        odpowiedz[52] = "Pasożyt";
        odpowiedz[53] = "Skóra";
        odpowiedz[54] = "Cukier puder";
        odpowiedz[55] = "Sala balowa";
        odpowiedz[56] = "Irlandia";
        odpowiedz[57] = "Jabłka";
        odpowiedz[58] = "Krzyż";
        odpowiedz[59] = "Czerwony las";
        odpowiedz[60] = "Stan psychiczny";
        odpowiedz[61] = "Bobry";
        odpowiedz[62] = "Woda";
        odpowiedz[63] = "Aceton";
        odpowiedz[64] = "anilina";
        odpowiedz[65] = "czterolistna koniczyna";
        odpowiedz[66] = "Golf";
        odpowiedz[67] = "Strach przed krwią";
        odpowiedz[68] = "Haribo";
        odpowiedz[69] = "C";
        odpowiedz[70] = "Zając";
        odpowiedz[71] = "Święto Narodowe Francji";
        odpowiedz[72] = "Piramida Cheopsa";
        odpowiedz[73] = "Amazoński";
        odpowiedz[74] = "Kraina lodu";
        odpowiedz[75] = "Leżak";
        odpowiedz[76] = "Jamnik";
        odpowiedz[77] = "Motyl";
        odpowiedz[78] = "Dwutlenek węgla";
        odpowiedz[79] = "Arsen";
        odpowiedz[80] = "Ośmiornica";
        odpowiedz[81] = "Spangebob Kanciastoporty";
        odpowiedz[82] = "Intelligence Quotient";
        odpowiedz[83] = "Wierzchnie okrycie ciała";
        odpowiedz[84] = "Ananas";
        odpowiedz[85] = "Dżepetto";
        odpowiedz[86] = "Jabłko";
        odpowiedz[87] = "Odrodzenie duszy w innym ciele";
        odpowiedz[88] = "Obgryzanie skóry";
        odpowiedz[89] = "Jerozolima";
        odpowiedz[90] = "Jeleń";
        odpowiedz[91] = "Sporty ekstremalne";
        odpowiedz[92] = "Czarnego i białego";
        odpowiedz[93] = "Piłkarz";
        odpowiedz[94] = "Kółko i krzyżyk";
        odpowiedz[95] = "Naleśnik";
        odpowiedz[96] = "Lawa";
        odpowiedz[97] = "Bagietka";
        odpowiedz[98] = "Tyranozaur";
        odpowiedz[99] = "Mamut";

        int[] punkty_do_dodania = new int[100];
        punkty_do_dodania[0] = 3;
        punkty_do_dodania[1] = 6;
        punkty_do_dodania[2] = 9;
        punkty_do_dodania[3] = 6;
        punkty_do_dodania[4] = 3;
        punkty_do_dodania[5] = 3;
        punkty_do_dodania[6] = 3;
        punkty_do_dodania[7] = 3;
        punkty_do_dodania[8] = 3;
        punkty_do_dodania[9] = 3;
        punkty_do_dodania[10] = 3;
        punkty_do_dodania[11] = 3;
        punkty_do_dodania[12] = 3;
        punkty_do_dodania[13] = 3;
        punkty_do_dodania[14] = 3;
        punkty_do_dodania[15] = 3;
        punkty_do_dodania[16] = 3;
        punkty_do_dodania[17] = 3;
        punkty_do_dodania[18] = 3;
        punkty_do_dodania[19] = 3;
        punkty_do_dodania[20] = 3;
        punkty_do_dodania[21] = 3;
        punkty_do_dodania[22] = 3;
        punkty_do_dodania[23] = 3;
        punkty_do_dodania[24] = 3;
        punkty_do_dodania[25] = 3;
        punkty_do_dodania[26] = 3;
        punkty_do_dodania[27] = 3;
        punkty_do_dodania[28] = 3;
        punkty_do_dodania[29] = 3;
        punkty_do_dodania[30] = 3;
        punkty_do_dodania[31] = 3;
        punkty_do_dodania[32] = 9;
        punkty_do_dodania[33] = 9;
        punkty_do_dodania[34] = 6;
        punkty_do_dodania[35] = 3;
        punkty_do_dodania[36] = 3;
        punkty_do_dodania[37] = 3;
        punkty_do_dodania[38] = 3;
        punkty_do_dodania[39] = 3;
        punkty_do_dodania[40] = 3;
        punkty_do_dodania[41] = 9;
        punkty_do_dodania[42] = 3;
        punkty_do_dodania[43] = 3;
        punkty_do_dodania[44] = 6;
        punkty_do_dodania[45] = 3;
        punkty_do_dodania[46] = 6;
        punkty_do_dodania[47] = 9;
        punkty_do_dodania[48] = 3;
        punkty_do_dodania[49] = 6;
        punkty_do_dodania[50] = 9;
        punkty_do_dodania[51] = 3;
        punkty_do_dodania[52] = 6;
        punkty_do_dodania[53] = 6;
        punkty_do_dodania[54] = 9;
        punkty_do_dodania[55] = 3;
        punkty_do_dodania[56] = 9;
        punkty_do_dodania[57] = 3;
        punkty_do_dodania[58] = 6;
        punkty_do_dodania[59] = 9;
        punkty_do_dodania[60] = 9;
        punkty_do_dodania[61] = 3;
        punkty_do_dodania[62] = 3;
        punkty_do_dodania[63] = 9;
        punkty_do_dodania[64] = 9;
        punkty_do_dodania[65] = 3;
        punkty_do_dodania[66] = 3;
        punkty_do_dodania[67] = 9;
        punkty_do_dodania[68] = 6;
        punkty_do_dodania[69] = 3;
        punkty_do_dodania[70] = 6;
        punkty_do_dodania[71] = 6;
        punkty_do_dodania[72] = 6;
        punkty_do_dodania[73] = 3;
        punkty_do_dodania[74] = 6;
        punkty_do_dodania[75] = 3;
        punkty_do_dodania[76] = 6;
        punkty_do_dodania[77] = 3;
        punkty_do_dodania[78] = 3;
        punkty_do_dodania[79] = 9;
        punkty_do_dodania[80] = 9;
        punkty_do_dodania[81] = 3;
        punkty_do_dodania[82] = 9;
        punkty_do_dodania[83] = 9;
        punkty_do_dodania[84] = 3;
        punkty_do_dodania[85] = 9;
        punkty_do_dodania[86] = 6;
        punkty_do_dodania[87] = 6;
        punkty_do_dodania[88] = 9;
        punkty_do_dodania[89] = 6;
        punkty_do_dodania[90] = 6;
        punkty_do_dodania[91] = 9;
        punkty_do_dodania[92] = 9;
        punkty_do_dodania[93] = 3;
        punkty_do_dodania[94] = 9;
        punkty_do_dodania[95] = 3;
        punkty_do_dodania[96] = 3;
        punkty_do_dodania[97] = 3;
        punkty_do_dodania[98] = 9;
        punkty_do_dodania[99] = 3;

        int suma_punktow = 0;
        int aktualne_punkty = 0;

        Random r = new Random();

        for (var i = 0; i <= 10; i++) {
            int idxR = new Random().nextInt(pytan.length);
            String Random = (pytan[idxR]);
            System.out.println(idxR +  ". " + Random + "\n");
            aktualne_punkty = suma_punktow;

            if (Random == pytan[0]) {
                System.out.print("Odpowiedź: ");
                String odp = scan.nextLine();
                if (odp.equals(odpowiedz[0])) {
                    suma_punktow = aktualne_punkty + punkty_do_dodania[3];
                    System.out.println("Poprawna odpowiedź.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                } else {
                    System.out.println("Zauważyłem błąd.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                }
            } else if (Random == pytan[1]) {
                System.out.print("Odpowiedź: ");
                String odp = scan.nextLine();
                if (odp.equals(odpowiedz[1])) {
                    suma_punktow = aktualne_punkty + punkty_do_dodania[6];
                    System.out.println("Poprawna odpowiedź.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                } else {
                    System.out.println("Zauważyłem błąd.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                }
            } else if (Random == pytan[2]) {
                System.out.print("Odpowiedź: ");
                String odp = scan.nextLine();
                if (odp.equals(odpowiedz[2])) {
                    suma_punktow = aktualne_punkty + punkty_do_dodania[9];
                    System.out.println("Poprawna odpowiedź.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                } else {
                    System.out.println("Zauważyłem błąd.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                }
            } else if (Random == pytan[3]) {
                System.out.print("Odpowiedź: ");
                String odp = scan.nextLine();
                if (odp.equals(odpowiedz[3])) {
                    suma_punktow = aktualne_punkty + punkty_do_dodania[6];
                    System.out.println("Poprawna odpowiedź.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                } else {
                    System.out.println("Zauważyłem błąd.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                }
            } else if (Random == pytan[4]) {
                System.out.println("Odpowiedź: ");
                String odp = scan.nextLine();
                if (odp.equals(odpowiedz[4])) {
                    suma_punktow = aktualne_punkty + punkty_do_dodania[3];
                    System.out.println("Poprawna odpowiedź.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                } else {
                    System.out.println("Zauważyłem błąd.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                }
            } else if (Random == pytan[5]) {
                System.out.print("Odpowiedź: ");
                String odp = scan.nextLine();
                if (odp.equals(odpowiedz[5])) {
                    suma_punktow = aktualne_punkty + punkty_do_dodania[3];
                    System.out.println("Poprawna odpowiedź.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                } else {
                    System.out.println("Zauważyłem błąd.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                }
            } else if (Random == pytan[6]) {
                System.out.print("Odpowiedź: ");
                String odp = scan.nextLine();
                if (odp.equals(odpowiedz[6])) {
                    suma_punktow = aktualne_punkty + punkty_do_dodania[3];
                    System.out.println("Poprawna odpowiedź.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                } else {
                    System.out.println("Zauważyłem błąd.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                }
            } else if (Random == pytan[7]) {
                System.out.print("Odpowiedź: ");
                String odp = scan.nextLine();
                if (odp.equals(odpowiedz[7])) {
                    suma_punktow = aktualne_punkty + punkty_do_dodania[3];
                    System.out.println("Poprawna odpowiedź.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                } else {
                    System.out.println("Zauważyłem błąd.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                }
            } else if (Random == pytan[8]) {
                System.out.print("Odpowiedź: ");
                String odp = scan.nextLine();
                if (odp.equals(odpowiedz[8])) {
                    suma_punktow = aktualne_punkty + punkty_do_dodania[3];
                    System.out.println("Poprawna odpowiedź.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                } else {
                    System.out.println("Zauważyłem błąd.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                }
            } else if (Random == pytan[9]) {
                System.out.print("Odpowiedź: ");
                String odp = scan.nextLine();
                if (odp.equals(odpowiedz[9])) {
                    suma_punktow = aktualne_punkty + punkty_do_dodania[3];
                    System.out.println("Poprawna odpowiedź.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                } else {
                    System.out.println("Zauważyłem błąd.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                }
            } else if (Random == pytan[10]) {
                System.out.print("Odpowiedź: ");
                String odp = scan.nextLine();
                if (odp.equals(odpowiedz[10])) {
                    suma_punktow = aktualne_punkty + punkty_do_dodania[3];
                    System.out.println("Poprawna odpowiedź.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                } else {
                    System.out.println("Zauważyłem błąd.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                }
            } else if (Random == pytan[11]) {
                System.out.print("Odpowiedź: ");
                String odp = scan.nextLine();
                if (odp.equals(odpowiedz[11])) {
                    suma_punktow = aktualne_punkty + punkty_do_dodania[3];
                    System.out.println("Poprawna odpowiedź.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                } else {
                    System.out.println("Zauważyłem błąd.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                }
            } else if (Random == pytan[12]) {
                System.out.print("Odpowiedź: ");
                String odp = scan.nextLine();
                if (odp.equals(odpowiedz[12])) {
                    suma_punktow = aktualne_punkty + punkty_do_dodania[3];
                    System.out.println("Poprawna odpowiedź.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                } else {
                    System.out.println("Zauważyłem błąd.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                }
            } else if (Random == pytan[13]) {
                System.out.print("Odpowiedź: ");
                String odp = scan.nextLine();
                if (odp.equals(odpowiedz[13])) {
                    suma_punktow = aktualne_punkty + punkty_do_dodania[3];
                    System.out.println("Poprawna odpowiedź.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                } else {
                    System.out.println("Zauważyłem błąd.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                }
            } else if (Random == pytan[14]) {
                System.out.print("Odpowiedź: ");
                String odp = scan.nextLine();
                if (odp.equals(odpowiedz[14])) {
                    suma_punktow = aktualne_punkty + punkty_do_dodania[3];
                    System.out.println("Poprawna odpowiedź.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                } else {
                    System.out.println("Zauważyłem błąd.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                }
            } else if (Random == pytan[15]) {
                System.out.print("Odpowiedź: ");
                String odp = scan.nextLine();
                if (odp.equals(odpowiedz[15])) {
                    suma_punktow = aktualne_punkty + punkty_do_dodania[3];
                    System.out.println("Poprawna odpowiedź.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                } else {
                    System.out.println("Zauważyłem błąd.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                }
            } else if (Random == pytan[16]) {
                System.out.print("Odpowiedź: ");
                String odp = scan.nextLine();
                if (odp.equals(odpowiedz[16])) {
                    suma_punktow = aktualne_punkty + punkty_do_dodania[3];
                    System.out.println("Poprawna odpowiedź.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                } else {
                    System.out.println("Zauważyłem błąd.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                }
            } else if (Random == pytan[17]) {
                System.out.print("Odpowiedź: ");
                String odp = scan.nextLine();
                if (odp.equals(odpowiedz[17])) {
                    suma_punktow = aktualne_punkty + punkty_do_dodania[3];
                    System.out.println("Poprawna odpowiedź.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                } else {
                    System.out.println("Zauważyłem błąd.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                }
            } else if (Random == pytan[18]) {
                System.out.print("Odpowiedź: ");
                String odp = scan.nextLine();
                if (odp.equals(odpowiedz[18])) {
                    suma_punktow = aktualne_punkty + punkty_do_dodania[3];
                    System.out.println("Poprawna odpowiedź.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                } else {
                    System.out.println("Zauważyłem błąd.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                }
            } else if (Random == pytan[19]) {
                System.out.print("Odpowiedź: ");
                String odp = scan.nextLine();
                if (odp.equals(odpowiedz[19])) {
                    suma_punktow = aktualne_punkty + punkty_do_dodania[3];
                    System.out.println("Poprawna odpowiedź.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                } else {
                    System.out.println("Zauważyłem błąd.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                }
            } else if (Random == pytan[20]) {
                System.out.print("Odpowiedź: ");
                String odp = scan.nextLine();
                if (odp.equals(odpowiedz[20])) {
                    suma_punktow = aktualne_punkty + punkty_do_dodania[3];
                    System.out.println("Poprawna odpowiedź.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                } else {
                    System.out.println("Zauważyłem błąd.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                }
            } else if (Random == pytan[21]) {
                System.out.print("Odpowiedź: ");
                String odp = scan.nextLine();
                if (odp.equals(odpowiedz[21])) {
                    suma_punktow = aktualne_punkty + punkty_do_dodania[3];
                    System.out.println("Poprawna odpowiedź.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                } else {
                    System.out.println("Zauważyłem błąd.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                }
            } else if (Random == pytan[22]) {
                System.out.print("Odpowiedź: ");
                String odp = scan.nextLine();
                if (odp.equals(odpowiedz[22])) {
                    suma_punktow = aktualne_punkty + punkty_do_dodania[3];
                    System.out.println("Poprawna odpowiedź.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                } else {
                    System.out.println("Zauważyłem błąd.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                }
            } else if (Random == pytan[23]) {
                System.out.print("Odpowiedź: ");
                String odp = scan.nextLine();
                if (odp.equals(odpowiedz[23])) {
                    suma_punktow = aktualne_punkty + punkty_do_dodania[3];
                    System.out.println("Poprawna odpowiedź.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                } else {
                    System.out.println("Zauważyłem błąd.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                }
            } else if (Random == pytan[24]) {
                System.out.print("Odpowiedź: ");
                String odp = scan.nextLine();
                if (odp.equals(odpowiedz[24])) {
                    suma_punktow = aktualne_punkty + punkty_do_dodania[3];
                    System.out.println("Poprawna odpowiedź.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                } else {
                    System.out.println("Zauważyłem błąd.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                }
            } else if (Random == pytan[25]) {
                System.out.print("Odpowiedź: ");
                String odp = scan.nextLine();
                if (odp.equals(odpowiedz[25])) {
                    suma_punktow = aktualne_punkty + punkty_do_dodania[3];
                    System.out.println("Poprawna odpowiedź.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                } else {
                    System.out.println("Zauważyłem błąd.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                }
            } else if (Random == pytan[26]) {
                System.out.print("Odpowiedź: ");
                String odp = scan.nextLine();
                if (odp.equals(odpowiedz[26])) {
                    suma_punktow = aktualne_punkty + punkty_do_dodania[3];
                    System.out.println("Poprawna odpowiedź.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                } else {
                    System.out.println("Zauważyłem błąd.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                }
            } else if (Random == pytan[27]) {
                System.out.print("Odpowiedź: ");
                String odp = scan.nextLine();
                if (odp.equals(odpowiedz[27])) {
                    suma_punktow = aktualne_punkty + punkty_do_dodania[3];
                    System.out.println("Poprawna odpowiedź.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                } else {
                    System.out.println("Zauważyłem błąd.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                }
            } else if (Random == pytan[28]) {
                System.out.print("Odpowiedź: ");
                String odp = scan.nextLine();
                if (odp.equals(odpowiedz[28])) {
                    suma_punktow = aktualne_punkty + punkty_do_dodania[3];
                    System.out.println("Poprawna odpowiedź.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                } else {
                    System.out.println("Zauważyłem błąd.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                }
            } else if (Random == pytan[29]) {
                System.out.print("Odpowiedź: ");
                String odp = scan.nextLine();
                if (odp.equals(odpowiedz[29])) {
                    suma_punktow = aktualne_punkty + punkty_do_dodania[3];
                    System.out.println("Poprawna odpowiedź.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                } else {
                    System.out.println("Zauważyłem błąd.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                }
            } else if (Random == pytan[30]) {
                System.out.print("Odpowiedź: ");
                String odp = scan.nextLine();
                if (odp.equals(odpowiedz[30])) {
                    suma_punktow = aktualne_punkty + punkty_do_dodania[3];
                    System.out.println("Poprawna odpowiedź.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                } else {
                    System.out.println("Zauważyłem błąd.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                }
            } else if (Random == pytan[31]) {
                System.out.print("Odpowiedź: ");
                String odp = scan.nextLine();
                if (odp.equals(odpowiedz[31])) {
                    suma_punktow = aktualne_punkty + punkty_do_dodania[3];
                    System.out.println("Poprawna odpowiedź.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                } else {
                    System.out.println("Zauważyłem błąd.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                }
            } else if (Random == pytan[32]) {
                System.out.print("Odpowiedź: ");
                String odp = scan.nextLine();
                if (odp.equals(odpowiedz[32])) {
                    suma_punktow = aktualne_punkty + punkty_do_dodania[9];
                    System.out.println("Poprawna odpowiedź.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                } else {
                    System.out.println("Zauważyłem błąd.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                }
            } else if (Random == pytan[33]) {
                System.out.print("Odpowiedź: ");
                String odp = scan.nextLine();
                if (odp.equals(odpowiedz[33])) {
                    suma_punktow = aktualne_punkty + punkty_do_dodania[9];
                    System.out.println("Poprawna odpowiedź.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                } else {
                    System.out.println("Zauważyłem błąd.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                }
            } else if (Random == pytan[34]) {
                System.out.print("Odpowiedź: ");
                String odp = scan.nextLine();
                if (odp.equals(odpowiedz[34])) {
                    suma_punktow = aktualne_punkty + punkty_do_dodania[6];
                    System.out.println("Poprawna odpowiedź.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                } else {
                    System.out.println("Zauważyłem błąd.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                }
            } else if (Random == pytan[35]) {
                System.out.print("Odpowiedź: ");
                String odp = scan.nextLine();
                if (odp.equals(odpowiedz[35])) {
                    suma_punktow = aktualne_punkty + punkty_do_dodania[3];
                    System.out.println("Poprawna odpowiedź.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                } else {
                    System.out.println("Zauważyłem błąd.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                }
            } else if (Random == pytan[36]) {
                System.out.print("Odpowiedź: ");
                String odp = scan.nextLine();
                if (odp.equals(odpowiedz[36])) {
                    suma_punktow = aktualne_punkty + punkty_do_dodania[3];
                    System.out.println("Poprawna odpowiedź.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                } else {
                    System.out.println("Zauważyłem błąd.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                }
            } else if (Random == pytan[37]) {
                System.out.print("Odpowiedź: ");
                String odp = scan.nextLine();
                if (odp.equals(odpowiedz[37])) {
                    suma_punktow = aktualne_punkty + punkty_do_dodania[3];
                    System.out.println("Poprawna odpowiedź.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                } else {
                    System.out.println("Zauważyłem błąd.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                }
            } else if (Random == pytan[38]) {
                System.out.print("Odpowiedź: ");
                String odp = scan.nextLine();
                if (odp.equals(odpowiedz[38])) {
                    suma_punktow = aktualne_punkty + punkty_do_dodania[3];
                    System.out.println("Poprawna odpowiedź.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                } else {
                    System.out.println("Zauważyłem błąd.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                }
            } else if (Random == pytan[39]) {
                System.out.print("Odpowiedź: ");
                String odp = scan.nextLine();
                if (odp.equals(odpowiedz[39])) {
                    suma_punktow = aktualne_punkty + punkty_do_dodania[3];
                    System.out.println("Poprawna odpowiedź.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                } else {
                    System.out.println("Zauważyłem błąd.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                }
            } else if (Random == pytan[40]) {
                System.out.print("Odpowiedź: ");
                String odp = scan.nextLine();
                if (odp.equals(odpowiedz[40])) {
                    suma_punktow = aktualne_punkty + punkty_do_dodania[3];
                    System.out.println("Poprawna odpowiedź.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                } else {
                    System.out.println("Zauważyłem błąd.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                }
            } else if (Random == pytan[41]) {
                System.out.print("Odpowiedź: ");
                String odp = scan.nextLine();
                if (odp.equals(odpowiedz[41])) {
                    suma_punktow = aktualne_punkty + punkty_do_dodania[9];
                    System.out.println("Poprawna odpowiedź.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                } else {
                    System.out.println("Zauważyłem błąd.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                }
            } else if (Random == pytan[42]) {
                System.out.print("Odpowiedź: ");
                String odp = scan.nextLine();
                if (odp.equals(odpowiedz[42])) {
                    suma_punktow = aktualne_punkty + punkty_do_dodania[3];
                    System.out.println("Poprawna odpowiedź.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                } else {
                    System.out.println("Zauważyłem błąd.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                }
            } else if (Random == pytan[43]) {
                System.out.print("Odpowiedź: ");
                String odp = scan.nextLine();
                if (odp.equals(odpowiedz[43])) {
                    suma_punktow = aktualne_punkty + punkty_do_dodania[3];
                    System.out.println("Poprawna odpowiedź.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                } else {
                    System.out.println("Zauważyłem błąd.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                }
            } else if (Random == pytan[44]) {
                System.out.print("Odpowiedź: ");
                String odp = scan.nextLine();
                if (odp.equals(odpowiedz[44])) {
                    suma_punktow = aktualne_punkty + punkty_do_dodania[6];
                    System.out.println("Poprawna odpowiedź.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                } else {
                    System.out.println("Zauważyłem błąd.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                }
            } else if (Random == pytan[45]) {
                System.out.print("Odpowiedź: ");
                String odp = scan.nextLine();
                if (odp.equals(odpowiedz[45])) {
                    suma_punktow = aktualne_punkty + punkty_do_dodania[3];
                    System.out.println("Poprawna odpowiedź.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                } else {
                    System.out.println("Zauważyłem błąd.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                }
            } else if (Random == pytan[46]) {
                System.out.print("Odpowiedź: ");
                String odp = scan.nextLine();
                if (odp.equals(odpowiedz[46])) {
                    suma_punktow = aktualne_punkty + punkty_do_dodania[6];
                    System.out.println("Poprawna odpowiedź.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                } else {
                    System.out.println("Zauważyłem błąd.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                }
            } else if (Random == pytan[47]) {
                System.out.print("Odpowiedź: ");
                String odp = scan.nextLine();
                if (odp.equals(odpowiedz[47])) {
                    suma_punktow = aktualne_punkty + punkty_do_dodania[9];
                    System.out.println("Poprawna odpowiedź.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                } else {
                    System.out.println("Zauważyłem błąd.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                }
            } else if (Random == pytan[48]) {
                System.out.print("Odpowiedź: ");
                String odp = scan.nextLine();
                if (odp.equals(odpowiedz[48])) {
                    suma_punktow = aktualne_punkty + punkty_do_dodania[3];
                    System.out.println("Poprawna odpowiedź.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                } else {
                    System.out.println("Zauważyłem błąd.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                }
            } else if (Random == pytan[49]) {
                System.out.print("Odpowiedź: ");
                String odp = scan.nextLine();
                if (odp.equals(odpowiedz[49])) {
                    suma_punktow = aktualne_punkty + punkty_do_dodania[6];
                    System.out.println("Poprawna odpowiedź.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                } else {
                    System.out.println("Zauważyłem błąd.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                }
            } else if (Random == pytan[50]) {
                System.out.print("Odpowiedź: ");
                String odp = scan.nextLine();
                if (odp.equals(odpowiedz[50])) {
                    suma_punktow = aktualne_punkty + punkty_do_dodania[9];
                    System.out.println("Poprawna odpowiedź.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                } else {
                    System.out.println("Zauważyłem błąd.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                }
            } else if (Random == pytan[51]) {
                System.out.print("Odpowiedź: ");
                String odp = scan.nextLine();
                if (odp.equals(odpowiedz[51])) {
                    suma_punktow = aktualne_punkty + punkty_do_dodania[3];
                    System.out.println("Poprawna odpowiedź.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                } else {
                    System.out.println("Zauważyłem błąd.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                }
            } else if (Random == pytan[52]) {
                System.out.print("Odpowiedź: ");
                String odp = scan.nextLine();
                if (odp.equals(odpowiedz[52])) {
                    suma_punktow = aktualne_punkty + punkty_do_dodania[6];
                    System.out.println("Poprawna odpowiedź.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                } else {
                    System.out.println("Zauważyłem błąd.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                }
            } else if (Random == pytan[53]) {
                System.out.print("Odpowiedź: ");
                String odp = scan.nextLine();
                if (odp.equals(odpowiedz[53])) {
                    suma_punktow = aktualne_punkty + punkty_do_dodania[6];
                    System.out.println("Poprawna odpowiedź.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                } else {
                    System.out.println("Zauważyłem błąd.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                }
            } else if (Random == pytan[54]) {
                System.out.print("Odpowiedź: ");
                String odp = scan.nextLine();
                if (odp.equals(odpowiedz[54])) {
                    suma_punktow = aktualne_punkty + punkty_do_dodania[9];
                    System.out.println("Poprawna odpowiedź.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                } else {
                    System.out.println("Zauważyłem błąd.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                }
            } else if (Random == pytan[55]) {
                System.out.print("Odpowiedź: ");
                String odp = scan.nextLine();
                if (odp.equals(odpowiedz[55])) {
                    suma_punktow = aktualne_punkty + punkty_do_dodania[3];
                    System.out.println("Poprawna odpowiedź.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                } else {
                    System.out.println("Zauważyłem błąd.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                }
            } else if (Random == pytan[56]) {
                System.out.print("Odpowiedź: ");
                String odp = scan.nextLine();
                if (odp.equals(odpowiedz[56])) {
                    suma_punktow = aktualne_punkty + punkty_do_dodania[9];
                    System.out.println("Poprawna odpowiedź.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                } else {
                    System.out.println("Zauważyłem błąd.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                }
            } else if (Random == pytan[57]) {
                System.out.print("Odpowiedź: ");
                String odp = scan.nextLine();
                if (odp.equals(odpowiedz[57])) {
                    suma_punktow = aktualne_punkty + punkty_do_dodania[3];
                    System.out.println("Poprawna odpowiedź.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                } else {
                    System.out.println("Zauważyłem błąd.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                }
            } else if (Random == pytan[58]) {
                System.out.print("Odpowiedź: ");
                String odp = scan.nextLine();
                if (odp.equals(odpowiedz[58])) {
                    suma_punktow = aktualne_punkty + punkty_do_dodania[6];
                    System.out.println("Poprawna odpowiedź.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                } else {
                    System.out.println("Zauważyłem błąd.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                }
            } else if (Random == pytan[59]) {
                System.out.print("Odpowiedź: ");
                String odp = scan.nextLine();
                if (odp.equals(odpowiedz[59])) {
                    suma_punktow = aktualne_punkty + punkty_do_dodania[9];
                    System.out.println("Poprawna odpowiedź.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                } else {
                    System.out.println("Zauważyłem błąd.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                }
            } else if (Random == pytan[60]) {
                System.out.print("Odpowiedź: ");
                String odp = scan.nextLine();
                if (odp.equals(odpowiedz[60])) {
                    suma_punktow = aktualne_punkty + punkty_do_dodania[9];
                    System.out.println("Poprawna odpowiedź.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                } else {
                    System.out.println("Zauważyłem błąd.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                }
            } else if (Random == pytan[61]) {
                System.out.print("Odpowiedź: ");
                String odp = scan.nextLine();
                if (odp.equals(odpowiedz[61])) {
                    suma_punktow = aktualne_punkty + punkty_do_dodania[3];
                    System.out.println("Poprawna odpowiedź.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                } else {
                    System.out.println("Zauważyłem błąd.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                }
            } else if (Random == pytan[62]) {
                System.out.print("Odpowiedź: ");
                String odp = scan.nextLine();
                if (odp.equals(odpowiedz[62])) {
                    suma_punktow = aktualne_punkty + punkty_do_dodania[3];
                    System.out.println("Poprawna odpowiedź.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                } else {
                    System.out.println("Zauważyłem błąd.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                }
            } else if (Random == pytan[63]) {
                System.out.print("Odpowiedź: ");
                String odp = scan.nextLine();
                if (odp.equals(odpowiedz[63])) {
                    suma_punktow = aktualne_punkty + punkty_do_dodania[9];
                    System.out.println("Poprawna odpowiedź.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                } else {
                    System.out.println("Zauważyłem błąd.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                }
            } else if (Random == pytan[64]) {
                System.out.print("Odpowiedź: ");
                String odp = scan.nextLine();
                if (odp.equals(odpowiedz[64])) {
                    suma_punktow = aktualne_punkty + punkty_do_dodania[9];
                    System.out.println("Poprawna odpowiedź.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                } else {
                    System.out.println("Zauważyłem błąd.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                }
            } else if (Random == pytan[65]) {
                System.out.print("Odpowiedź: ");
                String odp = scan.nextLine();
                if (odp.equals(odpowiedz[65])) {
                    suma_punktow = aktualne_punkty + punkty_do_dodania[3];
                    System.out.println("Poprawna odpowiedź.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                } else {
                    System.out.println("Zauważyłem błąd.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                }
            } else if (Random == pytan[66]) {
                System.out.print("Odpowiedź: ");
                String odp = scan.nextLine();
                if (odp.equals(odpowiedz[66])) {
                    suma_punktow = aktualne_punkty + punkty_do_dodania[3];
                    System.out.println("Poprawna odpowiedź.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                } else {
                    System.out.println("Zauważyłem błąd.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                }
            } else if (Random == pytan[67]) {
                System.out.print("Odpowiedź: ");
                String odp = scan.nextLine();
                if (odp.equals(odpowiedz[67])) {
                    suma_punktow = aktualne_punkty + punkty_do_dodania[9];
                    System.out.println("Poprawna odpowiedź.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                } else {
                    System.out.println("Zauważyłem błąd.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                }
            } else if (Random == pytan[68]) {
                System.out.print("Odpowiedź: ");
                String odp = scan.nextLine();
                if (odp.equals(odpowiedz[68])) {
                    suma_punktow = aktualne_punkty + punkty_do_dodania[6];
                    System.out.println("Poprawna odpowiedź.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                } else {
                    System.out.println("Zauważyłem błąd.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                }
            } else if (Random == pytan[69]) {
                System.out.print("Odpowiedź: ");
                String odp = scan.nextLine();
                if (odp.equals(odpowiedz[69])) {
                    suma_punktow = aktualne_punkty + punkty_do_dodania[3];
                    System.out.println("Poprawna odpowiedź.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                } else {
                    System.out.println("Zauważyłem błąd.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                }
            } else if (Random == pytan[70]) {
                System.out.print("Odpowiedź: ");
                String odp = scan.nextLine();
                if (odp.equals(odpowiedz[70])) {
                    suma_punktow = aktualne_punkty + punkty_do_dodania[6];
                    System.out.println("Poprawna odpowiedź.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                } else {
                    System.out.println("Zauważyłem błąd.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                }
            } else if (Random == pytan[71]) {
                System.out.print("Odpowiedź: ");
                String odp = scan.nextLine();
                if (odp.equals(odpowiedz[71])) {
                    suma_punktow = aktualne_punkty + punkty_do_dodania[6];
                    System.out.println("Poprawna odpowiedź.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                } else {
                    System.out.println("Zauważyłem błąd.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                }
            } else if (Random == pytan[72]) {
                System.out.print("Odpowiedź: ");
                String odp = scan.nextLine();
                if (odp.equals(odpowiedz[72])) {
                    suma_punktow = aktualne_punkty + punkty_do_dodania[6];
                    System.out.println("Poprawna odpowiedź.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                } else {
                    System.out.println("Zauważyłem błąd.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                }
            } else if (Random == pytan[73]) {
                System.out.print("Odpowiedź: ");
                String odp = scan.nextLine();
                if (odp.equals(odpowiedz[73])) {
                    suma_punktow = aktualne_punkty + punkty_do_dodania[3];
                    System.out.println("Poprawna odpowiedź.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                } else {
                    System.out.println("Zauważyłem błąd.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                }
            } else if (Random == pytan[74]) {
                System.out.print("Odpowiedź: ");
                String odp = scan.nextLine();
                if (odp.equals(odpowiedz[74])) {
                    suma_punktow = aktualne_punkty + punkty_do_dodania[6];
                    System.out.println("Poprawna odpowiedź.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                } else {
                    System.out.println("Zauważyłem błąd.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                }
            } else if (Random == pytan[75]) {
                System.out.print("Odpowiedź: ");
                String odp = scan.nextLine();
                if (odp.equals(odpowiedz[75])) {
                    suma_punktow = aktualne_punkty + punkty_do_dodania[3];
                    System.out.println("Poprawna odpowiedź.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                } else {
                    System.out.println("Zauważyłem błąd.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                }
            } else if (Random == pytan[76]) {
                System.out.print("Odpowiedź: ");
                String odp = scan.nextLine();
                if (odp.equals(odpowiedz[76])) {
                    suma_punktow = aktualne_punkty + punkty_do_dodania[6];
                    System.out.println("Poprawna odpowiedź.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                } else {
                    System.out.println("Zauważyłem błąd.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                }
            } else if (Random == pytan[77]) {
                System.out.print("Odpowiedź: ");
                String odp = scan.nextLine();
                if (odp.equals(odpowiedz[77])) {
                    suma_punktow = aktualne_punkty + punkty_do_dodania[3];
                    System.out.println("Poprawna odpowiedź.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                } else {
                    System.out.println("Zauważyłem błąd.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                }
            } else if (Random == pytan[78]) {
                System.out.print("Odpowiedź: ");
                String odp = scan.nextLine();
                if (odp.equals(odpowiedz[78])) {
                    suma_punktow = aktualne_punkty + punkty_do_dodania[3];
                    System.out.println("Poprawna odpowiedź.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                } else {
                    System.out.println("Zauważyłem błąd.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                }
            } else if (Random == pytan[79]) {
                System.out.print("Odpowiedź: ");
                String odp = scan.nextLine();
                if (odp.equals(odpowiedz[79])) {
                    suma_punktow = aktualne_punkty + punkty_do_dodania[9];
                    System.out.println("Poprawna odpowiedź.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                } else {
                    System.out.println("Zauważyłem błąd.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                }
            } else if (Random == pytan[80]) {
                System.out.print("Odpowiedź: ");
                String odp = scan.nextLine();
                if (odp.equals(odpowiedz[80])) {
                    suma_punktow = aktualne_punkty + punkty_do_dodania[9];
                    System.out.println("Poprawna odpowiedź.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                } else {
                    System.out.println("Zauważyłem błąd.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                }
            } else if (Random == pytan[81]) {
                System.out.print("Odpowiedź: ");
                String odp = scan.nextLine();
                if (odp.equals(odpowiedz[81])) {
                    suma_punktow = aktualne_punkty + punkty_do_dodania[3];
                    System.out.println("Poprawna odpowiedź.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                } else {
                    System.out.println("Zauważyłem błąd.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                }
            } else if (Random == pytan[82]) {
                System.out.print("Odpowiedź: ");
                String odp = scan.nextLine();
                if (odp.equals(odpowiedz[82])) {
                    suma_punktow = aktualne_punkty + punkty_do_dodania[9];
                    System.out.println("Poprawna odpowiedź.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                } else {
                    System.out.println("Zauważyłem błąd.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                }
            } else if (Random == pytan[83]) {
                System.out.print("Odpowiedź: ");
                String odp = scan.nextLine();
                if (odp.equals(odpowiedz[83])) {
                    suma_punktow = aktualne_punkty + punkty_do_dodania[9];
                    System.out.println("Poprawna odpowiedź.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                } else {
                    System.out.println("Zauważyłem błąd.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                }
            } else if (Random == pytan[84]) {
                System.out.print("Odpowiedź: ");
                String odp = scan.nextLine();
                if (odp.equals(odpowiedz[84])) {
                    suma_punktow = aktualne_punkty + punkty_do_dodania[3];
                    System.out.println("Poprawna odpowiedź.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                } else {
                    System.out.println("Zauważyłem błąd.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                }
            } else if (Random == pytan[85]) {
                System.out.print("Odpowiedź: ");
                String odp = scan.nextLine();
                if (odp.equals(odpowiedz[85])) {
                    suma_punktow = aktualne_punkty + punkty_do_dodania[9];
                    System.out.println("Poprawna odpowiedź.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                } else {
                    System.out.println("Zauważyłem błąd.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                }
            } else if (Random == pytan[86]) {
                System.out.print("Odpowiedź: ");
                String odp = scan.nextLine();
                if (odp.equals(odpowiedz[86])) {
                    suma_punktow = aktualne_punkty + punkty_do_dodania[6];
                    System.out.println("Poprawna odpowiedź.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                } else {
                    System.out.println("Zauważyłem błąd.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                }
            } else if (Random == pytan[87]) {
                System.out.print("Odpowiedź: ");
                String odp = scan.nextLine();
                if (odp.equals(odpowiedz[87])) {
                    suma_punktow = aktualne_punkty + punkty_do_dodania[6];
                    System.out.println("Poprawna odpowiedź.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                } else {
                    System.out.println("Zauważyłem błąd.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                }
            } else if (Random == pytan[88]) {
                System.out.print("Odpowiedź: ");
                String odp = scan.nextLine();
                if (odp.equals(odpowiedz[88])) {
                    suma_punktow = aktualne_punkty + punkty_do_dodania[9];
                    System.out.println("Poprawna odpowiedź.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                } else {
                    System.out.println("Zauważyłem błąd.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                }
            } else if (Random == pytan[89]) {
                System.out.print("Odpowiedź: ");
                String odp = scan.nextLine();
                if (odp.equals(odpowiedz[89])) {
                    suma_punktow = aktualne_punkty + punkty_do_dodania[6];
                    System.out.println("Poprawna odpowiedź.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                } else {
                    System.out.println("Zauważyłem błąd.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                }
            } else if (Random == pytan[90]) {
                System.out.print("Odpowiedź: ");
                String odp = scan.nextLine();
                if (odp.equals(odpowiedz[90])) {
                    suma_punktow = aktualne_punkty + punkty_do_dodania[6];
                    System.out.println("Poprawna odpowiedź.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                } else {
                    System.out.println("Zauważyłem błąd.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                }
            } else if (Random == pytan[91]) {
                System.out.print("Odpowiedź: ");
                String odp = scan.nextLine();
                if (odp.equals(odpowiedz[91])) {
                    suma_punktow = aktualne_punkty + punkty_do_dodania[9];
                    System.out.println("Poprawna odpowiedź.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                } else {
                    System.out.println("Zauważyłem błąd.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                }
            } else if (Random == pytan[92]) {
                System.out.print("Odpowiedź: ");
                String odp = scan.nextLine();
                if (odp.equals(odpowiedz[92])) {
                    suma_punktow = aktualne_punkty + punkty_do_dodania[9];
                    System.out.println("Poprawna odpowiedź.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                } else {
                    System.out.println("Zauważyłem błąd.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                }
            } else if (Random == pytan[93]) {
                System.out.print("Odpowiedź: ");
                String odp = scan.nextLine();
                if (odp.equals(odpowiedz[93])) {
                    suma_punktow = aktualne_punkty + punkty_do_dodania[3];
                    System.out.println("Poprawna odpowiedź.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                } else {
                    System.out.println("Zauważyłem błąd.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                }
            } else if (Random == pytan[94]) {
                System.out.print("Odpowiedź: ");
                String odp = scan.nextLine();
                if (odp.equals(odpowiedz[94])) {
                    suma_punktow = aktualne_punkty + punkty_do_dodania[9];
                    System.out.println("Poprawna odpowiedź.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                } else {
                    System.out.println("Zauważyłem błąd.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                }
            } else if (Random == pytan[95]) {
                System.out.print("Odpowiedź: ");
                String odp = scan.nextLine();
                if (odp.equals(odpowiedz[95])) {
                    suma_punktow = aktualne_punkty + punkty_do_dodania[3];
                    System.out.println("Poprawna odpowiedź.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                } else {
                    System.out.println("Zauważyłem błąd.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                }
            } else if (Random == pytan[96]) {
                System.out.print("Odpowiedź: ");
                String odp = scan.nextLine();
                if (odp.equals(odpowiedz[96])) {
                    suma_punktow = aktualne_punkty + punkty_do_dodania[3];
                    System.out.println("Poprawna odpowiedź.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                } else {
                    System.out.println("Zauważyłem błąd.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                }
            } else if (Random == pytan[97]) {
                System.out.print("Odpowiedź: ");
                String odp = scan.nextLine();
                if (odp.equals(odpowiedz[97])) {
                    suma_punktow = aktualne_punkty + punkty_do_dodania[3];
                    System.out.println("Poprawna odpowiedź.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                } else {
                    System.out.println("Zauważyłem błąd.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                }
            } else if (Random == pytan[98]) {
                System.out.print("Odpowiedź: ");
                String odp = scan.nextLine();
                if (odp.equals(odpowiedz[98])) {
                    suma_punktow = aktualne_punkty + punkty_do_dodania[9];
                    System.out.println("Poprawna odpowiedź.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                } else {
                    System.out.println("Zauważyłem błąd.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                }
            } else if (Random == pytan[99]) {
                System.out.print("Odpowiedź: ");
                String odp = scan.nextLine();
                if (odp.equals(odpowiedz[99])) {
                    suma_punktow = aktualne_punkty + punkty_do_dodania[3];
                    System.out.println("Poprawna odpowiedź.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                } else {
                    System.out.println("Zauważyłem błąd.\n");
                    System.out.println("Twoje punkty: " + suma_punktow + "\n\n");
                }
            } else {
                System.out.print("Nie ma takiego pytania zapisanego w kodzie");
            }
        }

        File file = new File("Wynik.txt");
        PrintWriter writer = new PrintWriter(file);

        Scanner scan1 = new Scanner(System.in);
        System.out.println("Zapisz wynik. (1)\nWczytaj wynik. (2)\nWszystko powyżej. (3)");
        int odp1 = scan1.nextInt();
        if (odp1 == 1) {
            writer.println("Twoj wynik: " + suma_punktow);

            System.out.println("Zapisano.");
        } else if (odp1 == 2) {
            Scanner scanner = new Scanner(file);
            int i = 0;
            while (i < 10) {
                String wynik = scanner.nextLine();
                System.out.println(wynik);
                i++;
            }
        } else if (odp1 == 3) {
            writer.println("Twoj wynik: " + suma_punktow);
            writer.close();
            System.out.println("Zapisano.");
    
            Scanner scanner = new Scanner(file);
            int i = 0;
            while (i < 10) {
                String wynik = scanner.nextLine();
                System.out.println(wynik);
                i++;
            }
        } else {
            System.out.println("Coś poszło nie tak :/");
        }
    }
}