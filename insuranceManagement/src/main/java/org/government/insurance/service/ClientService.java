package org.government.insurance.service;

import org.government.insurance.model.Client;
import org.government.insurance.repository.ClientRepository;
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
