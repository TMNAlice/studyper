package com.example.demo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demo.service.DeviceService;

@RestController
@RequestMapping("/devicerest")
public class DeviceRestService {

        @Autowired
        private DeviceService deviceService;

        @RequestMapping(value = "", method = RequestMethod.GET)
        public ResponseEntity<Object> browse() {
            return ResponseEntity.ok(deviceService.listAll());
        }

        @RequestMapping(value = "/find", method = RequestMethod.GET)
        public ResponseEntity<Object> found(@RequestParam Integer id) {
                return ResponseEntity.ok(deviceService.findById(id));
        }

       /* @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
        public void delete(@PathVariable("id") Integer id) {

            deviceService.deleteById(id);

        }

        @RequestMapping(value = "/add/{number}/{name}", method = RequestMethod.POST)
        public ResponseEntity<Object> add(@PathVariable("number") Integer number, @PathVariable("name") String name) {

            return ResponseEntity.ok(deviceService.add(number, name));

        }*/
}
