package model;

import lombok.Data;

@Data
public class Question {

    public enum QuestionType {
        QUESTION_WITH_ONE_ANSVER,
        QUESTION_WITH_MULTIPLE_ANSVERS,
        OPEN_ENDED_QUESTION
    }

    private QuestionType questionType;
    private String question;
}

