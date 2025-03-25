package leetcode;

import java.util.Arrays;

public class FindMedianSortedArrays4 {
    public static void main(String[] args) {
        FindMedianSortedArrays4 solution = new FindMedianSortedArrays4();

        int[] nums1 = {1, 3};
        int[] nums2 = {2};
        System.out.println("Median: " + solution.findMedianSortedArrays(nums1, nums2));

        int[] nums3 = {1, 2};
        int[] nums4 = {3, 4};
        System.out.println("Median: " + solution.findMedianSortedArrays(nums3, nums4));
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[] result = new int[m + n];
        int j = 0;

        for (int i = 0; i < m; i++) {
            result[j++] = nums1[i];
        }
        for (int i = 0; i < n; i++) {
            result[j++] = nums2[i];
        }

        Arrays.sort(result);


        if (result.length % 2 == 0) {
            int mid = result.length / 2;
            return (result[mid - 1] + result[mid]) / 2.0;
        } else {
            return result[result.length / 2];
        }
    }
}
