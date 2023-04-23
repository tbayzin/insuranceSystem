package org.government.healthservice.model;


import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document("Citizen")
public class Citizen {

    @Id
    private String id;

    //bu foreign olarak alınacak
    @Field("citizenshipId")
    private int citizenshipId;



}
