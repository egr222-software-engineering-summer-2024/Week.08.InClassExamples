import java.util.*;

public class KeySetDemo {
    public static void main(String[] args) {
        Map<String, Integer> ages = new HashMap<String, Integer>();
        ages.put("Marty", 19);
        ages.put("Geneva", 2);
        ages.put("Vicki", 57);
        ages.put("John",19);
        ages.put("James",19);
        for (String name : ages.keySet()) {         // Geneva->2
            int age = ages.get(name);               // Marty->19
            System.out.println(name + "->" + age);  // Vicki->57
        }
        ages.remove("James");
        System.out.println(ages);
        System.out.println(ages.values());
        System.out.println(ages.containsValue(19));
        ages.remove("John");
        System.out.println(ages);
        System.out.println(ages.containsValue(19));
        ages.remove("Marty");
        System.out.println(ages);
        System.out.println(ages.containsValue(19));
    }
}