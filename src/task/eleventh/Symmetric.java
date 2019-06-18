package task.eleventh;

import java.util.HashSet;
import java.util.Set;

public class Symmetric {
    public static <T> Set<T> symmetricDifference(HashSet<Integer> set1, HashSet<Integer> set2) {
        HashSet tempSetFirst = new HashSet<>();
        tempSetFirst.addAll(set1);
        tempSetFirst.removeAll(set2);

        HashSet tempSetSecond = new HashSet<>();
        tempSetSecond.addAll(set2);
        tempSetSecond.removeAll(set1);

        tempSetFirst.addAll(tempSetSecond);
        return tempSetFirst;
    }
}
