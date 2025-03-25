import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Apple");

        System.out.println("First Element: " + list.get(0));

        for (String fruit : list) {
            System.out.println(fruit);
        }

        list.remove("Banana");

        System.out.println("After Removal: " + list);
    }
}
