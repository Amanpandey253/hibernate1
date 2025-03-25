import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Apple");

        for (String fruit : set) {
            System.out.println(fruit);
        }

        set.remove("Banana");

        System.out.println("After Removal: " + set);
    }
}
