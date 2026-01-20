import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter the length of the first leg of a right triangle: ");
        double side1 = reader.nextDouble();
        System.out.print("Enter the length of the second leg of a right triangle: ");
        double side2 = reader.nextDouble();

        System.out.printf("\nThe hypotenuse of the right triangle is %.3f", Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2)));
    }
}
