import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Practical 24:  Write a program to create a text file(The file name is “myTestFile”) and add your personal details to the test file. 
 */
public class Practical24 {

    public static void main(String[] args) throws IOException {
        // Create a new file
        File file = new File("myTestFile.txt");
        boolean isFileCreated = file.createNewFile();

        if (isFileCreated) {
            System.out.println("File is created");
        } else {
            System.out.println("File not created or already exists");
        }

        // Write data to the file
        FileWriter fileWriter = new FileWriter("myTestFile.txt");
        fileWriter.write("Name : Kewal Suthar");
        fileWriter.append("\nQualification : B.Tech in Information Technology");
        fileWriter.append("\nHobby : Solving Complex Problems");
        fileWriter.close();
    }

}
