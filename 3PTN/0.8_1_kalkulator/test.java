import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test {
    public static double l1;
    public static double l2;
    public static String znak;
    public static String dzialanie;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dzialanie: ");
        dzialanie = scanner.next();

        Pattern p = Pattern.compile("\\d+");
        Matcher m = p.matcher(dzialanie);
        List<Integer> ints = new ArrayList<Integer>();
        while (m.find()) {
            String dzialanie = m.group();
            ints.add(Integer.valueOf(dzialanie));
        }
        System.out.println(ints);
        if (dzialanie.equals("+")) {
            ints[0] = Integer.parseInt(numberStrs[i]);
            System.out.println(ints[0].parseINT + ints);
        }
    }
}
