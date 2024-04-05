package com.mirea.kt.example;

import java.io.Serializable;

public class Message implements Serializable {

    private int id;
    private String body;
    private String type;
    private boolean hasAttachments;
    private long timestamp;

    private static final long serialVersionUID = -3380157693869190848L;

    public Message(int id, String body, String type, boolean hasAttachments, long timestamp) {
        this.id = id;
        this.body = body;
        this.type = type;
        this.hasAttachments = hasAttachments;
        this.timestamp = timestamp;
    }
    public String toString() {
        return "Message {id = " + this.id +
                ", body = " + this.body +
                ", type = " + this.type +
                ", hasAttachments = " + this.hasAttachments +
                ", timestamp = " + this.timestamp + "}";
    }
}