import java.util.Arrays;

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
    }
}
