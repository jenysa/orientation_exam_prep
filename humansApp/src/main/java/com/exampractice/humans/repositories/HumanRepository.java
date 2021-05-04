package com.exampractice.humans.repositories;

import com.exampractice.humans.models.Human;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HumanRepository extends CrudRepository<Human, Long> {

    List<Human> findAllByLocation(String location);

}
