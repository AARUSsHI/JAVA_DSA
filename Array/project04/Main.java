package Array.project04;

import java.util.Scanner;

public class Main {
    public int findMinimum(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Invalid Input");
        }
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Main obj = new Main();
        System.out.println("Enter the length of the array: ");
        int len = input.nextInt();
        int[] arr = new int[len];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < len; i++) {
            arr[i] = input.nextInt();
        }
        int minimum = obj.findMinimum(arr);
        System.out.println("The minimum value in the array is: " + minimum);

        input.close();
    }
}
