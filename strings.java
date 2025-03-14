import java.util.*;

public class strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);   //taking input
        
        // Initialize a string and print it
        String str = "Hello";
        System.out.println(str);
        
        // Corrected input handling
        System.out.print("Enter a string (next): ");
        String s3 = sc.next(); // Will take input until a space
        System.out.println("Using next(): " + s3);
        
        sc.nextLine(); // Consuming the leftover newline
        
        System.out.print("Enter another string (nextLine): ");
        s3 = sc.nextLine(); // Will take the entire line input
        System.out.println("Using nextLine(): " + s3);

        // Length of the string
        int len = str.length();
        System.out.println("Length of str: " + len);

        // Character at index 3
        char ch = str.charAt(3);
        System.out.println("Character at index 3: " + ch);

        // Index of character 'a'
        int idx = str.indexOf('a'); // Will return -1 since 'a' is not present
        System.out.println("Index of 'a': " + idx);
        
        // Comparing strings
        String gtr = "Dello";
        System.out.println("Comparing str with gtr: " + str.compareTo(gtr));

        // Various string checks and transformations
        String str1 = "Physics";
        System.out.println("Does str1 contain 'P': " + str1.contains("P"));
        System.out.println("Does str1 start with 'Phy': " + str1.startsWith("Phy"));
        System.out.println("Does str1 end with 'cs': " + str1.endsWith("cs"));
        System.out.println("Lowercase str1: " + str1.toLowerCase());
        System.out.println("Uppercase str1: " + str1.toUpperCase());

        // Concatenation
        String s1 = "Mello";
        String s2 = "Dello";
        System.out.println("Concatenated string: " + s1.concat(s2));
        System.out.println("s1 after concatenation: " + s1); // Original s1 remains unchanged

        // String concatenation example
        String st = "abc";
        st = st + "def";
        System.out.println(st);

        System.out.println("abc" + "def");
        System.out.println("abc" + 10 + 20); // Will result in "abc1020" due to string concatenation
        System.out.println("abc" + (10 + 20)); // Corrected version, will result in "abc30"
        System.out.println(10 + 20 + "abc"); // Will result in "30abc" since addition happens first

        // Substring from str
        System.out.println("Substring of str: " + str.substring(0, 2)); // Will print "He"
        
        sc.close(); // Close the scanner to prevent resource leak

        s1=s1.substring(0, 2) + 'y' + s1.substring(3);
        System.out.println(s1);
 
        String s4= new String("kello");
        System.out.println(s1 == s4);
        System.out.println(s1.equals(s4));
    }
    
}
