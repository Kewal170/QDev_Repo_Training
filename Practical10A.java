import java.math.BigDecimal;

/**
 * Practical 10A: Create programs to evaluate differences between == and .equals in String, Integer, and BigDecimal 
 */
public class Practical10A {

    public static void main(String[] args) {

        // ----- String Example -----
        String s1 = "Hello";
        String s2 = new String("Hello");

        System.out.println("String Comparison:");
        System.out.println("Using == : " + (s1 == s2));          // false, different objects
        System.out.println("Using .equals : " + s1.equals(s2));  // true, same content
        System.out.println();

        // ----- Integer Example -----
        Integer i1 = 100;
        Integer i2 = 100;
        Integer i3 = 200;
        Integer i4 = 200;

        System.out.println("Integer Comparison:");
        System.out.println("i1 == i2 : " + (i1 == i2));           // true, cached -128 to 127
        System.out.println("i3 == i4 : " + (i3 == i4));           // false, outside cache
        System.out.println("i3.equals(i4) : " + i3.equals(i4));   // true, same value
        System.out.println();

        // ----- BigDecimal Example -----
        BigDecimal bd1 = new BigDecimal("10.0");
        BigDecimal bd2 = new BigDecimal("10");

        System.out.println("BigDecimal Comparison:");
        System.out.println("Using == : " + (bd1 == bd2));             // false, different objects
        System.out.println("Using .equals : " + bd1.equals(bd2));     // false, value + scale different
        System.out.println("Using compareTo() == 0 : " + (bd1.compareTo(bd2) == 0)); // true, values equal
    }

}
