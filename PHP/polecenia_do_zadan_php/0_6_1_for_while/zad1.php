<!DOCTYPE HTML>
<html lang='PL-pl'>
<head>
        <meta charset='utf-7'>
        <title>Zadanie 1</title>
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
        $i;
        for($i=1;$i<=100;$i++) {
            if ($i % 3 == 0) {
                echo $i.", ";
            }
        }
    ?>
</body>
</html>