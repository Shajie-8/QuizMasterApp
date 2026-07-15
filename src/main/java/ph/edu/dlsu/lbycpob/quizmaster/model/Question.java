package ph.edu.dlsu.lbycpob.quizmaster.model;

import java.util.ArrayList;
import java.util.List;

// Question.java
public class Question {
    // UNDERSTAND: Private variables to prevent external classes from directly modifying internal state (Encapsulation).
    private int correctAnswer;
    private String category;
    private String questionText;
    private List<String> options;
    private String equation;

    public Question(String category, String questionText, List<String> options, int correctAnswer, String equation) {
        // TODO:
    }

    // Getters
    // TODO:

    // Setters
    // TODO:

    @Override
    public String toString() {
        return " "; // TODO:
    }
}

