import java.util.Random;
import java.util.Scanner;

public class PasswordGenerator {

    public static void main(String[] args) {

        // scanner object for reading input from console
        Scanner scanner = new Scanner(System.in);

        // random object for random number generation
        Random random = new Random();

        // strings containing possible characters to include in password
        String uppercaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowercaseLetters = uppercaseLetters.toLowerCase();
        String numbers = "0123456789";
        String specialCharacters = "!@#$%^&*()_+{}:<>?/.`~";

        // hold all possible characters based on user choice
        StringBuilder passwordCharacters = new StringBuilder();

        System.out.print("Enter the desired password length: ");
        int length = scanner.nextInt();
        scanner.nextLine();

        // ask the user whether to include uppercase letters
        System.out.print("Include uppercase letters? (yes/no)");
        String includeUpperCase = scanner.nextLine();



    }

}
