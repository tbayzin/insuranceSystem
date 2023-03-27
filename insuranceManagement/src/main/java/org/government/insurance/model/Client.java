package org.government.insurance.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@Table(name="Client")
public class Client {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;


    @Column(name = "trId", nullable = false)
    private Long trId;


}
