package com.example.demo.service;

import com.example.demo.db.model.userm;

import java.util.Optional;

public interface UserDetailsService {

    Optional<userm> loadUserByUsername (String login);

}
