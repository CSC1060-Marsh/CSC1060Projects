import java.util.Arrays;
import java.util.List;

public class Seven {
    public static void main(String[] args) {
        int[] numbers = {0, 1, 2};
        boolean[] bools = {true, false, true, false, false};
        String[] strings = {"Hams", "Potatoes", "Root Beer"};

        String[] example = new String[4];
        //Means that you walk 0 steps into the data array and print it.
        System.out.println(example[0]);
        double[] doubles = new double[99999];
        System.out.println(doubles[77777]);

        int[] numberthing = new int[4];
        numberthing[0] = 10;
        numberthing[1] += numberthing[0] * 2;
        numberthing[2] = 2;
        numberthing[2 + 1] -= 60;

        for (int i = 0; i < numberthing.length; i++) {
            System.out.println(numberthing[i]);
        }

        for (int i : numberthing) {
            //for every int i in numbers, do something
            System.out.println(i);
        }

        //array block of values with data stored in each position

        System.out.println(Arrays.toString(numberthing));

        int[] theSameNumberThing = new int[4];
        for (int i = 0; i < numberthing.length; i++) {
            theSameNumberThing[i] = numberthing[i];
        }

        int[] sameNumberThingTwo = Arrays.copyOf(numberthing, numberthing.length);
        //You can divide by something or subtract to get only a specific number of entries in the array

        System.out.println(Arrays.toString(theSameNumberThing));
        System.out.println(Arrays.toString(sameNumberThingTwo));

        String examplethingy = "I love beans";
        System.out.println(examplethingy.length());
        System.out.println(numberthing.length);

        System.out.println(examplethingy.indexOf("o"));

        int[] doubledNumbers = new int[4];
        for (int i = 0; i < numberthing.length; i++) {
            doubledNumbers[i] = numberthing[i] * 2;
        }

        String wordAsString = "balloon";
        char[] wordAsArray = {'b', 'a', 'l', 'l', 'o', 'o', 'n'};
        System.out.println(wordAsString.charAt(0));
        System.out.println(wordAsArray[0]);
        System.out.println(wordAsString.indexOf('n'));
        System.out.println(indexOfArray(wordAsArray, 'n'));

        System.out.println(wordAsString + "s!");
        char[] longerArray = Arrays.copyOf(wordAsArray, wordAsArray.length + 2);
        longerArray[longerArray.length - 2] = 's';
        longerArray[longerArray.length - 1] = '!';
        System.out.println(Arrays.toString(longerArray));

        List<Character> wordAsList = List.of('b', 'a', 'l', 'l', 'o', 'o', 'n');
        System.out.println(wordAsList.indexOf('b'));
        System.out.println(wordAsList);
    }
    public static int indexOfArray(char[] array, char character) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == character) {
                return i;
            }
        }
        return -1;
    }
}
