import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Twelve {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new FileInputStream("grades.csv"));
        sc.nextLine();
    }
}
