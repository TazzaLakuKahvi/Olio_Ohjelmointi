import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a binary number: ");
        String binary = input.nextLine();
        int decimal = 0;
        int addition = 1;

        for (int i = 0; i <= binary.length() - 1; i++) {

            if (binary.charAt(binary.length() - 1 - i) == '1') {
                decimal = decimal + addition;
            }
            addition *= 2;
        }

        System.out.println(decimal);
    }
}
