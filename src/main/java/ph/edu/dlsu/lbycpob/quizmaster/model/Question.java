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

    // UNDERSTAND: Constructor to initialize all fields of the Question object.
    // DECISION: Instantiating options as a new ArrayList to make a defensive copy and avoid reference sharing.
    public Question(String category, String questionText, List<String> options, int correctAnswer, String equation) {
        this.category = category;
        this.questionText = questionText;
        this.options = new ArrayList<>(options);
        this.correctAnswer = correctAnswer;
        this.equation = equation;
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

