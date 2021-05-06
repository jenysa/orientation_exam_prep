package com.exampractice.humans.repositories;

import com.exampractice.humans.models.Human;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HumanRepository extends CrudRepository<Human, Long> {

    List<Human> findAll();

    List<Human> findAllByLocation(String location);

    @Query("SELECT AVG(h.age) FROM Human h")
    double getAvgAge();

}
