package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.db.dao.DeviceRepository;
import com.example.demo.db.model.devm;

import java.util.Optional;

@Service
public class DeviceServiceImpl implements DeviceService {

        @Autowired
        private DeviceRepository deviceRepository;

        @Override
        public Iterable<devm> listAll() {
            return deviceRepository.findAll();
        }

         /*@Override
        public void deleteById(Integer id) {
            deviceRepository.deleteById(id);
        }

        @Override
        public devm add(Integer number, String name) {
            return deviceRepository.save(new devm(number, name));
        }*/

        @Override
        public Optional<devm> findById(Integer id) { return deviceRepository.findById(id); }
}