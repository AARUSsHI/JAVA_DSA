package Array.project06;

public class Main {
    public int findMax(int[] arr){
        int max = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Main obj =  new Main();
        int[] arr = {1,2,3,4,65,2,5,32};
        int maximum = obj.findMax(arr);
        System.out.println("The maximum element in the array is: " + maximum);
    }
}
