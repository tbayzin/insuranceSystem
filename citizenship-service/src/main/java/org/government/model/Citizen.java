package org.government.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@Table(name="Citizen")
public class Citizen {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @Column(name = "citizenshipId", nullable = false)
    private int citizenshipId;

    @Column(name = "Name", nullable = false)
    private String name;

    @Column(name = "Surname", nullable = false)
    private String surname;

    @Column(name = "Gender")
    private String gender;

    @Column(name = "birthCity" )
    private String birthCity;

    @Column(name = "provinceOfRegistration")
    private String provinceOfRegistration;

    @Column(name = "birthDate", nullable = false)
    private LocalDate birthDate;

    @Column(name = "deathDate")
    private LocalDate deathDate;

}
