package com.example.demo.service;

import com.example.demo.db.model.devm;

import java.util.Optional;

public interface DeviceService {

        Iterable<devm> listAll();

        /*void deleteById (Integer id);

        devm add(Integer number, String name);*/

        Optional<devm> findById(Integer school);

}