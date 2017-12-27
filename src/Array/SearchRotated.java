package Array;

public class SearchRotated {
    public int soution(int[] nums, int target){
        int first = 0;
        //将last指向数组的最后一个元素的下一位，在求mid时防止出现死循环或遗漏
        int last = nums.length-1;
        while(first <= last){
            int mid = (first+last)/2;
            if (nums[mid]  == target)
                return mid;
            if(nums[first] <= nums[mid]){
                if (nums[first]<=target && target < nums[mid])
                    last = mid - 1;
                else
                    first = mid + 1;
            }else{
                if (nums[mid] < target && target <= nums[last-1])
                    first = mid + 1;
                else
                    last = mid - 1;
            }
        }
        return -1;
    }
}
