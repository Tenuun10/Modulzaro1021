package com.example.modulzaro1021.repository;

import com.example.modulzaro1021.model.People;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PeopleRepo extends JpaRepository<People,Integer> {
}
