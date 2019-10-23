package com.example.demo.db.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "devtab")

public class devm implements Serializable {

    private static final long serialVersionUID = 1L;

    public devm() {
    }

    public devm(Integer id, Integer nomer, String name) {
        this.id = id;
        this.number = nomer;
        this.name = name;
    }
    public devm(Integer nomer, String name) {
        this.number = nomer;
        this.name = name;
    }

    @Id
    @Column(name = "device_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    @Column(name = "number")
    private Integer number;

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getNumber() {
        return number;
    }

    @Column(name = "name")
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
