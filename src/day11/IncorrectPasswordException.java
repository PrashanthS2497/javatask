package day11;

public class IncorrectPasswordException extends Exception {
    public IncorrectPasswordException(String message) {
        super(message);
    }
}

public class LoginSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String correctPassword = "password123";
        
        System.out.print("Enter your password: ");
        String inputPassword = scanner.nextLine();
        
        try {
            if (!inputPassword.equals(correctPassword)) {
                throw new IncorrectPasswordException("Incorrect password. Please try again.");
            } else {
                System.out.println("Login successful!");
            }
        } catch (IncorrectPasswordException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
