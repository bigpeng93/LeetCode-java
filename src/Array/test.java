package Array;

public class test {
    public static void main(String[] args) {
        //int sums[] = {1,3,1,1,1};
        int sums1[] = {};
        int sums2[] = {4,8,8,8,9,7,7,6,4,3};
        int sums3[] = {1,3,2};
        char board[][] = {
                {'.','.','.','.','.','.','.','.','.'},
                {'.','.','.','.','.','.','3','.','.'},
                {'.','.','.','1','8','.','.','.','.'},
                {'.','.','.','7','.','.','.','.','.'},
                {'.','.','.','.','1','.','9','7','.'},
                {'.','.','.','.','.','.','.','.','.'},
                {'.','.','.','3','6','.','1','.','.'},
                {'.','.','.','.','.','.','.','.','.'},
                {'.','.','.','.','.','.','.','2','.'}};
        int nums[] ={0,1,0,2,1,0,1,3,2,1,2,1};
        int nums1[][]={
                {5, 1, 9,11},
                {2, 4, 8,10},
                {13, 3, 6, 7},
                {15,14,12,16}};
        int num2[][] = {
                {0,0,0,5},
                {4,3,1,4},
                {0,1,1,4},
                {1,2,1,3},
                {0,0,1,1}
        };
        int rating[] = {1,2};
/*        RemoveDuplicates2 Rp= new RemoveDuplicates2();
        System.out.println(Rp.solution(sums));*/

//        SearchRotated SR = new SearchRotated();
//        SearchRotated2 SR = new SearchRotated2();
//        MedianOfTwoSorted MOT = new MedianOfTwoSorted();
//        LongestConsecutive LC = new LongestConsecutive();
//        ThreeSum TS= new ThreeSum();
//        ThreeSumClosest TSC = new ThreeSumClosest();
//        FourSum FS = new FourSum();
//        NextPermutation NP = new NextPermutation();
//        NP.solution(sums2);
//        PermutationSequence PS = new PermutationSequence();
//        ValidSudoku VS = new ValidSudoku();
//        RotateInamge RT = new RotateInamge();
//        SetMatrixZeros SMZ = new SetMatrixZeros();
//        SMZ.solution(num2);
        Candy candy = new Candy();
        System.out.println(candy.solution(rating));
//        System.out.println(TR.solution(nums1));

    }
}
