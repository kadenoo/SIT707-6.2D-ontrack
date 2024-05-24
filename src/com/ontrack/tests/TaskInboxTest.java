package com.ontrack.tests;

import com.ontrack.Task;
import com.ontrack.TaskInbox;
import org.junit.Test;
import static org.junit.Assert.assertTrue;

import java.util.List;

public class TaskInboxTest {
    @Test
    public void testTaskInbox() {
        int studentId = 123;
        List<Task> tasks = TaskInbox.getTasks(studentId);
        assertTrue(tasks.size() > 0);
        assertTrue(tasks.get(0).getStatus().equals("completed") || tasks.get(0).getStatus().equals("under review"));
    }
}
