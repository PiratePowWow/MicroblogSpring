package com.theironyard;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.ArrayList;

/**
 * Created by PiratePowWow on 3/7/16.
 */
@Entity
public class User {
    @Id
    @GeneratedValue
    int id;

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
