import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();
        int[] originalNumbers = new int[size];
        int[] processedNumbers = new int[size];

        System.out.println("Enter the integers into the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Enter integer " + (i + 1) + ": ");
            originalNumbers[i] = input.nextInt();
        }
        for (int i = 0; i < originalNumbers.length; i++) {
            boolean isInArray = false;
            for (int j = 0; j < processedNumbers.length; j++) {
                if (originalNumbers[i] == processedNumbers[j]) {
                    isInArray = true;
                    break;
                }
            }
            if (!isInArray) {
                processedNumbers[i] = originalNumbers[i];
            }
        }
        for (int i = 0; i < processedNumbers.length; i++) {
            System.out.print(processedNumbers[i] + " ");
        }
    }
}
