package com.example.demo.service;

import com.example.demo.db.dao.UserRepository;
import com.example.demo.db.model.LoginService;
import com.example.demo.db.model.userm;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String string) throws UsernameNotFoundException {
        userm login = userRepository.findByLogin(string);
        if (login == null) {
            throw new UsernameNotFoundException("user not found");
       }

        return new MyLogin(login);
    }

}
