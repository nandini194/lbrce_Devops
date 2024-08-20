package lbrce_Devops;
import java.util.Scanner;
public class login {
	// Hardcoded credentials
    private static final String USERNAME = "admin";
    private static final String PASSWORD = "password123";
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Prompt for username
	        System.out.print("Enter username: ");
	        String enteredUsername = scanner.nextLine();

	        // Prompt for password
	        System.out.print("Enter password: ");
	        String enteredPassword = scanner.nextLine();

	        // Validate credentials
	        if (USERNAME.equals(enteredUsername) && PASSWORD.equals(enteredPassword)) {
	            System.out.println("Login successful!");
	        } else {
	            System.out.println("Invalid username or password.");
	        }

	        // Close the scanner
	        scanner.close();

	}

}