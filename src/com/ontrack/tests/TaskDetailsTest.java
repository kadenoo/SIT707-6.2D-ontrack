package com.ontrack.tests;

import com.ontrack.TaskDetail;
import com.ontrack.TaskDetails;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TaskDetailsTest {
    @Test
    public void testViewTask() {
        int studentId = 123;
        int taskId = 1;
        TaskDetail taskDetail = TaskDetails.getTaskDetail(studentId, taskId);
        assertEquals(taskId, taskDetail.getTaskId());
        assertEquals("Well done", taskDetail.getFeedback());
        assertTrue(taskDetail.getMessages().size() > 0);
    }
}
