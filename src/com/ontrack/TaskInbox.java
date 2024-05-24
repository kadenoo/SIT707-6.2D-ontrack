package com.ontrack;

import java.util.ArrayList;
import java.util.List;

public class TaskInbox {
    public static List<Task> getTasks(int studentId) {
        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task(1, "Math Homework", "completed"));
        tasks.add(new Task(2, "Science Project", "under review"));
        return tasks;
    }
}
