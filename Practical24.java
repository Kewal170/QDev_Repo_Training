import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Practical24 {
    public static void main(String[] args) throws IOException {
        File file = new File("myTestFile.txt");
        boolean isFileCreated = file.createNewFile();
        if (isFileCreated == true ){
            System.out.println("File is created");
        } else {
            System.out.println("File not created or Already Exists");
        }

        FileWriter fileWriter = new FileWriter("myTestFile.txt");
        fileWriter.write("Name : Kewal Suthar");
        fileWriter.append("\nQualification : B.tech in Information Technology");
        fileWriter.append("\nHobby : Solving Complex Problems");
        fileWriter.close();


    }
}
