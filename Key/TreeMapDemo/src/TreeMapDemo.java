import java.io.*;
import java.util.*;

public class TreeMapDemo {
    public static void main(String[] args) throws FileNotFoundException {
        Map<String, Integer> scores = new TreeMap<String, Integer>();
        scores.put("Kim", 38);
        scores.put("Lisa", 94);
        scores.put("Roy", 87);
        scores.put("Marty", 43);
        scores.put("Marisa", 72);

        Iterator<String> itr = scores.keySet().iterator();
        while (itr.hasNext()) {
            String name = itr.next();
            int score = scores.get(name);
            System.out.println(name + " got " + score);

            // eliminate any failing students
            if (score < 60) {
                itr.remove();     // removes name and score
            }
        }
        System.out.println(scores);  // {Lisa=94, Marisa=72, Roy=87}

    }
}