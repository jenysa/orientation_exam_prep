package com.orientationpractice.ratemymentor.services;

import com.orientationpractice.ratemymentor.repositories.MentorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MentorServiceImpl implements MentorService {

    @Autowired
    private MentorRepository mentorRepo;
}
