package org.government.insurance.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@Table(name="Client")
public class Client {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;


    @Column(name = "citizenshiId", nullable = false)
    private Long citizenshipId;


    @Column(name = "registrationDate")
    private LocalDate registrationDate;

}
