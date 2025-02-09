package SortingAlgoritm.Project01;

public class BubbleSort {
    public void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void sort(int[] arr) {
        int n = arr.length;
        boolean isSwapped;
        for (int i = 0; i < n - 1; i++) {
            isSwapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isSwapped = true;
                }
            }
            if (!isSwapped) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{5, 1, 2, 9, 10};
        BubbleSort bs = new BubbleSort();
        System.out.println("Original Array:- ");
        bs.printArr(arr);
        bs.sort(arr);
        System.out.println("Sorted Array:- ");
        bs.printArr(arr);
    }
}
