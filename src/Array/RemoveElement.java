package Array;

public class RemoveElement {
    public int solution(int[] sums,int val){
        int index = 0;
        int len = sums.length-1;
        for (int i = 0; i<=len;i++){
            if (sums[i] != val)
                sums[index++] = sums[i];
        }
        return index;
    }
}
