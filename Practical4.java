public class Practical4 {
    public static void main(String[] args) {
        int whileCount = 1;
        System.out.println("While ::> ");
        while ( whileCount <= 10){
            System.out.println(whileCount);
            whileCount++;
        }

        System.out.println("------------------------------");


        int doWhileCount = 1;
        System.out.println("Do While ::> ");
        do {
            System.out.println(doWhileCount);
            doWhileCount++;
        } while (doWhileCount <= 10);
    }
}
