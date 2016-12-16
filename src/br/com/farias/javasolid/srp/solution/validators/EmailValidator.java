package br.com.farias.javasolid.srp.solution.validators;

public class EmailValidator {

    public static void validate(String email) {
        if (!email.contains("@"))
            throw new RuntimeException("Email field must contains '@'");
    }

}
