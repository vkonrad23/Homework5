import java.util.Scanner;
public class Main4 {



    public static void main(String[] args) {

        // Create a scanner object to read user input.
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string.
        System.out.println("Enter a string: ");
        String input = getUserString(scanner);

        // Check if the string is empty.
        if (input.isEmpty()) {
            // Print an error message and exit the program.
            System.err.println("The string cannot be empty.");
            System.exit(1);
        }

        // Print the string to the console.
        print(input);

        // Prompt the user if they want to continue.
        System.out.println("Do you want to continue? (Y/N)");
        String answer = getUserString(scanner);

        // If the user says yes, repeat the process from step 1.
        if (answer.equalsIgnoreCase("Y")) {
            main(args);
        }
    }


    private static String getUserString(Scanner scanner) {
        return scanner.nextLine();
    }

    private static void print(String output) {
        System.out.println(output);
    }


}
