import java.util.Scanner;

public class ArrayOperations {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] array = new int[15];

        // Take input from user and store in array
        for (int i = 0; i < 15; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = input.nextInt();
        }

        // Print the values stored in the array
        System.out.println("Values stored in array:");
        for (int i = 0; i < 15; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        // Ask user to enter a number and check if it's present in the array
        System.out.print("Enter a number to search for: ");
        int number = input.nextInt();
        boolean found = false;
        int index = -1;
        for (int i = 0; i < 15; i++) {
            if (array[i] == number) {
                found = true;
                index = i;
                break;
            }
        }
        if (found) {
            System.out.println("The number " + number + " was found at index " + index + " in the array.");
        } else {
            System.out.println("The number " + number + " was not found in the array.");
        }

        // Create another array with the elements in reverse order
        int[] reverseArray = new int[15];
        for (int i = 0; i < 15; i++) {
            reverseArray[14 - i] = array[i];
        }

        // Print the values stored in the reverse array
        System.out.println("Values stored in reverse array:");
        for (int i = 0; i < 15; i++) {
            System.out.print(reverseArray[i] + " ");
        }
        System.out.println();

        // Calculate the sum and product of the elements in the array
        int sum = 0;
        int product = 1;
        for (int i = 0; i < 15; i++) {
            sum += array[i];
            product *= array[i];
        }

        // Print the sum and product of the elements in the array
        System.out.println("The sum of the elements in the array is: " + sum);
        System.out.println("The product of the elements in the array is: " + product);
    }
}
