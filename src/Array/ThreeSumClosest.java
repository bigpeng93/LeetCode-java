package Array;

import java.util.Arrays;

public class ThreeSumClosest {
    public int solution(int[] nums, int target) {
        int len = nums.length-1;
        int result = nums[0] + nums[1] + nums[len];
        Arrays.sort(nums);

        for (int i = 0; i<len-1;i++){
            int start = i+1;
            int end = len;
            while(start< end){
                int sum = nums[i] + nums[start] + nums[end];
                if (sum>target)
                    end --;
                else start++;
                if(Math.abs(sum - target) < Math.abs(result-target))
                    result = sum;
            }
        }
        return result;
    }
}
