import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the 1st coefficient: ");
        double coeA = input.nextDouble();
        System.out.print("Enter the 2nd coefficient: ");
        double coeB = input.nextDouble();
        System.out.print("Enter the 3rd coefficient: ");
        double coeC = input.nextDouble();

        double discriminant = Math.pow(coeB, 2) - (4 * coeA * coeC);
        double sumRoot = (-coeB - Math.sqrt(discriminant)) / (2 * coeA);
        double differenceRoot = (-coeB + Math.sqrt(discriminant)) / (2 * coeA);

        if (discriminant > 0) {
            System.out.printf("\nThe roots of the quadratic formula are %1$.3f and %2$.3f", sumRoot, differenceRoot);
        }
        else if (discriminant == 0) {
            System.out.printf("\nThe root of the quadratic formula is %.2f", sumRoot);
        }
        else {
            System.out.println("\nThe quadratic formula has no real roots");
        }
    }
}
