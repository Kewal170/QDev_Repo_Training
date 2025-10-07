import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Practical 25:  Write a program to read the data from a myTestFile file (Using File Handling, Input Handling, Loops, String Handling, and Exception Handling). 
 */
public class Practical25 {

    public static void main(String[] args) {
        // Try-with-resources to automatically close BufferedReader
        try (BufferedReader br = new BufferedReader(new FileReader("myTestFile.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

}
