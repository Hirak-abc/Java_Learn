import java.util.Scanner;

public class QuizGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Arrays to store questions, options and correct answers
        String[] questions = {
            "1. What is the capital of France?",
            "2. Who wrote the play 'Romeo and Juliet'?",
            "3. What is the largest planet in our solar system?",
            "4. In which year did India gain independence?",
            "5. Who is known as the Father of Computers?",
            "6. What is the chemical symbol for water?",
            "7. Who painted the Mona Lisa?",
            "8. Which is the smallest continent in the world?",
            "9. Who invented the telephone?",
            "10. Which language has the most native speakers?"
        };

        String[][] options = {
            {"A) Paris", "B) London", "C) Rome", "D) Berlin"},
            {"A) Charles Dickens", "B) William Shakespeare", "C) Jane Austen", "D) Mark Twain"},
            {"A) Earth", "B) Jupiter", "C) Saturn", "D) Mars"},
            {"A) 1947", "B) 1950", "C) 1945", "D) 1930"},
            {"A) Thomas Edison", "B) Charles Babbage", "C) Alan Turing", "D) James Watt"},
            {"A) H2O", "B) CO2", "C) O2", "D) H2"},
            {"A) Picasso", "B) Van Gogh", "C) Leonardo da Vinci", "D) Michelangelo"},
            {"A) Africa", "B) Australia", "C) Europe", "D) Antarctica"},
            {"A) Alexander Graham Bell", "B) Isaac Newton", "C) Nikola Tesla", "D) Albert Einstein"},
            {"A) English", "B) Mandarin Chinese", "C) Hindi", "D) Spanish"}
        };

        char[] correctAnswers = {'A', 'B', 'B', 'A', 'B', 'A', 'C', 'B', 'A', 'B'};

        int score = 0;

        System.out.println("🔰 Welcome to the General Knowledge Quiz Game!");
        System.out.println("👉 You will be asked 10 questions. Choose A, B, C or D.\n");

        // Loop through each question
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            for (String option : options[i]) {
                System.out.println(option);
            }

            System.out.print("Your answer: ");
            char answer = scanner.next().toUpperCase().charAt(0);

            // Check if the answer is correct
            if (answer == correctAnswers[i]) {
                System.out.println("✅ Correct!\n");
                score++;
            } else {
                System.out.println("❌ Wrong! Correct answer: " + correctAnswers[i] + "\n");
            }
        }

        // Final Score
        System.out.println("🎯 Quiz Over!");
        System.out.println("You scored " + score + " out of " + questions.length);

        if (score == 10) {
            System.out.println("🏆 Excellent! You're a genius!");
        } else if (score >= 7) {
            System.out.println("👏 Good job!");
        } else if (score >= 4) {
            System.out.println("👍 Not bad, keep learning!");
        } else {
            System.out.println("📚 Better luck next time. Keep practicing!");
        }

        scanner.close();
    }
}
