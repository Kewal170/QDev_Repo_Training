import java.util.ArrayList;
import java.util.HashSet;

/**
 * Practical 22: Write a program to prepare the list like(“A”, ”B”, ”C”, ”D”, ”A”, ”C”, ”E”, ”E”, ”E”) and remove duplicate values of the list. 
 */
public class Practical22 {

    public static void main(String[] args) {
        // Create an ArrayList with duplicate elements
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.add("D");
        arrayList.add("A");
        arrayList.add("C");
        arrayList.add("E");
        arrayList.add("E");
        arrayList.add("E");

        // Convert ArrayList to HashSet to remove duplicates
        HashSet<String> hashSet = new HashSet<>(arrayList);

        // Convert HashSet back to ArrayList for further use
        ArrayList<String> uniqueList = new ArrayList<>(hashSet);

        // Print unique elements
        for (String s : uniqueList) {
            System.out.print(s + " ");
        }
    }

}
