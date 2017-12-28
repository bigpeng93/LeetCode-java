package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
    public List<List<Integer>> solution(int[] nums,int target){
        ArrayList<List<Integer>> res = new ArrayList<List<Integer>>();
        int len = nums.length-1;
        if(nums == null || len <3)
            return res;
        Arrays.sort(nums);
        int max = nums[len];
        if(4*max < target || 4 * nums[0] > target)
            return res;
        int i,z;
        for (i = 0; i<=len;i++){
            z = nums[i];
            if(i>0 && z == nums[i-1])
                continue;
            if(z + 3*max < target)
                continue;
            if(4*z > target)
                break;
            if(4*z == target){
                if(i+3 <= len && nums[i+3] == z)
                    res.add(Arrays.asList(z,z,z,z));
                break;
            }
            threeSumForFourSum(nums,target-z,i+1,len,res,z);
        }
        return res;
    }
    private void threeSumForFourSum(int[] nums,int target,int low,int hight,ArrayList<List<Integer>> fourSumList,int z1){
        if(low + 2 > hight)
            return;
        int max = nums[hight];
        if(3*max < target || 3* nums[low] > target)
            return;
        int i,z;
        for (i = low;i<=hight-1;i++){        //i<hight-1:保证至少有三个数
            z = nums[i];
            if(i > low && z == nums[i-1])
                continue;
            if(z + 2 * max < target)
                continue;
            if (3 * z > target)
                break;
            if(3*z == target){
                if(i+2<=hight && nums[i+2] == z)
                  fourSumList.add(Arrays.asList(z1,z,z,z));
                break;
            }
            twoSumForFourSum(nums,target-z,i+1,hight,fourSumList,z1,z);
        }
    }
    private void twoSumForFourSum(int[] nums,int target,int low,int hight,ArrayList<List<Integer>> fourSumList,int z1,int z2){
        if (low > hight)
            return;
        if(2 * nums[low] > target || 2*nums[hight] < target)
            return;
        int i = low;
        int j = hight;
        int sum , x;
        while (i<j){
            sum = nums[i]+nums[j];
            if(sum == target){
                fourSumList.add(Arrays.asList(z1,z2,nums[i],nums[j]));
                x = nums[i];
                while (++i<j && nums[i]==x);
                x = nums[j];
                while (i<--j && nums[j]==x);
            }
            if(sum < target)
                i++;
            if (sum > target)
                j--;
        }
        return;
    }
}
