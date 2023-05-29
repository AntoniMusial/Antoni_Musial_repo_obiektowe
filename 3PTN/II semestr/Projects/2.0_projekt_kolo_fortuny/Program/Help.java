import java.util.Scanner;

public class Help {
    void instruction() {
        Settings settings = new Settings();
        Scanner sc = new Scanner(System.in);

        settings.cls();
        System.out.println("You choosed | Help\n\nHelp is not for free, you must to pay.");
        System.out.print("\nDo you payed? [yes / no] | ");
        String choose = sc.next();
        if (choose == "yes") { System.out.println("I do not care."); }
        else { System.out.println("Bye."); }
        System.out.println("----------------------");
    }
}
