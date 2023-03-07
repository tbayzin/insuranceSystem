package org.company.insurance.service;

import org.company.insurance.model.Client;
import org.company.insurance.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service



public class ClientService {

    @Autowired
    ClientRepository clientRepository;

    public Client saveClient(Client client) {
        return clientRepository.save(client);
    }


}
