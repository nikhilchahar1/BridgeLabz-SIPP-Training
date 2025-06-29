import java.util.*;

public class ToggleCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner to take input
        String input = sc.nextLine();        // Read the input string
        StringBuilder result = new StringBuilder(); // To store the toggled result

        // Loop through each character in the input
        for (char ch : input.toCharArray()) {
            if (Character.isUpperCase(ch))
                result.append(Character.toLowerCase(ch)); // Convert to lowercase
            else if (Character.isLowerCase(ch))
                result.append(Character.toUpperCase(ch)); // Convert to uppercase
            else
                result.append(ch); // Keep non-alphabet characters unchanged
        }

        System.out.println("Toggled string: " + result); // Output result
        sc.close(); // Close scanner
    }
}
