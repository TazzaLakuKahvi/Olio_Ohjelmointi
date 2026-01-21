import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a positive integer to be the start value: ");
        int start = input.nextInt();
        System.out.print("Please enter a second larger integer to be the end value: ");
        int end = input.nextInt();
        System.out.println("\nHere are the prime numbers between " + start + " and " + end + ":");

        for (int i = start; i <= end; i++) {
            boolean check = true;

            if (i == 1 || i == 2) {
                System.out.println(i);
            } else {
                for (int j = 2; j <= i; j++) {
                    if (i != j && i % j == 0) {
                        check = false;
                        break;
                    }
                }
                if (check) {
                    System.out.println(i);
                }
            }
        }
    }
}
