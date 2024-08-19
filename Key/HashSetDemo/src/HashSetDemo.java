import java.util.*;

public class HashSetDemo {
    public static void main(String[] args) {
//        Set<String> names = new HashSet<>();    // arbitrary order (based on hash function)
//        Set<String> names = new TreeSet<>();    // "natural" order - for strings alpha order, upper case then lower case
        Set<String> names = new LinkedHashSet<>();    // order items were added to the collection
        names.add("Jake");
        names.add("Robert");
        names.add("john");
        names.add("Marisa");
        names.add("Kasey");

        System.out.println(names);
    }
}