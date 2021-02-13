import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        String password = "password";
        int passwordLength = password.length();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter password:");
        String enteredPassword = scanner.nextLine();

        int enteredPasswordLength = enteredPassword.length();

        if (enteredPasswordLength > passwordLength) {
            System.out.println("The password is incorrect, the password length is too long");
        } else if (enteredPasswordLength < passwordLength) {
            System.out.println("The password is incorrect, the password length is too short");
        } else if (enteredPassword.equals(password)) {
            System.out.println("The password is correct");
        } else {
            System.out.println("Invalid password");
        }
    }
}
