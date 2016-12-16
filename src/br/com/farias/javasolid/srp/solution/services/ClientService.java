package br.com.farias.javasolid.srp.solution.services;

import br.com.farias.javasolid.srp.solution.models.Client;
import br.com.farias.javasolid.srp.solution.repositories.ClientRepository;

public class ClientService {

    private ClientRepository repos;

    public ClientService() {
        repos = new ClientRepository();
    }

    public boolean save(Client client) {
        try {

            client.validate();
            repos.save(client);
            return true;

        } catch (RuntimeException e) {
            e.printStackTrace();
            return false;
        }
    }

}
