import java.util.Scanner;

public class toggle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder(sc.nextLine());
        System.out.println("Original String: " + str);

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int asci = (int) ch;

            // Check if the character is lowercase
            if (asci >= 97 && asci <= 122) {
                asci -= 32; // Convert to uppercase
            } else if (asci >= 65 && asci <= 90) { // Check if the character is uppercase
                asci += 32; // Convert to lowercase
            }

            // Set the modified character back to the string
            str.setCharAt(i, (char) asci);
        }

        System.out.println("Toggled String: " + str);
    }
}
