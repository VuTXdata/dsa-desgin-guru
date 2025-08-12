package array;

public class LeftAndRightSumDiff {
    public int[] findDifferenceArray(int[] nums){
        int n = nums.length;
        int sum = 0;
        for(int i = 1; i < n; i++){
            sum += nums[i];
        }
        int diff[] = new int[n];
        diff[0] = sum;
        for(int i = 1; i< n; i++){
            sum = sum - nums[i];
            diff[i] = Math.abs(sum - nums[i-1]);
            nums[i] = nums[i-1] +nums[i];
        }
        return diff;
    }
}
