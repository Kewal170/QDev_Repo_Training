import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * Practical 21: Write another program using Map and Set concepts. 
 */
public class Practical21 {

    public static void main(String[] args) {
        // ----- HashMap Example -----
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Kewal");
        map.put(2, "Raj");
        map.put(3, "Rahul");
        map.put(4, "Abhinav");
        map.put(5, "Rakesh");

        // Iterate through the map entries
        for (Map.Entry<Integer, String> mapEntry : map.entrySet()) {
            System.out.println("Key : " + mapEntry.getKey() + " - Value : " + mapEntry.getValue());
        }

        System.out.println();

        // ----- HashSet Example -----
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(1);
        hashSet.add(12);
        hashSet.add(41);
        hashSet.add(23);

        // Iterate through the set
        for (Integer i : hashSet) {
            System.out.print(i + " ");
        }
    }

}
