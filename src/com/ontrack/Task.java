package com.ontrack;

public class Task {
    private int taskId;
    private String title;
    private String status;

    public Task(int taskId, String title, String status) {
        this.taskId = taskId;
        this.title = title;
        this.status = status;
    }

    public int getTaskId() {
        return taskId;
    }

    public String getTitle() {
        return title;
    }

    public String getStatus() {
        return status;
    }
}
