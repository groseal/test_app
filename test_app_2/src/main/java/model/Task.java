package model;

import lombok.Data;

import java.util.List;

@Data
public class Task {
    private Question question;
    private List<Answer> answers;
}
