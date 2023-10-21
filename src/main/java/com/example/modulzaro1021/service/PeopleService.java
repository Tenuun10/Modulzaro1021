package com.example.modulzaro1021.service;

import com.example.modulzaro1021.model.People;
import com.example.modulzaro1021.repository.PeopleRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
@AllArgsConstructor
public class PeopleService {
    private PeopleRepo peopleRepo;

    public void savePerson(People people) {
        peopleRepo.save(people);
    }
    public List<People> showPeople() {
        return peopleRepo.findAll();
    }

    public Optional<People> getPersonById(Integer id) {
        return peopleRepo.findById(id);
    }

    public void saveUpdatedPerson(People updated) {
        peopleRepo.save(updated);
    }
}
