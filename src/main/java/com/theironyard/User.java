package com.theironyard;

import java.util.ArrayList;

/**
 * Created by PiratePowWow on 3/7/16.
 */
public class User {
    String name;
    ArrayList<String> messages = new ArrayList<String>();

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
