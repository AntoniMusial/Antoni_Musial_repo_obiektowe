<!DOCTYPE HTML>
<html lang='PL-pl'>
<head>
        <meta charset='utf-7'>
        <title>Zadanie 3</title>
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
        $a=$_GET["a"];
        $b=$_GET["b"];
        $c=$_GET["c"];
        
        echo 
            "
                
                <table>
                <tr><td>a:</td><td><input type='text' name='a' value='1' /></td></tr>
                <tr><td>b:</td><td><input type='text' name='b' value='2' /></td></tr>
                <tr><td>c:</td><td><input type='text' name='c' value='3' /></td></tr>
                <tr><td>&nbsp;</td><td><input type='submit' value=' przelicz ' /></td></tr>
                </table>
                </form>
            ";
        echo $a;
        if (is_numeric($a) and is_numeric($b) and is_numeric($c) and $a<>0) {
          $delta=$b*$b-4*$a*$c;
          if ($delta>0) {
            $x1=(-$b-sqrt($delta))/(2*$a);
            $x2=(-$b+sqrt($delta))/(2*$a);
            echo "Równanie ma dwa pierwiastki rzeczywiste: $x1 oraz $x2";
          } else if ($delta==0) {
            $x1=-$b/(2*$a);
            echo "Równanie ma jeden pierwiastek rzeczywisty: $x1";
          } else if ($delta<0) {
            echo "Równanie nie ma pierwiastków rzeczywistych";
          }
        } else echo "Wprowadzone dane są błędne!";
    ?>
</body>
</html>