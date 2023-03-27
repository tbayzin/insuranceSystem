package org.government.insurance.controller;


import org.government.insurance.model.Client;
import org.government.insurance.service.ClientService;
import org.government.insurance.validation.ClientInfoChecker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/")
public class ClientController {

    @Autowired
    ClientService clientService;


    ClientInfoChecker clientInfoChecker = new ClientInfoChecker();

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/client")
    public Client save(@RequestBody Client client) {
        if (clientInfoChecker.trIdChecker(client.getTrId())) {
            clientService.saveClient(client);
        } else {
            System.out.println("Given ID doesnt fit the ID format");
        }
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
