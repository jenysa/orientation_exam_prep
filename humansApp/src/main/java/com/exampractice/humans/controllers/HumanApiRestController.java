package com.exampractice.humans.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HumanApiRestController {

    @PostMapping("/api/humans")
    public ResponseEntity<?> humansPost() {
        return null;
    }

    /*@PostMapping("/dountil/{action}")
    public ResponseEntity<?> doUntil(@PathVariable(value = "action") String action, @RequestBody Until until) {
        if ((until == null) || (until.getUntil() == null)) {
            return new ResponseEntity<>(errorService.noNumber(), HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(appService.doUntil(until, action, ("/dountil/"+action)), HttpStatus.OK);
    }*/
}
