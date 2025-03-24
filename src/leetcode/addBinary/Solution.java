package leetcode.addBinary;

public class Solution {
    public String addBinary(String a, String b) {
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        StringBuilder sb = new StringBuilder();
        while (i >= 0 || j >= 0 || carry != 0) {
            int sum = carry;
            if (i >= 0) {
                sum += a.charAt(i--) - '0';
            }
            if (j >= 0) {
                sum += b.charAt(j--) - '0';
            }
            sb.append(sum % 2);
            carry = sum / 2;
        }
        return sb.reverse().toString();
    }

    public String convertBinary(int num) {
        StringBuilder sb = new StringBuilder();
       if (num == 0) {
           return "0";
       }
       while (num > 0) {
           sb.append(num % 2);
           num /= 2;
       }
       return sb.reverse().toString();
    }
}
