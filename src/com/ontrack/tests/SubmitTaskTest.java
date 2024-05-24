package com.ontrack.tests;

import com.ontrack.SubmitTask;
import com.ontrack.Task;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SubmitTaskTest {
    @Test
    public void testSubmitTask() {
        int studentId = 123;
        Task task = new Task(3, "New Task", "pending");
        String result = SubmitTask.submitTask(studentId, task);
        assertEquals("Task submitted successfully", result);
    }
}
