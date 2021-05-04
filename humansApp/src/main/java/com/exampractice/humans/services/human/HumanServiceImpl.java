package com.exampractice.humans.services.human;

import com.exampractice.humans.models.Human;
import com.exampractice.humans.models.HumanDTO;
import com.exampractice.humans.repositories.HumanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HumanServiceImpl implements HumanService {

    private RestTemplateBuilder restTemplateBuilder;
    private HumanRepository humanRepo;

    @Autowired
    public HumanServiceImpl(RestTemplateBuilder restTemplateBuilder, HumanRepository humanRepo) {
        this.restTemplateBuilder = restTemplateBuilder;
        this.humanRepo = humanRepo;
    }


    @Override
    public List<Human> getByLocation(String location) {
        return humanRepo.findAllByLocation(location);
    }

    @Override
    public boolean validateData(HumanDTO humanDTO) {
        return ((humanDTO.getGender().equalsIgnoreCase("female"))
                || humanDTO.getGender().equalsIgnoreCase("male"))
                && (humanDTO.getFirstName() != null)
                && (humanDTO.getLastName() != null)
                && (humanDTO.getGender() != null)
                && (humanDTO.getAge() != null)
                && (humanDTO.getLocation() != null);
    }

    @Override
    public void addHuman(HumanDTO humanDTO) {
        humanRepo.save(humanDTO.makeHuman());
    }
}

