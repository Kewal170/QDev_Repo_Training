import java.util.ArrayList;
import java.util.HashSet;

public class Practical22 {
    public static void main(String[] args) {
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

        HashSet<String> hashSet = new HashSet<>(arrayList);
        ArrayList<String> uniqueList = new ArrayList<>(hashSet);
        for(String s : uniqueList){
            System.out.print(s + " ");
        }
    }
}
