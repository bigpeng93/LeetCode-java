package Array;

public class RemoveDuplicates2 {
    public int solution(int[] nums){
        int length = nums.length;
        if (length<=0)
            return 0;
        int index = 0;
        int n = 1;
        for (int i =1; i<length;i++){
            if (nums[index] == nums[i]) {
                if (n < 2) {
                    nums[++index] = nums[i];
                    n++;
                }
            }else{
                nums[++index] =nums[i];
                n = 1;
            }
        }
        return index+1;
    }
}
