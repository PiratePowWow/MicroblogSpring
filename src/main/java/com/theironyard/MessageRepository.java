package com.theironyard;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by PiratePowWow on 3/8/16.
 */
public interface MessageRepository extends CrudRepository<Message, Integer>{
    List<Message> findByUser(User user);
}
