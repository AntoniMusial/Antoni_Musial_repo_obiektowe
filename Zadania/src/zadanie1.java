import org.codehaus.groovy.runtime.powerassert.SourceText;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

public class zadanie1 {
    public static void main(String[] args) {
        ArrayList<Integer> losoweliczby = new ArrayList<Integer>();
        for (int i=0;i<100;i++) {
            losoweliczby.add(i);
        }
        for (int i = 1; i < losoweliczby.size(); i++) {
            int index = (int)(Math.random() * losoweliczby.size());

            System.out.println("(" + i + ") Losowa liczba: " + losoweliczby.get(index));
        }
        System.out.println("Największa wartość: " + Collections.max(losoweliczby));
        System.out.println("Najmniejsza wartość: " + Collections.min(losoweliczby));
    }
}