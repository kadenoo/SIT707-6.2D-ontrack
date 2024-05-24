package com.ontrack.tests;

import com.ontrack.SubmitFeedback;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SubmitFeedbackTest {
    @Test
    public void testSubmitFeedback() {
        int tutorId = 456;
        int taskId = 1;
        String feedbackContent = "Good job";
        String result = SubmitFeedback.submitFeedback(tutorId, taskId, feedbackContent);
        assertEquals("Feedback submitted successfully", result);
    }
}
