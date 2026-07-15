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

    // UNDERSTAND: Getter/Setter methods to provide controlled access to private data members.
    // DECISION: Returning a defensive copy of the option list to preserve the immutability of the inner state.
    public int getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(int correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public List<String> getOptions() {
        return new ArrayList<>(options);
    }

    public void setOptions(List<String> options) {
        this.options = new ArrayList<>(options);
    }

    public String getEquation() {
        return equation;
    }

    public void setEquation(String equation) {
        this.equation = equation;
    }


    @Override
    public String toString() {
        return " "; // TODO:
    }
}

