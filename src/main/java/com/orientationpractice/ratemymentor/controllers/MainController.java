package com.orientationpractice.ratemymentor.controllers;

import com.orientationpractice.ratemymentor.services.MentorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    private MentorService mentorService;

    @Autowired
    public MainController(MentorService mentorService) {
        this.mentorService = mentorService;
    }

    @GetMapping("/")
    public String getIndex(){
        return "index";
    }

    @GetMapping("/mentor/{id}")
    public String viewMentor(@RequestParam ("id") Long id){
        return null;
    }

    @PostMapping("/mentor")
    public String addMentorPost(){
        return "index";
    }

}
