package Array.project03;

import java.util.Scanner;

public class Main {
    public static void reverseArray(int[] numbers, int start, int end) {
        while (start < end) {
            int temp = numbers[start];
            numbers[start] = numbers[end];
            numbers[end] = temp;
            start++;
            end--;
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the array you want to create: ");
        int len = input.nextInt();
        int[] arr = new int[len];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < len; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println("Orignal Array: ");
        printArray(arr);

        System.out.println("Reversed Array");
        reverseArray(arr, 0, arr.length - 1);
        printArray(arr);

        input.close();
    }
}
