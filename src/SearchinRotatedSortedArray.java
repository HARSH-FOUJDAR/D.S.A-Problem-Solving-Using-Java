public class SearchinRotatedSortedArray {
    public static void main(String[] args){
        int[] nums = {4,5,6,7,0,1,2};
        int target = 0;
        int result = searching(nums, target);
        System.out.print(result);
    }

    public static int searching(int[] nums , int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            //Check the left part sorted or not
             if(nums[left] <  nums[mid]){
                 if(target >=nums[left]  &&  target  <= nums[mid]){
                     right =mid-1;
                 }
                 else {
                     left = mid+1;
                 }
             }
             else {
                 if(target <= nums[right]  && target > mid){
                     left = mid+1;
                 }
                 else {
                     right = mid-1;
                 }
             }
        }
        return -1;
    }
}
