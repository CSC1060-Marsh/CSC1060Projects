import java.util.Scanner;

public class Eight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("First string:");
        String one = sc.nextLine();
        System.out.println("Second string:");
        String two = sc.nextLine();
        System.out.println(endOthers(one, two));
        System.out.println("Testing string:");
        String testingString = sc.nextLine();
        System.out.println(findRepeats(testingString));
    }
    public static boolean endOthers(String a, String b) {
        String aLowercase = a.toLowerCase();
        String bLowercase = b.toLowerCase();

        int indexOfBInA = aLowercase.indexOf(bLowercase);
        if (indexOfBInA >= 0) {
            if (indexOfBInA + b.length() == a.length()) {
                return true;
            }
        }

        int indexOfAInB = bLowercase.indexOf(aLowercase);
        if (indexOfAInB + a.length() == b.length()) {
            return true;
        } else {
            return false;
        }
    }

    //The following does not work - check D2L for the correct version.
    public static boolean findRepeats(String toTest) {
        int factorial = 1;
        for (int i = 1; i < toTest.length(); i++) {
            factorial = factorial * i;
        }
        String[] substrings = new String[factorial];
        int currentIndex = 0;
        for (int start = 0; start < toTest.length(); start++) {
            for (int end = 1; end < toTest.length(); end++) {
                String substring = "";
                for (int i = start + 1; i < end; i++) {
                     substring = toTest.substring(i, i + 1);
                }
                substrings[currentIndex] = toTest.substring(start, end);
            }
        }

        for (int i = 0; i < substrings.length; i++) {
            if (substrings[i] != null) {
                int indexOfSubstring = toTest.indexOf(substrings[i]);
                if (indexOfSubstring >= 0) {
                    int newStartingIndex = indexOfSubstring + substrings[i].length();
                    String substring = toTest.substring(newStartingIndex);
                    if (toTest.indexOf(substrings[i]) >= 0) {
                        return true;
                    }
                }
            }
        }

        return false;
    }
}
