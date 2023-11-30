import java.io.*;
import java.util.Scanner;

public class Eleven {
    public static void main(String[] args) throws Exception {
        String input = "";
        if (input.isEmpty()) {
            throw new RuntimeException("Input is empty. Ending early.");
        }
        System.out.println(input);

        File file = new File("output.txt");
        System.out.println(file.getCanonicalPath());

        try {
            file.createNewFile();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }


        try (FileWriter fileWriter = new FileWriter(file, true)) {
            //Appending adds to the text instead of clearing and rewriting it
          //Option one is this and next line but its hard so don't do this:  FileOutputStream outputStream = new FileOutputStream(file);
           // outputStream.write("Hey I'm a string".getBytes());
            fileWriter.write("I love cheese\n");
            fileWriter.write("\n");
            fileWriter.write("4.50");
        } catch (IOException e) {
            System.out.println("File not found when it darn well should be.");
        }

        try ( FileInputStream inputStream = new FileInputStream(file)) {
            Scanner sc = new Scanner(inputStream);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } catch (IOException e) {
            System.out.println("Scanner had an error. :(");
        }
    }
}
