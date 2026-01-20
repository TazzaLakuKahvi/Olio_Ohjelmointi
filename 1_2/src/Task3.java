import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Weight (g): ");
        int grams = (reader.nextInt());

        //weight in grams converted directly into each unit respectively
        double luoti = grams / 13.28;
        double naula = luoti / 32;
        double leiviska = naula / 20;

        //remainder of each previous larger unit converted into a smaller unit
        //this gives us the total weight in leiviska, naula and luoti
        naula = leiviska % 1 * 20;
        luoti = naula % 1 * 32;

        System.out.printf("%1$d grams is %2$d leiviskä, %3$d naula, and %4$.2f luoti.", grams, (int) leiviska, (int) naula, luoti);
    }
}
