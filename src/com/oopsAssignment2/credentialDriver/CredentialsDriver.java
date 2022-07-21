package com.oopsAssignment2.credentialDriver;

import java.util.Scanner;

import com.oopsAssignment2.credentialModel.EmployeeCredentials;
import com.oopsAssignment2.credentialService.CredentialService;

public class CredentialsDriver {

	public static void main(String[] args) {
		EmployeeCredentials employee = new EmployeeCredentials("Barath", "GV");
		CredentialService cs = new CredentialService();
		String generatedEmail;
		char[]generatedPassword;
		System.out.println("please enter the department from the following");
		System.out.println("1 Technial");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. legal");
		
		Scanner sc =new Scanner(System.in);
		int option = sc.nextInt();
		switch (option){
		case (1):
		generatedEmail=cs.generateEmailAddress(employee.getFirstName().toLowerCase(),employee.getLastName().toLowerCase(),"Tech");
			
		generatedPassword=cs.generatePassword();
		
			cs.showCredentials(employee,generatedEmail,generatedPassword);
			break;
			case (2):
				generatedEmail=cs.generateEmailAddress(employee.getFirstName().toLowerCase(),employee.getLastName().toLowerCase(),"ADM");
			
			generatedPassword=cs.generatePassword();
			
			cs.showCredentials(employee,generatedEmail,generatedPassword);
			
			
			break;
			case (3):
				generatedEmail=cs.generateEmailAddress(employee.getFirstName().toLowerCase(),employee.getLastName().toLowerCase(),"HR");
			
			generatedPassword=cs.generatePassword();
			
			cs.showCredentials(employee,generatedEmail,generatedPassword);
	
	
			break;
			case (4):
		
				generatedEmail=cs.generateEmailAddress(employee.getFirstName().toLowerCase(),employee.getLastName().toLowerCase(),"legal");
			
			generatedPassword=cs.generatePassword();
					cs.showCredentials(employee,generatedEmail,generatedPassword);
		
			break;
			default:
					System.out.println("please enter correct inputs");
			break;
		}
	}

}
