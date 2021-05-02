package com.exampractice.humans.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class HumanServiceImpl implements HumanService {
    @Autowired
    private RestTemplateBuilder restTemplateBuilder;

    @Override
    public void validateHuman(String firstname, String lastname, int age,
                              String gender, String location) {
        // -1 = invaild submission
        // 0 = valid submission
        var response = 0;
        // 1. check if all variables are present
        // 2. check that age is a number
        // 3. check that gender is male or female
        // if anything fails above, respond with 400 bad request
        // if it passes, store data in db and respond with 201 created
        if (firstname == null || lastname == null
                || gender == null || location == null || age == Integer.parseInt(null)) {
            response = -1;
        } else if (!gender.equalsIgnoreCase("female") || !gender.equalsIgnoreCase("male")) {
            response = -1;
        } else {
            response = 0;
        }


    }
}
