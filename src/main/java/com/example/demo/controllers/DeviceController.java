
package com.example.demo.controllers;

import com.example.demo.service.DeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DeviceController {

    @Autowired
    DeviceService deviceService;

    @RequestMapping(value = "/look4device/{id}", method = RequestMethod.GET)
    public ModelAndView device(@PathVariable("id") Integer id) {
        ModelAndView mav = new ModelAndView("devices");
        mav.addObject("devices", deviceService.findById(id));
        return mav;
    }
}
