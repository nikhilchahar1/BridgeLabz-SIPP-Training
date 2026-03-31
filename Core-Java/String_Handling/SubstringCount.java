import java.util.*;

public class SubstringCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Input scanner
        String text = sc.nextLine();         // Main string
        String sub = sc.nextLine();          // Substring to find

        int count = 0, index = 0;

        // Loop to find all occurrences of the substring
        while ((index = text.indexOf(sub, index)) != -1) {
            count++;     // Increase count
            index += sub.length(); // Move index forward
        }

        System.out.println("Occurrences: " + count); // Output result
        sc.close();
    }
}
