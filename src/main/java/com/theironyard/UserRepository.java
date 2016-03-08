package com.theironyard;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by PiratePowWow on 3/8/16.
 */
public interface UserRepository extends CrudRepository<User, Integer> {
    User findByName(String name);
}
