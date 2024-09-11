package Array.project01;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public void printArray(int[] arr){
        int len = arr.length;
        System.out.println("Printing the array with the help of a loop: ");
        for(int i=0; i<len; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Main obj = new Main();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int length = input.nextInt();

        // declaration and initialization of array
        int[] myArr = new int[length];
        System.out.println("Enter the elements of the array: ");

        // Adding elements in the array
        for(int i=0; i<length; i++){
            myArr[i] = input.nextInt();
        }

        // Printing array
        System.out.println("Printing array:- " + Arrays.toString(myArr));

        // Accessing length of array
        int n = myArr.length;
        System.out.println("Length of array:- " + n);

        // Printing array with the help of loop
        obj.printArray(myArr);

        input.close();
    }
}
