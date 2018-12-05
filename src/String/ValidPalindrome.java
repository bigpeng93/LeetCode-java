package String;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        if(s.length() == 0)
            return true;
        int head = 0,tail = s.length()-1;

        while(head < tail){
            char cHead = s.charAt(head),cTail = s.charAt(tail);
            if(!Character.isLetterOrDigit(cHead))
                head++;
            else if(!Character.isLetterOrDigit(cTail))
                tail--;
            else{
                if(Character.toLowerCase(cHead) != Character.toLowerCase(cTail))
                    return false;
                head++;
                tail--;
            }
        }
        return true;
    }
}
