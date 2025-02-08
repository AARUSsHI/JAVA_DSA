package SearchingAlgorithm.Project03;

public class SearchInsert {
    public int searchInsert(int[] nums, int key){
        int low = 0;
        int high = nums.length - 1;
        while( low <= high){
            int mid = (low + high)/2;
            if(key == nums[mid]){
                return mid;
            }
            if(key < nums[mid]){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        SearchInsert si = new SearchInsert();
        int[] nums = {1,10,20,47,59,65,75,88,99};
        int index = si.searchInsert(nums, 66);
        System.out.println(index);
    }
}
