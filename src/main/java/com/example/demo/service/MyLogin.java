package com.example.demo.service;

import com.example.demo.db.model.userm;
import org.springframework.security.core.authority.AuthorityUtils;

public class MyLogin extends org.springframework.security.core.userdetails.User {

    private static final long serialVersionUID = 1L;
    private userm user;

    public MyLogin (userm user){
        super(user.getLogin(), user.getHash(),AuthorityUtils.createAuthorityList("ALL"));
        this.user=user;
    }
}
