package Array;

public class NextPermutation {
    public void solution(int[] nums){
        int len = nums.length;
        int index = len -1;
        while(index > 0){
            if(nums[index-1] < nums[index])
                break;
            index--;
        }
        if(index ==0){
            reverseSort(nums,0,len-1);
            return;
        }else{
            int val = nums[index-1];
            int j = len-1;
            while(nums[j]<=val){
                j--;
            }
            swap(nums,j,index-1);
            reverseSort(nums,index,len-1);
            return;
        }

        /*
        *        index-1 index   j
        *           |     |     |
        * -------------------------------------------
        * |  5  |  6  |  8  |  7  |  4  |  3  |  2  |
        * -------------------------------------------
        *
        * */
    }
    private void reverseSort(int[] nums,int start,int end){
        if(start > end)
            return;
        for(int i =start;i<=(start+end)/2;i++){         //注意交换的界限
            swap(nums,i,start+end-i);
        }
    }
    private void swap(int[] nums,int m,int n){
        int temp = nums[m];
        nums[m] = nums[n];
        nums[n]=temp;
    }
}
