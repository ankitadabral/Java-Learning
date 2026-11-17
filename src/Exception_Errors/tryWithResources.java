package Exception_Errors;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class tryWithResources {

    public static void main(String[] args) {

        // try-with-resources: resource is declared and initialized inside try(),
        // and Java automatically closes it after the try block finishes.
        try (BufferedReader reader = new BufferedReader(new FileReader("example.txt"))) {

            String line; // Stores each line read from the file.

            // readLine() reads one line at a time;
            // loop continues until there are no more lines (null).
            while ((line = reader.readLine()) != null) {

                System.out.println(line); // Prints each line of the file.
            }

        } catch (IOException e) {

            // Handles IOException that may occur while opening or reading the file.
            System.out.println("IO Exception caught " + e.getMessage());
        }
    }
}