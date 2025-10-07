public class Practical10 {
    public static void main(String[] args) {
        String string1 = "Hello";
        String string2 = "World ";

        // charAt()
        System.out.println("Character at position 3 in string1: " + string1.charAt(2));

        // concat()
        System.out.println("Concatenation of string1 and string2: " + string1.concat(string2));

        // equals() and equalsIgnoreCase()
        if (string1.equals(string2)) {
            System.out.println("string1 and string2 are equal.");
        } else {
            System.out.println("string1 and string2 are not equal.");
        }
        System.out.println("string1 equals string2 ignoring case? : " + string1.equalsIgnoreCase(string2));

        // length()
        System.out.println("Length of string1: " + string1.length());

        // substring()
        System.out.println("Substring of string1 from index 2 to 4: " + string1.substring(2, 4));

        // toUpperCase() / toLowerCase()
        System.out.println("string1 in uppercase: " + string1.toUpperCase());
        System.out.println("string1 in lowercase: " + string1.toLowerCase());

        // contains()
        System.out.println("Does string1 contain 'ell'? : " + string1.contains("ell"));

        // replace()
        System.out.println("Replace 'l' with 'a' in string1: " + string1.replace('l', 'a'));

        // trim()
        System.out.println("Trimmed string2: '" + string2.trim() + "'");

        // Additional useful methods
        System.out.println("Does string1 start with 'He'? : " + string1.startsWith("He"));
        System.out.println("Does string1 end with 'lo'? : " + string1.endsWith("lo"));
        System.out.println("Index of 'l' in string1: " + string1.indexOf('l'));
        System.out.println("Last index of 'l' in string1: " + string1.lastIndexOf('l'));
        System.out.println("Is string1 empty? : " + string1.isEmpty());
    }
}
