package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClimbingStairs70 {

    static List<Integer> number = new ArrayList<>();
    static List<Integer> result = new ArrayList<>();
    static {
        number.add(2);
        result.add(0,2);
        number.add(3);
        result.add(1,3);
    }

    public static void main(String[] args) throws Exception {
        for(int i= 0;i<number.size();i++){
            int stairs = climbStairs(number.get(i));
            if (stairs != result.get(i)) {
                throw new Exception("Expected " + result.get(i) + " got " + stairs);
            }
        }
    }
    public static int climbStairs(int n) {
        if (n <= 3) return n;

        int prev1 = 3;
        int prev2 = 2;
        int cur = 0;

        for (int i = 3; i < n; i++) {
            cur = prev1 + prev2;
            prev2 = prev1;
            prev1 = cur;
        }

        return cur;
    }
}
