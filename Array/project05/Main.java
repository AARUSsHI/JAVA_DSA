package Array.project05;

public class Main {
    public int findSecondMax(int[] arr){
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            if(max < arr[i]){
                secondMax =  max;
                max = arr[i];
            }
            else if(secondMax < arr[i] & max != arr[i]){
                secondMax = arr[i];
            }
        }
        return secondMax;
    }
    public static void main(String[] args) {
        Main obj = new Main();
        int[] arr = {12,34,2,34,33,1};
        int secondMax = obj.findSecondMax(arr);
        System.out.println("Second max element of the array is: " + secondMax);
    }
}
