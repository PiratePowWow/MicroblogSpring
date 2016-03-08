package com.theironyard;

import javax.persistence.*;
import java.util.List;

/**
 * Created by PiratePowWow on 3/7/16.
 */
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue
    int id;

    //@Column(unique = true)
    String name;
    //ArrayList<String> messages = new ArrayList<String>();
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
    private List<Message> messages;

    public User(){

    }

    public User(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
