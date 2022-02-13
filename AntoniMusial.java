import java.util.Scanner;
import java.util.Random;
public class AntoniMusial {
    public static void main (String[]args) {
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

        String[] odpowiedz = new String[13];
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

        Random r = new Random();
        int idxR = new Random().nextInt(pytan.length);
        String Random = (pytan[idxR]);
        System.out.println(Random);

        if (Random == pytan[0]) {
            System.out.print("Odpowiedź: ");
            String odp = scan.nextLine();
            if (odp == odpowiedz[0]) {
                System.out.print("Poprawna odpowiedź.");
            } else {
                System.out.println("Zauważyłem błąd");
            }
        } else if (Random == pytan[1]) {
            System.out.print("Odpowiedź: ");
            String odp = scan.nextLine();
            if (odp == odpowiedz[1]) {
                System.out.print("Poprawna odpowiedź.");
            } else {
                System.out.println("Zauważyłem błąd");
            }
        } else if (Random == pytan[2]) {
            System.out.print("Odpowiedź: ");
            String odp = scan.nextLine();
            if (odp == odpowiedz[2]) {
                System.out.print("Poprawna odpowiedź.");
            } else {
                System.out.println("Zauważyłem błąd");
            }
        } else if (Random == pytan[3]) {
            System.out.print("Odpowiedź: ");
            String odp = scan.nextLine();
            if (odp == odpowiedz[3]) {
                System.out.print("Poprawna odpowiedź.");
            } else {
                System.out.println("Zauważyłem błąd");
            }
        } else if (Random == pytan[4]) {
            System.out.println("Odpowiedź: ");
            String odp = scan.nextLine();
            if (odp == odpowiedz[4]) {
                System.out.print("Poprawna odpowiedź.");
            } else {
                System.out.println("Zauważyłem błąd");
            }
        } else if (Random == pytan[5]) {
            System.out.print("Odpowiedź: ");
            String odp = scan.nextLine();
            if (odp == odpowiedz[5]) {
                System.out.print("Poprawna odpowiedź.");
            } else {
                System.out.println("Zauważyłem błąd");
            }
        } else if (Random == pytan[6]) {
            System.out.print("Odpowiedź: ");
            String odp = scan.nextLine();
            if (odp == odpowiedz[6]) {
                System.out.print("Poprawna odpowiedź.");
            } else {
                System.out.println("Zauważyłem błąd");
            }
        } else if (Random == pytan[7]) {
            System.out.print("Odpowiedź: ");
            String odp = scan.nextLine();
            if (odp == odpowiedz[7]) {
                System.out.print("Poprawna odpowiedź.");
            } else {
                System.out.println("Zauważyłem błąd");
            }
        } else if (Random == pytan[8]) {
            System.out.print("Odpowiedź: ");
            String odp = scan.nextLine();
            if (odp == odpowiedz[8]) {
                System.out.print("Poprawna odpowiedź.");
            } else {
                System.out.println("Zauważyłem błąd");
            }
        } else if (Random == pytan[9]) {
            System.out.print("Odpowiedź: ");
            String odp = scan.nextLine();
            if (odp == odpowiedz[9]) {
                System.out.print("Poprawna odpowiedź.");
            } else {
                System.out.println("Zauważyłem błąd");
            }
        } else if (Random == pytan[10]) {
            System.out.print("Odpowiedź: ");
            String odp = scan.nextLine();
            if (odp == odpowiedz[10]) {
                System.out.print("Poprawna odpowiedź.");
            } else {
                System.out.println("Zauważyłem błąd");
            }
        } else if (Random == pytan[11]) {
            System.out.print("Odpowiedź: ");
            String odp = scan.nextLine();
            if (odp == odpowiedz[11]) {
                System.out.print("Poprawna odpowiedź.");
            } else {
                System.out.println("Zauważyłem błąd");
            }
        } else if (Random == pytan[12]) {
            System.out.print("Odpowiedź: ");
            String odp = scan.nextLine();
            if (odp == odpowiedz[12]) {
                System.out.print("Poprawna odpowiedź.");
            } else {
                System.out.println("Zauważyłem błąd");
            }
        } else {
            System.out.print("Nie ma takiego pytania zapisanego w kodzie");
        }
    }
}
