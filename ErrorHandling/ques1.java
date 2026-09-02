import java.util.*;
class PasswordException extends Exception {
    char type;

    PasswordException(char type) {
        this.type = type;
    }
}

public class ques1 {

    public static void validatePassword(String password) throws PasswordException {

        // Check password length
        if (password.length() < 8) {
            throw new PasswordException('d');
        }

        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasDigit = false;

        // Check each character
        for (int i = 0; i < password.length(); i++) {

            char ch = password.charAt(i);

            if (Character.isUpperCase(ch)) {
                hasUpper = true;
            }

            if (Character.isLowerCase(ch)) {
                hasLower = true;
            }

            if (Character.isDigit(ch)) {
                hasDigit = true;
            }
        }

        // Check if any requirement is missing
        if (!hasUpper || !hasLower || !hasDigit) {
            throw new PasswordException('s');
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < T; i++) {

            String password = sc.nextLine();

            try {
                validatePassword(password);
                System.out.println("Valid password.");

            } catch (PasswordException e) {

                if (e.type == 'd') {
                    System.out.println(
                        "Invalid password: Password length is less than 8 characters."
                    );
                } else if (e.type == 's') {
                    System.out.println(
                        "Invalid password: Password must contain at least one uppercase letter, one lowercase letter, one digit."
                    );
                }
            }
        }

        sc.close();
    }
}