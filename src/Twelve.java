import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Array;
import java.util.*;

public class Twelve {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new FileInputStream("C:\\Users\\S02912474\\IdeaProjects\\CSC1060Projects\\src\\grades.csv"));
        sc.nextLine();
        List<Integer> grades = new ArrayList<>();
        while (sc.hasNext()) {
            String line = sc.nextLine();
            int firstComma = line.indexOf(",");
            String noClassName = line.substring(firstComma + 1);
            int secondComma = noClassName.indexOf(",");
            String noClassNumber = noClassName.substring(secondComma + 1);
            String gradeAsString = noClassNumber.substring(0, noClassNumber.indexOf(","));
            grades.add(Integer.parseInt(gradeAsString));
        }

        int sum = 0;
        for (int i : grades) {
            sum += i;
        }
        System.out.println("Average: " + sum / grades.size());
    }
}
