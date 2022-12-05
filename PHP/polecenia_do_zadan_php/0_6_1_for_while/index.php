<!DOCTYPE HTML>
<html lang='PL-pl'>
<head>
        <meta charset='utf-7'>
        <title>Dog's boobs</title>
        <style>
            body {
                background-color: #292929;
                color: white;
                font-family: Arial;
                font-size: 1vw;
            }

            #container {
                background-color: #282828;
                width: 470px;
                height: 400px;
                border: 1px solid white;
                border-radius: 2px;
                padding: 7px;
                text-align: center;
                margin-left: auto;
                margin-right: auto;
            }

            table {
                border: 1px solid white;
                border-radius: 3px;
                padding: 3px;
            }

            th {
                border-left: 1px solid white;
                border-right: 1px solid white;
                padding: 3px;
            }
        </style>
</head>
<body>
    <form action='' method='post'>
        Wybierz ilość osób do wyświetlenia: 
        <select name="osoby_do_wyswietlenia">
            <option>5</option>
            <option>10</option>
            <option>15</option>
            <option>20</option>
            <option>25</option>
            <option>30</option>
            <option>35</option>
            <option>40</option>
            <option>45</option>
            <option>50</option>
            <option>55</option>
            <option>60</option>
            <option>65</option>
            <option>70</option>
            <option>75</option>
            <option>80</option>
            <option>85</option>
            <option>90</option>
            <option>95</option>
            <option>100</option>
        </select><br>
        <input type="submit" value="Pokaż">
    </form>
    <?php
        //TWORZENIE TABLICY IMIE
        $imie[] = 'Anna1';
        $imie[] = 'Anna2';
        $imie[] = 'Anna3';
        $imie[] = 'Anna4';
        $imie[] = 'Anna5';
        $imie[] = 'Anna6';
        $imie[] = 'Anna7';
        $imie[] = 'Anna8';
        $imie[] = 'Anna9';
        $imie[] = 'Anna10';

        //TWORZENIE TABLICY IMIE
        $nazwisko[] = 'Nazwisko_Anny1';
        $nazwisko[] = 'Nazwisko_Anny2';
        $nazwisko[] = 'Nazwisko_Anny3';
        $nazwisko[] = 'Nazwisko_Anny4';
        $nazwisko[] = 'Nazwisko_Anny5';
        $nazwisko[] = 'Nazwisko_Anny6';
        $nazwisko[] = 'Nazwisko_Anny7';
        $nazwisko[] = 'Nazwisko_Anny8';
        $nazwisko[] = 'Nazwisko_Anny9';
        $nazwisko[] = 'Nazwisko_Anny10';
        
        //POBIERANIE DANYCH Z POLA osoby_do_wyswietlenia
        $odw=$_POST['osoby_do_wyswietlenia'];

        //TWORZENIE TABLICY WIEK
        for($i=0; $i <= $odw; $i++) {
            $r = rand(18,70);
            $wiek[$i] = $r;
            echo $wiek[$i] . " ";
        }
        echo '<br>';
        
        //TWORZENIE TABLICY WAGA
        for($i=0; $i <= $odw; $i++) {
            $r = rand(50,130);
            $waga[$i] = $r;
            echo $waga[$i] . " ";
        }
        echo '<br>';

        //TWORZENIE TABLICY WZROST
        for($i=0; $i <= $odw; $i++) {
            $r = rand(160,205);
            $wzrost[$i] = $r;
            echo $wzrost[$i] . " ";
        }

        //GÓRA TABELI
        echo
            "
                <table>
                    <tr>
                        <th>Lp.</th>
                        <th>Imie</th>
                        <th>Nazwisko</th>
                        <th>Wiek</th>
                        <th>Waga</th>
                        <th>Wzrost</th>
                        <th>BMI</th>
                        <th>Opis</th>
                    </tr>
            ";

        //OPIS TABELI
        for($i=0; $i <= $odw; $i++) {
            $wzrost[$i] /= 100;
            $bmi[] = $waga[$i] / ($wzrost[$i] * $wzrost[$i]);
            $r = rand(1,9);
            $nazwisko_r[] = $nazwisko[$r];
            $imie_r[] = $imie[$r];
            echo
                "
                    <tr>
                        <th>$i</th>
                        <th>$imie_r[$i]</th>
                        <th>$nazwisko_r[$i]</th>
                        <th>$wiek[$i]</th>
                        <th>$waga[$i]</th>
                        <th>$wzrost[$i]</th>
                        <th>$bmi[$i]</th>
                ";
            if($bmi[$i] < 16) {
                echo "<th style='color:black;'>Wygłodzenie</th></tr>";
            } else if($bmi[$i] > 16 && $bmi[$i] < 17) {
                echo "<th style='color:#800000;'>Wychudzenie</th></tr>"; 
            } else if($bmi[$i] > 17 && $bmi[$i] < 18.5) {
                echo "<th style='color:#800080;'>Niedowaga</th></tr>"; 
            } else if($bmi[$i] > 18.5 && $bmi[$i] < 25) {
                echo "<th style='color:green;'>Wartosć prawidłowa</th></tr>"; 
            } else if($bmi[$i] > 25 && $bmi[$i] < 30) {
                echo "<th style='color:red;'>Nadwaga</th></tr>"; 
            } else if($bmi[$i] > 30 && $bmi[$i] < 35) {
                echo "<th style='color:#800080;'>I stopień otyłości</th></tr>";
            } else if($bmi[$i] > 35 && $bmi[$i] < 40) {
                echo "<th style='color:#800000;'>II stopień otyłości</th></tr>"; 
            } else if($bmi[$i] > 40) {
                echo "<th style='color:black;'>III stopień otyłości (otyłość skrajna)</th></tr>"; 
            }
        }
    ?>
</body>
</html>