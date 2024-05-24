package com.ontrack;

import java.util.List;

public class TaskDetail {
    private int taskId;
    private String title;
    private String feedback;
    private List<Message> messages;

    public TaskDetail(int taskId, String title, String feedback, List<Message> messages) {
        this.taskId = taskId;
        this.title = title;
        this.feedback = feedback;
        this.messages = messages;
    }

    public int getTaskId() {
        return taskId;
    }

    public String getTitle() {
        return title;
    }

    public String getFeedback() {
        return feedback;
    }

    public List<Message> getMessages() {
        return messages;
    }
}
