package Array.project08;

public class Main {
    public int[] resize(int[] arr, int capacity) {
        int[] temp = new int[capacity];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        arr = temp;
        return arr;
    }

    public static void main(String[] args) {
        Main obj = new Main();
        int[] arr = { 5, 2, 1, 9, 10 };
        System.out.println("Orignal array size: " + arr.length);
        arr = obj.resize(arr, 10);
        System.out.println("Resized array is: " + arr.length);
    }
}
