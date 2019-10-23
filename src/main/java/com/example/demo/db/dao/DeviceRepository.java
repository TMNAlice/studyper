package com.example.demo.db.dao;

import com.example.demo.db.model.devm;
import org.springframework.data.repository.CrudRepository;

public interface DeviceRepository extends CrudRepository<devm, Integer> {

    // List<Device> findByNumber(Integer number);
}
