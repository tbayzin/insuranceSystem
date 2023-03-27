package org.government.healthservice.repository;

import org.government.healthservice.model.Citizen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public
interface CitizenRepository extends JpaRepository <Citizen, Long> {

}