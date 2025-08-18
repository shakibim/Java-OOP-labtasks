
package lab7;

import java.io.*;

public class main5 {
    public static void main(String[] args) {
        try {
            FileReader file = new FileReader("data.txt"); // Checked exception
            BufferedReader br = new BufferedReader(file);

            String line;
            System.out.println("File contents:");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found! Please check the filename.");
        } catch (IOException e) {
            System.out.println("An I/O error occurred: " + e.getMessage());
        }

        System.out.println("Program continues after handling checked exception.");
    }
}
