
package vu;
import java.util.Scanner;
public class singleDimensionalPractice {
    
    public static void main(String [] args){
        // creating tthe scanner object.
        Scanner save = new Scanner(System.in);
        
        // Initialize variables
        int[] numbers = new int[80]; 
        int count = 0;
        int sum = 0;
        
        // Prompt user to enter values until 'x' is entered
        System.out.println("Enter values (type 'x' to terminate):");
        while (true) {
            String input = save.nextLine();
            if (input.equalsIgnoreCase("x")) {
                break; // Terminate the loop if 'x' is entered
            }
            try {
                int number = Integer.parseInt(input);
                numbers[count] = number; // Store the entered value in the array
                sum += number; // Add the entered value to the sum
                count++; // Increment count for the next value
            } 
            catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number or 'x' to terminate.");
            }
        }
        
        // Display the entered values and the sum
        System.out.println("Entered values: " + "\n");
        for (int i = 0; i < count; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println("\nSum of The numbers is: " + sum);
        
        // Close the scanner
        save.close();
    
    }
    
}
