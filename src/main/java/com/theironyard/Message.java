package com.theironyard;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by PiratePowWow on 3/8/16.
 */
@Entity
public class Message {
    @Id
    @GeneratedValue
    int id;

    int userId;

    String text;

    public Message(String text) {
        this.text = text;
    }

    public Message(){

    }
}
