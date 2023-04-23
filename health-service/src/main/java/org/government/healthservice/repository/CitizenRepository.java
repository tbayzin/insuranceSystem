package org.government.healthservice.repository;

import org.government.healthservice.model.Citizen;

import org.springframework.data.mongodb.repository.MongoRepository;


public interface CitizenRepository extends MongoRepository<Citizen, Long> {

}