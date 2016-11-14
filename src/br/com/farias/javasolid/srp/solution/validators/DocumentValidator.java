package br.com.farias.javasolid.srp.solution.validators;

public class DocumentValidator {

	public static void validate(String document) {
		if (document.length() != 11)
			throw new RuntimeException("Document field must have exactly 11 caracters");
	}
	
}
