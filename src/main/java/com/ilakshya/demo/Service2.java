package com.ilakshya.demo;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

@org.springframework.stereotype.Service
public class Service2 {
    @Autowired
    private Repository2 repository2;

    public List<Profile> getData() {
        List<Profile> profiles = new ArrayList<>();
        repository2.findAll().forEach(profiles::add);
        return profiles;
    }

    public void addData(Profile profile) {
        repository2.save(profile);
    }
}
