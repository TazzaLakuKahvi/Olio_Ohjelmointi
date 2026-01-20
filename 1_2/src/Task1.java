import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter a temperature in Fahrenheit: ");
        double fahrenheit = reader.nextInt();
        double celsius = (fahrenheit - 32) / 1.8;

        System.out.printf("The temperature in Celsius is %.1f", celsius);
    }
}
