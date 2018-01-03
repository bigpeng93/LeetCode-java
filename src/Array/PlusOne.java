package Array;

public class PlusOne {
    public int[] solution(int[] digits) {
        int n = digits.length-1;
        for(int i = n;i>=0;i--){
            //如果某一位介于0~8之间，则第一位不会有进位，则直接加1，并返回
            if(digits[i] <9){
                digits[i] ++;
                return digits;
            }
            //某一位是9，直接将此位设置为0
            digits[i] =0;
        }
        //跳出循环说明最高位有进位，则将此数组扩充以为，并将最高位设置为1，其余位设置为0
        int[] number = new int[digits.length+1];
        number[0] = 1;
        return number;
    }
}
