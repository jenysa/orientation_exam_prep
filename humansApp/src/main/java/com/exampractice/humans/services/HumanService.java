package com.exampractice.humans.services;

import org.springframework.http.ResponseEntity;

public interface HumanService {

    void validateHuman(String firstname, String lastname, int age,
                       String gender, String location);
}
