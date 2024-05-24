package com.ontrack;

public class Message {
    private String from;
    private String content;

    public Message(String from, String content) {
        this.from = from;
        this.content = content;
    }

    public String getFrom() {
        return from;
    }

    public String getContent() {
        return content;
    }
}
