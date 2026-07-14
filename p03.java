import java.util.Scanner;

public class p03 {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Enter Your Personal Details ===");

        // 1. Reading a String (Text)
        System.out.print("Enter your full name: ");
        String name = scanner.nextLine();

        // 2. Reading an int (Integer)
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // 3. Reading a double (Floating-point number)
        System.out.print("Enter your height (in meters, e.g., 1.75): ");
        double height = scanner.nextDouble();

        // 4. Reading a char (Single character)
        System.out.print("Enter your gender (M/F/O): ");
        char gender = scanner.next().charAt(0);

        // 5. Reading a boolean (True/False)
        System.out.print("Are you a student? (true/false): ");
        boolean isStudent = scanner.nextBoolean();

        System.out.println("\n-----------------------------------");
        System.out.println("====== Summary of Your Profile ======");
        System.out.println("-----------------------------------");
        
        // Displaying the captured data
        System.out.println("Name:    " + name);
        System.out.println("Age:     " + age + " years old");
        System.out.println("Height:  " + height + " m");
        System.out.println("Gender:  " + gender);
        System.out.println("Student: " + (isStudent ? "Yes" : "No"));

        // Close the scanner to prevent memory leaks
        scanner.close();
    }
}