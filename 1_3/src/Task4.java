import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean cleared = false;

        while (!cleared) {
            int points = 0;
            System.out.println("Here are some multiplication exercises.\nYou must answer all 10 questions correctly.");

            for (int i = 1; i <= 10; i++) {
                int number1 = (int) (Math.random() * 10) + 1;
                int number2 = (int) (Math.random() * 10) + 1;

                System.out.print("What is the multiplication of " + number1 + " and " + number2 + ": ");
                int multiplication = input.nextInt();
                if (multiplication == (number1 * number2)) {
                    System.out.println("Correct! +1 point");
                    points++;
                } else {
                    System.out.println("Wrong!");
                }
            }
            System.out.println("You scored " + points + " points out of 10.");
            if (points == 10) {
                cleared = true;
            } else {
                System.out.println("You need to get a perfect score to pass! Start over!");
            }
        }
        System.out.println("Congratulations! You answered all 10 questions correctly!\nYou're a multiplication table master!");
    }
}
