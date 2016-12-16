package br.com.farias.javasolid.srp.solution;

import br.com.farias.javasolid.srp.solution.models.Client;
import br.com.farias.javasolid.srp.solution.services.ClientService;

public class SRPSolutionApplication {

    public static void main(String[] args) {
        Client client = new Client() {{
            setDocument("11111111111");
            setEmail("test@test.com");
        }};

        ClientService service = new ClientService();

        if (service.save(client))
            System.out.println("Client saved successfully");
        else
            System.out.println("Errors on save client");
    }

}
