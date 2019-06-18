package task.eleventh;

import java.util.*;

public class Sequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();
        int counter = 0;
        while (scanner.hasNextInt()) {
            counter++;
            if (counter % 2 != 0) {
                numbers.add(scanner.nextInt());
            } else {
                scanner.nextInt();
            }
        }

        Collections.reverse(numbers);
        for (Integer number : numbers) {
            System.out.print(number);
            System.out.print(" ");
        }
    }
}
