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
        // add uppercase letters to our passwordCharacters
        if(includeUpperCase.equalsIgnoreCase("yes")){
            passwordCharacters.append(uppercaseLetters);
        }

        // ask the user whether to include lowercase letters
        System.out.print("Include uppercase letters? (yes/no)");
        String includelowerCase = scanner.nextLine();
        // add lowercase letters to our passwordCharacters
        if(includelowerCase.equalsIgnoreCase("yes")){
            passwordCharacters.append(lowercaseLetters);
        }


        // ask the user whether to include numbers
        System.out.print("Include numbers? (yes/no)");
        String includeNumbers = scanner.nextLine();
        // add lowercase letters to our passwordCharacters
        if(includeNumbers.equalsIgnoreCase("yes")){
            passwordCharacters.append(numbers);
        }


        // ask the user whether to include special letters
        System.out.print("Include special characters? (yes/no)");
        String includeSpecial = scanner.nextLine();
        // add lowercase letters to our passwordCharacters
        if(includeSpecial.equalsIgnoreCase("yes")){
            passwordCharacters.append(specialCharacters);
        }

        // will be the final password
        StringBuilder password = new StringBuilder();

        // generate the password by randomly slecting characters from the possible characters variable  (passwordCharacters)
        for(int x=0; x<length; x++){

            // generate a random index to select a character from (passwordCharacters)
            int index = random.nextInt(passwordCharacters.length());

            password.append(passwordCharacters.charAt(index));

        }

        System.out.println("Generated Password : "+password.toString());
        scanner.close();
    }

}
