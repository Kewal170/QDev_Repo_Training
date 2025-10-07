/**
 * Practical 4: Write a program to demonstrate the use of while loop and do while loop. (E.g print 1 to 10 numbers)
 */
public class Practical4 {

    public static void main(String[] args) {
        // ----- While loop example -----
        int whileCount = 1;
        System.out.println("While ::> ");
        while (whileCount <= 10) {
            System.out.println(whileCount);
            whileCount++;
        }

        System.out.println("------------------------------");

        // ----- Do-While loop example -----
        int doWhileCount = 1;
        System.out.println("Do While ::> ");
        do {
            System.out.println(doWhileCount);
            doWhileCount++;
        } while (doWhileCount <= 10);

    }

}
