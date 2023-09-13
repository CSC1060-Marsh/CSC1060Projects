public class Four {
    public static void main(String[] args) {
        String thingToYell = "Bees!";
        boolean something = 5 < 6; // boolean something = 6 < 6 is saying that it's false
        boolean somethingelse = true;
        String word = "Change This";
        int five = 5;
        boolean notEquals = five == 6;
        // x % 2 == 0 means that x/2 has a remainder of 0

        if (somethingelse) {
            System.out.println("Impossible!");
        }
        // If somethingelse is true, then do this. Otherwise do the other thing.
        else {
            System.out.println("Possible!");
        }

        if (five == 1) {
            word = "one";
        } else if (five == 2) {
            word = "two";
        } else if (five == 3) {
            word = "three";
        } else {
            word = "five";
        }
        System.out.println(word);
        switch (five) {
            case 1:
                word = "Now it's one";
                break;
            case 2:
                word = "Now it's two";
                break;
            case 3:
                word = "Now it's three";
                break;
            default:
                word = "I said it was five";
                break;
        }
        System.out.println(word);

        //&& means and, || means or, ! means not.
        if (five <= 10 && five > 7) {
            System.out.println("It's 7<10!");
        } else {
            System.out.println("It's not 7<10!");
        }

        if (!(5 < 10) || !true) {
            System.out.println("It's true!");
        } else {
            System.out.println("It's false!");
        }

        if (somethingelse) {
            System.out.println("It's true!");
        } else {
            System.out.println("It's false!");
        }

        int six = 6;
        int seven = 7;
        if (six == seven) {
            System.out.println("Impossible!");
        }
        else {
            System.out.println("Possible!");
        }
    }
}
