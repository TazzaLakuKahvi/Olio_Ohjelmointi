import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();
        int[] originalNumbers = new int[size];
        int[] semiProcessedNumbers = new int[size];
        int arrayPosition = 0;

        System.out.println("Enter the integers into the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Enter integer " + (i + 1) + ": ");
            originalNumbers[i] = input.nextInt();
        }

        for (int i = 0; i < originalNumbers.length; i++) {
            boolean isInArray = false;
            for (int j = 0; j < semiProcessedNumbers.length; j++) {
                if (originalNumbers[i] == semiProcessedNumbers[j]) {
                    isInArray = true;
                    size--;
                    break;
                }
            }
            if (!isInArray) {
                semiProcessedNumbers[arrayPosition] = originalNumbers[i];
                arrayPosition++;
            }
        }

        int[] processedNumbers = new int[size];
        for (int i = 0; i < size; i++) {
            processedNumbers[i] = semiProcessedNumbers[i];
        }

        for (int i = 0; i < processedNumbers.length; i++) {
            System.out.print(processedNumbers[i] + " ");
        }
    }
}
