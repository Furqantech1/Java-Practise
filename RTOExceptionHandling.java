import java.util.Scanner;

// Custom exception for invalid age
class AgeException extends Exception {
    AgeException(String msg) {
        super(msg); // Corrected from "Super" to "super"
    }
}

// Custom exception for invalid learner's license
class Valid_LL_Exception extends Exception {
    Valid_LL_Exception(String msg) {
        super(msg); // Corrected from "Super" to "super"
    }
}

// Custom exception for accident records
class AccidentRecordException extends Exception {
    AccidentRecordException(String msg) {
        super(msg); // Corrected from "Super" to "super"
    }
}

public class RTOExceptionHandling {
    // Corrected method parameters and throws declaration
    static void processApplication(int age, boolean validLL, int accidentCount) 
            throws AgeException, Valid_LL_Exception, AccidentRecordException {
        if (age < 18) {
            throw new AgeException("Invalid Age: age must be 18 years or above."); // Corrected logic and message
        }
        if (!validLL) {
            throw new Valid_LL_Exception("Invalid condition: Must have a valid learner's license."); // Fixed logic
        }
        if (accidentCount > 0) {
            throw new AccidentRecordException("Invalid condition: Should not have any accident records."); // Corrected variable name
        }
    }

    public static void main(String[] args) { // Correctly moved main method outside processApplication
        Scanner sc = new Scanner(System.in);

        try {
            String name; // Corrected "string" to "String"
            int age;
            boolean validLL; // Renamed to avoid confusion with class name
            int noOfAccidents; // Improved naming for clarity

            // Get user input
            System.out.println("Enter the user name:");
            name = sc.nextLine();

            System.out.println("Enter the user age:");
            age = sc.nextInt();

            System.out.println("Does the user have a valid learner's license? (true/false):");
            validLL = sc.nextBoolean();

            System.out.println("Enter the number of accidents:");
            noOfAccidents = sc.nextInt();

            // Process the application
            processApplication(age, validLL, noOfAccidents); // Fixed method call
            System.out.println("User is eligible for a license.");
        } catch (AgeException | Valid_LL_Exception | AccidentRecordException ae) {
            System.out.println("User not eligible:");
            System.out.println(ae.getMessage()); // Display the exception message
        } catch (Exception e) {
            System.out.println("An unexpected error occurred:");
            System.out.println(e.getMessage());
        } finally {
            sc.close(); // Close the scanner to prevent resource leaks
        }
    }
}
