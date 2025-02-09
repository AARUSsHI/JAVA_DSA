package SortingAlgoritm.Project02;

public class InsertionSort {
    public void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void sort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int temp = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{5, 1, 2, 9, 10};
        InsertionSort is = new InsertionSort();
        System.out.println("Original Array:- ");
        is.printArr(arr);
        is.sort(arr);
        System.out.println("Sorted Array:- ");
        is.printArr(arr);
    }
}
