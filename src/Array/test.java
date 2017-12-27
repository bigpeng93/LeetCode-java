package Array;

public class test {
    public static void main(String[] args) {
        //int sums[] = {1,3,1,1,1};
        int sums1[] = {};
        int sums2[] = {4,5,6,2,3,7,9,13,54};
/*        RemoveDuplicates2 Rp= new RemoveDuplicates2();
        System.out.println(Rp.solution(sums));*/

        //SearchRotated SR = new SearchRotated();
        //SearchRotated2 SR = new SearchRotated2();
        //MedianOfTwoSorted MOT = new MedianOfTwoSorted();
        LongestConsecutive LC = new LongestConsecutive();
        System.out.println(LC.solution(sums2));

    }
}
