package com.ontrack.tests;

import com.ontrack.UpdateTaskStatus;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class UpdateTaskStatusTest {
    @Test
    public void testUpdateTaskStatus() {
        int tutorId = 456;
        int taskId = 1;
        String newStatus = "completed";
        String result = UpdateTaskStatus.updateTaskStatus(tutorId, taskId, newStatus);
        assertEquals("Task status updated successfully", result);
    }
}
