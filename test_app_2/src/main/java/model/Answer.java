package model;

import lombok.Data;

@Data
public class Answer {
    private boolean answerType;
    private String answer;
    private int answerCost;
}
