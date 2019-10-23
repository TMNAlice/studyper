package com.example.demo.db.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "users")

public class userm implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, updatable = false)
    private Long id;

    @Column(nullable = false)
    private String login;

    public String getLogin() {
        return login;
    }

    @Column(name="pass_hash", nullable = false)
    private String passHash;

    public String getHash() {
        return passHash;
    }



}
