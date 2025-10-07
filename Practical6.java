public class Practical6 {
    public static void main(String[] args) {
        int toSkip = 5;
        int toStop = 7;

        for (int i = 1; i <= 10; i++ ){
            if (i == toSkip){
                continue;
            }

            if (i == toStop + 1){
                break;
            }

            System.out.println(i);
        }
    }
}
