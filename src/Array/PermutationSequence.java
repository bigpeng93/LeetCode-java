package Array;

import java.util.LinkedList;
import java.util.List;

public class PermutationSequence {
    public String solution(int n, int k){
        List<Integer> num = new LinkedList<Integer>();
        for (int i =1; i<=n;i++) num.add(i);
        int[] fact = new int[n];
        fact[0]= 1;
        for (int i=1;i<n ;i++) fact[i] = i*fact[i-1];
        k--;        //将K转换为数组下标
        StringBuffer str = new StringBuffer();
        for (int i = n ; i>0;i--){
            int des = k/fact[i-1];      //获取数字的下标
            k = k% fact[i-1];
            str.append(num.get(des));
            num.remove(des);
        }
        return str.toString();
    }
}
