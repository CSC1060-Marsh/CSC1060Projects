public class Tertiary {
    public static void main(String[] args) {
        String thingToYell = "Bees!";
        yellThing(thingToYell);
        thingToYell = getAThingToYell("oh boy", " 1", " ahhhhh", 4);
        yellThing(thingToYell);
    }

    public static String getAThingToYell(String preface, String epiface, String anotherFace, int aNumber){
        return preface + " oh nooooo" + epiface + anotherFace + aNumber;
    }

    public static void yellThing(String thing) {
        System.out.println(thing);

        }
    }
}
