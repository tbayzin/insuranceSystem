package org.government.healthservice.service;

import org.government.healthservice.repository.CitizenRepository;
import org.government.healthservice.model.Citizen;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service



public class CitizenService {

    @Autowired
    CitizenRepository citizenRepository;

    public Citizen saveCitizen(Citizen citizen) {
        return citizenRepository.save(citizen);
    }

    public void delete(Long id) {
        citizenRepository.deleteById(id);
    }

    public Citizen findById(Long id) {
        return citizenRepository.findById(id).orElse(null);
    }

    public Iterable<Citizen> findAll() {
        return citizenRepository.findAll();
    }
}
