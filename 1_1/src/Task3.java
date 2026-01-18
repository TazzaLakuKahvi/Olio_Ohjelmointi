import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        int first = Integer.parseInt(scanner.nextLine());

        System.out.println("Give the second number:");
        int second = Integer.parseInt(scanner.nextLine());

        System.out.println("Give the third number:");
        int third = Integer.parseInt(scanner.nextLine());

        System.out.println("The sum of the numbers is " + (first + second + third));

        //prints out the product. not much to see here
        System.out.println("The product of the numbers is " + (first * second * third));

        /*
        if the result isn't a whole number, the average is printed out with 3 decimal accuracy
        otherwise, it doesn't add any decimals to the printed result
        other than that, I haven't found any modifications that need to be added.
         */
        if ((((float) first + second + third) / 3) % 1 != 0) {
            System.out.printf("The average of the numbers is %.3f", (((float) first + second + third) / 3));
        } else {
            System.out.printf("The average of the numbers is %.0f", (((float) first + second + third) / 3));
        }
    }
}