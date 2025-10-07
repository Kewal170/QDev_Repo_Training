public class Practical18 {

    static void checkAge(int age) throws IllegalArgumentException {
        if (age < 18){
            throw new IllegalArgumentException("Age is below 18");
        } else {
            System.out.println("Age is valid : " + age);
        }
    }

    public static void main(String[] args) {
        try {
            int age = 12;
            checkAge(age);
        } catch (IllegalArgumentException e) {
            System.out.println("Error : " + e);
        } finally {
            System.out.println("\nCode has ran sucessfully");
        }
    }    
}
