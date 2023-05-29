import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

interface RandomNumberGenerator {
    int[] generateNumbersArray(int length);
    List<Integer> generateNumbersList(int length);

}

class RandomNumberGeneratorClass implements RandomNumberGenerator{
    @Override
    public int[] generateNumbersArray(int length) {
        int[] numbers = new int[length];
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            numbers[i] = random.nextInt(100);
        }
        return numbers;
    }

    @Override
    public List<Integer> generateNumbersList(int length) {
        List<Integer> numbers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            numbers.add(random.nextInt(100));
        }
        return numbers;
    }
}

public class One {
    public static void main(String[] args) {
        RandomNumberGeneratorClass randomNumberGenerator = new RandomNumberGeneratorClass ();

        Scanner sc = new Scanner(System.in);
        System.out.println("1 - Tablica\n2 - Lista");
        int choose = sc.nextLine();
        if(choose == 1) {
            int[] numberArray = randomNumberGenerator.generateNumbersArray(5);
            System.out.println("Tablica liczb:");
            for(int number : numberArray) {
                System.out.println(number);
            }
        } else if (choose == 2) {
            List<Integer> numbersList = randomNumberGenerator.generateNumbersList(5);
            System.out.println("Liczba liczb:");
            for (int number : numbersList) {
                System.out.println(number);
            }
        } else { System.out.println("nwm co sie dizeje."); }
    }

}
