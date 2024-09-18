package Array.project09;

public class Main {
    public int findMissingValue(int[] arr){
        int n = arr.length + 1;
        int sum = n * (n + 1) / 2;
        for(int i=0; i<arr.length; i++){
            sum -= arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        Main obj = new Main();
        int[] arr = {2,4,1,8,6,3,7};
        int missingValue = obj.findMissingValue(arr);
        System.out.println("Missing number is: " + missingValue);
    }
}
