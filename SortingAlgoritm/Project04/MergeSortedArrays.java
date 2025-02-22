package SortingAlgoritm.Project04;

public class MergeSortedArrays {
    public void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public int[] merge(int[] arr1,int[] arr2, int n, int m){
        int[] result = new int[n + m];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < n && j < m) {
            if (arr1[i] < arr2[j]) {
                result[k] = arr1[i];
                i++;
            } else {
                result[k] = arr2[j];
                j++;
            }
            k++;
        }
        while (i < n) {
            result[k] = arr1[i];
            i++;
            k++;
        }
        while (j < m) {
            result[k] = arr2[j];
            j++;
            k++;
        }
        return result;
    }

    public static void main(String[] args) {
        MergeSortedArrays msa = new MergeSortedArrays();
        int[] arr1 = {0,1,8,10};
        int[] arr2 = {2,4,11,15,20};
        System.out.println("Array1:- ");
        msa.printArray(arr1);
        System.out.println("Array2:- ");
        msa.printArray(arr2);
        System.out.println("Merged Sorted Array:- ");
        int[] result = msa.merge(arr1, arr2, arr1.length, arr2.length);
        msa.printArray(result);
    }
}
