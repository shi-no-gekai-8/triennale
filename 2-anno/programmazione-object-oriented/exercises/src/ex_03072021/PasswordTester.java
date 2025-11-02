package ex_03072021;

import java.util.Scanner;

public class PasswordTester {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		boolean done = false;
		while(!done) {
			System.out.println("Inserisci nuova password: ");
			String passwordLetta = in.nextLine();
			Password password = new Password(passwordLetta);
			if(password.checkPass(passwordLetta)) {
				System.out.println("Password valida.");
				done = true;
			} else {
				System.out.println("Password invalida.");
			}
		}
		
	}

}
