public class Six {
    public static void main(String[] args) {
        int five = 5;
        //                0123 for element labels.
        String example = "word";
        char letter = 'a';
        if (example.length() == 4) {
            System.out.println("World peace!");
        } else {
            System.out.println("Eternal war!");
        }

        String addition = "Hello, human, I am";
        addition = addition + " S02912474.";
        System.out.println(addition);

        System.out.println(reverse("word"));

        int indexOfR = "word".indexOf('r');
        int indexOfEnd = "word".indexOf("rd");
        System.out.println(indexOfR);
        System.out.println(indexOfEnd);

        String log = "2023-09-25: system is on fire";
        int indexOfIncident = log.indexOf("system is on fire");
        String firstIncidentMessage = log.substring(indexOfIncident);
        System.out.println(firstIncidentMessage);

        String exampleTwo = "word";
        //substrings start inclusive and end exclusive
        

    }

    public static String reverse(String s) {
        String r = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            r = r + s.charAt(i);
        }
        return r;
    }
}
