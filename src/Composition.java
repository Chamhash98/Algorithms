import java.util.ArrayList;
import java.util.Collections;

public class Composition {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(2);

        int count = Collections.frequency(numbers,2);
        System.out.println("Count of 2 :- " + count);

        int min = Collections.min(numbers);

        ArrayList<Integer> newNumbers = new ArrayList<>();

        newNumbers.add(4);
        newNumbers.add(5);
        newNumbers.add(6);
        newNumbers.add(3);

        int max = Collections.max(newNumbers);

        boolean answer = Collections.disjoint(numbers,newNumbers);
        System.out.println("Lists are disjoint :- " + answer);
        System.out.println("Numbers array minimum :- " + min);
        System.out.println("newNumbers array maximum :- " + max);
    }
}
