<!DOCTYPE HTML>
<html lang='PL-pl'>
<head>
        <meta charset='utf-7'>
        <title>Zadanie 4</title>
        <style>
            body {
                background-color: #292929;
                color: white;
                font-family: Arial;
                font-size: 2vw;
            }
        </style>
</head>
<body>
    <?php
        $random = 0;
        $tab[0] = 0;
        $i = 0;
        while($i < 1000000) {
            $i++;
            $tab[0] = rand (-100, 100);
        }

        pcntl_alarm(600);
        pcntl_signal(SIGALRM, function() { print( "Timed-out!\n" ); exit( 0 ); });
    ?>
</body>
</html>