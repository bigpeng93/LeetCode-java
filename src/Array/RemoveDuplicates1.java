package Array;

public class RemoveDuplicates1 {
    public int solution(int[] nums){
        int length = nums.length;
        if(length<=0)
            return 0;
        int index = 0;
        for (int i =0 ;i<length;i++){
            if(nums[index]!= nums[i])
                nums[++index] = nums[i];
        }
        return index+1;
    }
}
