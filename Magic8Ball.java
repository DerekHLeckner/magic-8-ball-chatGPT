import java.util.Scanner;
import java.util.Random;

public class Magic8Ball {
  public static void main(String[] args) {
    // Create a modified array of possible answers
    String[] answers = {
      "It is certain",
      "Yes, definitely",
      "Most likely",
      "Yes",
      "Ask again later",
      "Concentrate and ask again",
      "Yes",
      "My reply is no",
      "My sources say no",
      "Very doubtful"
    };

    // Read the question from the user
    System.out.println("Enter a question: ");
    Scanner scanner = new Scanner(System.in);
    String question = scanner.nextLine();

    // Check if the question is valid (contains a question mark and has at least three letters)
    if (question.contains("?") && question.length() > 3) {
      // Generate a random index between 0 and the length of the answers array
      Random random = new Random();
      int index = random.nextInt(answers.length);

      // Print the answer at the random index
      System.out.println(answers[index]);
    } else {
      // Prompt the user to enter a valid question
      System.out.println("Not sure if that was a question. Did you ask it as such? Please include a question mark and make sure the question has at least three letters!");
      main(null);
    }
  }
}
