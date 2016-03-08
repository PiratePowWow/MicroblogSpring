package com.theironyard;

import javax.persistence.*;

/**
 * Created by PiratePowWow on 3/8/16.
 */
@Entity
public class Message {
    @Id
    @GeneratedValue
    int id;

    @ManyToOne
    User user;

    String text;

    public Message(User user, String text) {
        this.user = user;
        this.text = text;
    }

    public Message(String text) {
        this.text = text;
    }

    public Message(){

    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
