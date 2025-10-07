import java.util.ArrayList;
import java.util.Iterator;

/**
 * Practical 20: Write a program to add string values(“Hello”,”world”,”$yourname” etc.) in the list and print all the values using an iterator. 
 */
public class Practical20 {

    public static void main(String[] args) {
        // Create an ArrayList of Strings
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Hello");
        arrayList.add("World");
        arrayList.add("Kewal");

        // Iterate through the ArrayList using Iterator
        Iterator<String> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

}
