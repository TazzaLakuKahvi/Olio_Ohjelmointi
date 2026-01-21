import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] firstNames = {"Harri", "Matti", "Olavi", "Jaana", "Solomon", "Maria", "Jade", "Irma"};
        String[] lastNames = {"Korhonen", "Virtanen", "Nieminen", "Lahti", "Lindberg", "Mäkinen", "Jokinen", "Meikäläinen"};

        System.out.print("How many names do you want to generate: ");
        int nameAmount = input.nextInt();

        for (int i = 1; i <= nameAmount; i++) {
            System.out.println(firstNames[(int) (Math.random() * 8)] + " " + lastNames[(int) (Math.random() * 8)]);
        }
    }
}
