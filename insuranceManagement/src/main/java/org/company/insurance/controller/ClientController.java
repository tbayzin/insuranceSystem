package org.company.insurance.controller;


import org.company.insurance.model.Client;
import org.company.insurance.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/")
public class ClientController {

    @Autowired
    ClientService clientService;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/client")
    public Client save(@RequestBody Client client) {
        clientService.saveClient(client);
        return client;
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
