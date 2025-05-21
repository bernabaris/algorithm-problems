package leetcode;

public class PalindromeNumber9 {
    public static void main(String[] args){
        PalindromeNumber9 solution = new PalindromeNumber9();
        System.out.println(solution.isPalindrome(121));     // true
        System.out.println(solution.isPalindrome(-121));    // false
        System.out.println(solution.isPalindrome(10));      // false

    }
    public boolean isPalindrome(int x){

        String str = String.valueOf(x);
        int length = str.length();

        for(int i = 0; i < length/2; i++){
            if(str.charAt(i) != str.charAt(length-i-1)) return false;
        }

        return true;

    }
}
