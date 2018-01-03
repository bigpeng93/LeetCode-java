package Array;

public class ClimbingStairs {
    public int solution(int n){
        int a = 1,b = 1;
        while(n -- >0)
            a = (b += a) -a;
        return a;
    }
}
