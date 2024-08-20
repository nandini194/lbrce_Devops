package lbrce_Devops;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class signup {

    // In-memory storage for registered users
    private static final Map<String, String> users = new HashMap<>();

    // Constants for password validation
    private static final int MIN_PASSWORD_LENGTH = 8;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt for username
        System.out.print("Enter a username: ");
        String username = scanner.nextLine();

        // Check if the username is already taken
        if (users.containsKey(username)) {
            System.out.println("Username is already taken. Please choose a different username.");
        } else {
            // Prompt for password
            String password;
            while (true) {
                System.out.print("Enter a password: ");
                password = scanner.nextLine();
                
                // Validate password length
                if (password.length() < MIN_PASSWORD_LENGTH) {
                    System.out.println("Password must be at least " + MIN_PASSWORD_LENGTH + " characters long. Try again.");
                    continue;
                }

                // Confirm password
                System.out.print("Confirm your password: ");
                String confirmPassword = scanner.nextLine();

                // Check if passwords match
                if (!password.equals(confirmPassword)) {
                    System.out.println("Passwords do not match. Try again.");
                    continue;
                }

                // Store the new user
                users.put(username, password);
                System.out.println("Signup successful! You can now log in.");
                break;
            }
        }

        // Close the scanner
        scanner.close();
    }
}
