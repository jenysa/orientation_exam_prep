package com.exampractice.humans.services.human;

import com.exampractice.humans.models.Human;
import com.exampractice.humans.models.HumanDTO;

import java.util.List;

public interface HumanService {

    List<Human> getByLocation(String location);

    boolean validateData(HumanDTO human);

    void addHuman(HumanDTO human);
}
