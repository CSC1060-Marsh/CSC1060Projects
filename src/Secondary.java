import java.util.Scanner;

public class Secondary {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Say something");
        String test = sc.nextLine();
        System.out.println(test);
        double cmPerInch = 2.54;
        //double is int with decimals
        int number = 5;
        System.out.println(cmPerInch);
        System.out.println(number);
        number = 6;
        System.out.println(number);
        number = 89;
        System.out.println(number);
        final int second = 253;
        System.out.println(second);

        System.out.println(4.0/3.0);
        System.out.printf("%.3f\n", 4.0/3.0);

        double inches = 4.0/3.0;
        System.out.println(inches + " inches");

        System.out.println("What's your name?");
        String name = sc.nextLine();
        System.out.println("Your name is " + name);

        System.out.printf("%d inches\n", 6);

        System.out.printf("%d inches\n", (int) (double) (int) 56.54);


    }
}
