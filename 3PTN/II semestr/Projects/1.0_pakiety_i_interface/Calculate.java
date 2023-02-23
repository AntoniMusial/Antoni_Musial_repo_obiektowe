import java.util.Scanner;

public class Calculate implements CalculatorImp {
    @Override;

    public void calculate() {
        CalculatorImp calculate;

        Scanner sc = new Scanner(System.in);
        System.out.println("Calculator\n___________");
        int a = 0;
        do {
            System.out.println("[1] - Sum\n[2] - Difference\n");
            a = sc.nextInt();

            switch (a) {
                case 1:
                    System.out.println("sum");
                    calculate = new Sum();
                    break;
                case 2:
                    System.out.println("Difference");
                    calculate = new Difference();
                    break;
            }
        }
        while (a < 3);
    }
    public static void main(String[] args) {
        
    }    
}