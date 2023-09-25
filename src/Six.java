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
        String exampleThree = "asdflkj";
        if (exampleTwo.equals(exampleThree)) {
            System.out.println("They're different!");
        } else {
            System.out.println("They're the same!");
        }

        String logMessage = "name=NumberOfCatsOnTheLoose;value=5;day=Tuesday;";
        if (logMessage.indexOf("name=NumberOfCatsOnTheLoose") >= 0) {
            int startOfValue = logMessage.indexOf("value=");
            String containsValue = logMessage.substring(startOfValue); //value=5;day=Tuesday;
            int equalsSignIndex = containsValue.indexOf('='); //5
            int semicolonIndex = containsValue.indexOf(';'); //7
            String value = containsValue.substring(equalsSignIndex + 1, semicolonIndex); //5
            //between the fifth and seventh characters (= and ;), it gets the stuff between the two characters, which is the number 5.
            System.out.println(Integer.parseInt(value));
        }

    }

    public static String reverse(String s) {
        String r = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            r = r + s.charAt(i);
        }
        return r;
    }
}
