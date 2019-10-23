package com.example.demo.db.dao;

import com.example.demo.db.model.userm;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository
        extends CrudRepository<userm, Integer> {

    userm findByLogin(String login);

}
