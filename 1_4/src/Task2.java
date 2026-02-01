import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();
        int[] numbers = new int[size];
        int[] startAndEnd = new int[2];
        int sum = 0;
        int subArrayLength = 2;

        System.out.println("Enter the integers into the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Enter integer " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }

        while (subArrayLength < numbers.length) {
            for (int i = 0; i < numbers.length && i + subArrayLength <= numbers.length; i++) {
                int subArrayEnd = i + subArrayLength;
                int newSum = 0;
                int[] subArray = new int[subArrayEnd - i];

                for (int j = i; j < subArrayEnd; j++) {
                    subArray[j - i] = numbers[j];
                }
                for (int k : subArray) {
                    newSum += k;
                }
                if (newSum > sum) {
                    startAndEnd[0] = i;
                    startAndEnd[1] = subArrayEnd;
                    sum = newSum;
                }
            }

            subArrayLength++;
        }

        System.out.println("\nMaximum sum: " + sum);
        System.out.println("Integers: " + (startAndEnd[0] + 1) + "-" + startAndEnd[1]);
    }
}
