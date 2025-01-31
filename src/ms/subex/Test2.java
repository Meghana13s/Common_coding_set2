package ms.subex;

public class Test2 {

    public static int findLen(String s) {
        int maxLen = Integer.MIN_VALUE;
        if(checkPalindrome(s) ) {
            int left = 0; int right = s.length()-1;
            maxLen = Math.max(maxLen,right - left +1);
        }
        return maxLen;
    }

    public static boolean checkPalindrome(String s) {
        int left =0; int right =s.length()-1;
        while (left < right) {
            if(s.charAt(left) != s.charAt(right)) {
                continue;
            }
            left++;
            right--;
        }
        System.out.println(left); // GHABCDEFEDCBAFA
        System.out.println(right);
        return true;
    }
    public static void main(String[] args) {
        String s = "GHABCDEFEDCBAFA";
//        boolean ans = checkPalindrome(s);
//        System.out.println(ans);
        int res = findLen(s);
        System.out.println(res);





    }
}
