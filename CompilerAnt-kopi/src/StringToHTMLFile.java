import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class StringToHTMLFile {
    // Step 1: Create a string containing the HTML content
    public void handler(String doller, String fileName) {

        // Step 2: Specify the file path

        String filePath = fileName +".html"; // Provide the desired file path

        // Step 3: Write the HTML content to the file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(doller);
            System.out.println("HTML content has been saved to " + filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}