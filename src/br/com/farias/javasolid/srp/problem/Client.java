package br.com.farias.javasolid.srp.problem;

import java.io.FileWriter;
import java.io.IOException;

public class Client {

    private String email;
    private String document;

    public void save() {

        if (!email.contains("@"))
            throw new RuntimeException("Email field must contains '@'");

        if (document.length() != 11)
            throw new RuntimeException("Document field must have exactly 11 caracters");

        FileWriter file;

        try {
            file = new FileWriter("database.txt");
            file.write(this.toString());
            file.close();
        } catch (IOException e) {
            throw new RuntimeException("Can't save client", e);
        }
    }

    @Override
    public String toString() {
        return String.format("%s -|- %s ", email, document);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

}
