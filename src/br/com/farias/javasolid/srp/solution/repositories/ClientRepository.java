package br.com.farias.javasolid.srp.solution.repositories;

import java.io.FileWriter;
import java.io.IOException;

import br.com.farias.javasolid.srp.solution.models.Client;

public class ClientRepository {

	public void save(Client client) {
		FileWriter file;

		try {
			file = new FileWriter("database.txt");
			file.write(client.toString());
			file.close();
		} catch (IOException e) {
			throw new RuntimeException("Can't save client", e);
		}
	}
	
}
