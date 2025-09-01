import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        // 1. Create a mutable List by wrapping the immutable list
        List<Integer> test = new ArrayList<>(List.of(1, 2, 3, 4, 7, 2));

        // 2. Use Collections.sort() to sort the list in-place
        Collections.sort(test);

        // 3. Print the sorted list
        System.out.println(test);
    }
}
