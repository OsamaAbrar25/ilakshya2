package com.ilakshya.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller2 {

    @Autowired
    private Service2 service2;

    @RequestMapping("/profile")
    public List<Profile> getData() {
        return service2.getData();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/profile")
    public void addData(@RequestBody Profile profile) {
        service2.addData(profile);
    }

}
