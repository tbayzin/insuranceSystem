package org.government.healthservice.controller;


import org.government.healthservice.service.CitizenService;
import org.government.healthservice.model.Citizen;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/")
public class CitizenController {

    @Autowired
    CitizenService citizenService;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/client")
    public Citizen save(@RequestBody Citizen citizen) {
        citizenService.saveCitizen(citizen);
        return citizen;
    }

    /*
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/client")
    public Client getClient(@RequestBody Client client) {
        clientService.saveClient(client);
        return client;
    }
    */

}
