package com.exampractice.humans.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @GetMapping("/")
    public String getMainPage() {
        return "main";
    }

    @GetMapping("/humans/aggregate")
    public String getAggregateData() {
        return null;
    }

    @GetMapping("/humans")
    public String getHumans() {
        return null;
    }

    @GetMapping("/humans")
    public String filterByLocation(@RequestParam(required = false) String location, Model model) {
        if ((location.isEmpty()) || (location == null)) {
            return "badRequest";
        } else {
            model.addAttribute("location", location);
            return "lists";
        }
    }
}
