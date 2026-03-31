public class PalindromeChecker {
    static class Checker {
        String text;

        // Method to check if the text is a palindrome
        boolean isPalindrome() {
            String reversed = "";
            for (int i = text.length() - 1; i >= 0; i--) {
                reversed += text.charAt(i);
            }
            return text.equalsIgnoreCase(reversed);
        }

        // Method to display the result
        void displayResult() {
            if (isPalindrome()) {
                System.out.println(text + " is a palindrome.");
            } else {
                System.out.println(text + " is not a palindrome.");
            }
        }
    }

    public static void main(String[] args) {
        Checker c = new Checker();
        c.text = "Madam";  // You can change this to test other words
        c.displayResult();
    }
}
