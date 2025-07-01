import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Custom Exception without using 'super'
class InvalidQuizSubmissionException extends Exception {
    public InvalidQuizSubmissionException(String message) {
        System.out.println("InvalidQuizSubmissionException: " + message);
    }
}

// Class to handle quiz processing logic
class QuizProcessor {
    String[] correctAnswers;
    List<Integer> allScores;

    QuizProcessor(String[] correctAnswers) {
        this.correctAnswers = correctAnswers;
        this.allScores = new ArrayList<>();
    }

    // Compare user answers with correct answers
    int processUserAnswers(String[] userAnswers) throws InvalidQuizSubmissionException {
        if (userAnswers.length != correctAnswers.length) {
            throw new InvalidQuizSubmissionException("Answer count mismatch.");
        }

        int score = 0;
        for (int i = 0; i < correctAnswers.length; i++) {
            if (userAnswers[i].equalsIgnoreCase(correctAnswers[i])) {
                score++;
            }
        }

        allScores.add(score);
        return score;
    }

    // Return grade based on score
    String getGrade(int score) {
        double percentage = (score * 100.0) / correctAnswers.length;

        if (percentage >= 90) return "A";
        if (percentage >= 75) return "B";
        if (percentage >= 50) return "C";
        return "F";
    }

    // Print all users' scores
    void displayAllScores() {
        System.out.println("All User Scores: " + allScores);
    }
}

// Main application class
public class QuizPlatform {
    public static void main(String[] args) {
        String[] correctAnswers = {"A", "B", "C", "D", "A"};
        QuizProcessor processor = new QuizProcessor(correctAnswers);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of users: ");
        int userCount = scanner.nextInt();
        scanner.nextLine(); // Clear newline

        for (int u = 1; u <= userCount; u++) {
            String[] userAnswers = new String[correctAnswers.length];
            System.out.println("\nUser " + u + " - Enter your answers:");

            for (int i = 0; i < correctAnswers.length; i++) {
                System.out.print("Q" + (i + 1) + ": ");
                userAnswers[i] = scanner.nextLine().trim();
            }

            try {
                int score = processor.processUserAnswers(userAnswers);
                String grade = processor.getGrade(score);
                System.out.println("Score: " + score + "/" + correctAnswers.length);
                System.out.println("Grade: " + grade);
            } catch (InvalidQuizSubmissionException e) {
                // Exception message already printed in constructor
            }
        }

        processor.displayAllScores();
        scanner.close();
    }
}
