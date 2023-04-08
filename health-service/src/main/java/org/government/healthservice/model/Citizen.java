package org.government.healthservice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@Table(name="Citizen")
public class Citizen {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    //bu foreign olarak alınacak
    @Column(name = "citizenshipId", nullable = false)
    private int citizenshipId;






}
