package com.oopsAssignment2.credentials.service;

import java.util.Random;

import com.oopsAssignment2.credentials.model.EmployeeCredentials;

public class CredentialService {
public String generateEmailAddress (String firstName, String lastName, String department){
	return firstName+lastName+"@"+department+"universe.com";
}
public char[] generatePassword() {
	String cap = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	String small = "acdefghijklmnopqrstuvwxyz";
	String num = "0123456789";
	String spec = "!@#$%^&*";
			String values = cap+small+num+spec;
	Random random = new Random();
	char[] password = new char[9];
	for (int i=0; i<9; i++) {
		password[i] = values.charAt(random.nextInt(values.length()));
	}
	
	return password;
}
public void showCredentials(Employee employee, String generatedEmail, char[] generatedPassword) {
	System.out.println("your generated credentials are");
	System.out.println(generatedEmail);
	System.out.println(generatedPassword);

}
}
