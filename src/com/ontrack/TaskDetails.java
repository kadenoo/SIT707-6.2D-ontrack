package com.ontrack;

import java.util.ArrayList;
import java.util.List;

public class TaskDetails {
    public static TaskDetail getTaskDetail(int studentId, int taskId) {
        List<Message> messages = new ArrayList<>();
        messages.add(new Message("tutor", "Please correct the mistakes in question 2"));
        messages.add(new Message("student", "I have made the corrections"));

        return new TaskDetail(taskId, "Math Homework", "Well done", messages);
    }
}
