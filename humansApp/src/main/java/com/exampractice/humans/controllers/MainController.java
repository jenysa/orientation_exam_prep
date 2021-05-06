package com.exampractice.humans.controllers;

import com.exampractice.humans.services.human.HumanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    private HumanService humanService;

    @Autowired
    public MainController(HumanService humanService) {
        this.humanService = humanService;
    }

    @GetMapping("/")
    public String getMainPage() {
        return "main";
    }

    @PostMapping("/humans")
    public String displayHumansByLocation(@RequestParam(value = "location", required = false) String location, Model model) {
        if ((location == null) || (humanService.getByLocation(location).isEmpty())) {
            return "badRequest";
        } else {
            model.addAttribute("humans", humanService.getByLocation(location));
            model.addAttribute("location", location);
            return "lists";
        }
    }

    @GetMapping("/humans/aggregate")
    public String getAggregateData(Model model) {
        if (humanService.getAllHumans().isEmpty()) {
            return "redirect:/";
        } else {
            model.addAttribute("age", humanService.getAvgAge());
            model.addAttribute("perWomen", humanService.getPercentageFemale());
            model.addAttribute("perMen", humanService.getPercentageMale());
            model.addAttribute("topLocation", humanService.mostPopLocation());
            return "aggregatedData";
        }
    }
}

