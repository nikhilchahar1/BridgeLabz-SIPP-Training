import java.util.*;

public class LongestWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner to take input
        String sentence = sc.nextLine();     // Read the full sentence
        String[] words = sentence.split(" "); // Split sentence into words

        String longest = ""; // To store the longest word

        // Loop through each word
        for (String word : words) {
            if (word.length() > longest.length()) // Check if current word is longer
                longest = word; // Update longest word
        }

        System.out.println("Longest word: " + longest); // Output result
        sc.close(); // Close scanner
    }
}
