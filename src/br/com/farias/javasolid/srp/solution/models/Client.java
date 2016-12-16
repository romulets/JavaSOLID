package br.com.farias.javasolid.srp.solution.models;

import br.com.farias.javasolid.srp.solution.validators.DocumentValidator;
import br.com.farias.javasolid.srp.solution.validators.EmailValidator;

public class Client {

    private String email;
    private String document;

    public void validate() {
        EmailValidator.validate(email);
        DocumentValidator.validate(document);
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
