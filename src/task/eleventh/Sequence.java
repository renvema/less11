package task.eleventh;

import java.util.*;

public class Sequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        while (scanner.hasNextInt()) {
            numbers.add(scanner.nextInt());
        }
        for (int i = 0; i < numbers.size(); i = i + 2) {
            numbers.remove(i);
            i--;
        }
        Collections.reverse(numbers);
        for (Integer number : numbers) {
            System.out.print(number);
            System.out.print(" ");
        }
    }
}
