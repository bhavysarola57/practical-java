import java.io.*;

public class FileOperations {
    public static void main(String[] args) {
       
        String filename = "example.txt";

        
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            writer.write("Hello, this is a simple text file.");
            writer.newLine(); 
            writer.write("This is the second line.");
            System.out.println("Data written to file successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred during writing to the file.");
            e.printStackTrace();
        }

        
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            System.out.println("Reading from file:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("An error occurred during reading from the file.");
            e.printStackTrace();
        }
    }
}
