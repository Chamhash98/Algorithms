import java.util.ArrayList;
import java.util.Collections;

public class Shuffling {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(32);
        numbers.add(635);
        numbers.add(63);
        numbers.add(98);
        numbers.add(5216);
        numbers.add(9);

        Collections.shuffle(numbers);

        System.out.println("Shuffled List :- " + numbers);

    }
}
