package com.orientationpractice.ratemymentor.repositories;

import com.orientationpractice.ratemymentor.models.Mentor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MentorRepository extends CrudRepository<Mentor, Long> {

}
