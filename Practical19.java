/**
 * Practical 19: Write a program to find the index of an array element. 
 */
public class Practical19 {

    public static void main(String[] args) {
        int arr[] = {12, 65, 34, 98, 33, 77};
        int toFind = 33;
        int answer = -1;

        // Search for the element in the array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == toFind) {
                System.out.println("Index of " + toFind + " in array: " + i);
                answer = i;
                break;
            }
        }

        // Element not found
        if (answer < 0) {
            System.out.println("Not Found");
        }
    }

}
