package com.ontrack.tests;

import com.ontrack.SendMessage;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SendMessageTest {
    @Test
    public void testSendMessage() {
        int studentId = 123;
        int tutorId = 456;
        String messageContent = "Need help with task 1";
        String result = SendMessage.sendMessage(studentId, tutorId, messageContent);
        assertEquals("Message sent successfully", result);
    }
}
