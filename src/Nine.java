import java.util.ArrayList;
import java.util.List;

public class Nine {
    public static void main(String[] args) {
        List<Integer> numbers =  new ArrayList<>();
        numbers.add(1);
        numbers.add(6);
        numbers.add(5);

        System.out.println(sum(numbers, 0));
    }

    public Ten getBiggestZebraByLoop(List<Ten> zebras) {
        Ten biggestZebra = null;
        for (Ten zebra : zebras) {
            if (biggestZebra == null || biggestZebra.getNumberOfStripes() < zebra.getNumberOfStripes()) {
                biggestZebra = zebra;
            }
        }
        return biggestZebra;
    }

    public static Ten getBiggestZebraByRecursion(List<Ten> zebras) {
        if (zebras.size() == 1) {
            return zebras.get(0);
        }
        Ten zebra = zebras.get(0);
        Ten currentBiggestZebra = getBiggestZebraByRecursion(zebras.subList(1, zebras.size()));
        if (zebra.getNumberOfStripes() > currentBiggestZebra.getNumberOfStripes()) {
            return zebra;
        }

        return currentBiggestZebra;
    }
    public static Ten getBiggestZebraBySorting(List<Ten> zebras) {
        zebras.sort(Nine::compareZebraByStripeCount);
        return zebras.get(zebras.size() - 1);
    }

    public static int compareZebraByStripeCount(Ten z1, Ten z2) {
        return Integer.compare(z1.getNumberOfStripes(), z2.getNumberOfStripes());
    }

    public static int sum(List<Integer> numbers, int startingIndex) {
        if (numbers.isEmpty()) {
            return 0;
        }

        int number = numbers.get(startingIndex);
        if (startingIndex == numbers.size() - 1) {
            return number;
        }

        return number + sum(numbers, startingIndex + 1);
    }
}
