package com.exampractice.humans.controllers;

import com.exampractice.humans.models.HumanDTO;
import com.exampractice.humans.services.human.HumanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HumanApiRestController {

    private HumanService humanService;

    @Autowired
    public HumanApiRestController (HumanService humanService){
        this.humanService = humanService;
    }

    @PostMapping("/api/humans")
    public ResponseEntity<?> humansPost(@RequestBody HumanDTO human) {
        if (humanService.validateData(human)) {
            humanService.addHuman(human);
            return new ResponseEntity<>(new HumanDTO(), HttpStatus.CREATED);
        } else {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }
}
