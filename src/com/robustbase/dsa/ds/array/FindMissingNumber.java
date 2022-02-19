package com.robustbase.dsa.ds.array;

import com.sun.source.tree.AssertTree;
import com.sun.tools.javac.util.Assert;

/**
 * @author Atul Dwivedi
 */
public class FindMissingNumber {

    /**
     * @param arr    of integers
     * @param length of the input array
     * @return the missing number
     * @see <a href="https://www.geeksforgeeks.org/find-the-missing-number/">Reference Solution</a>
     * <p>
     * Time Complexity: O(n)
     * Space Complexity:O(1)
     */
    public static int missingNumber(int[] arr, int length) {
        int total = 1;

        for (int i = 2; i <= (length + 1); i++) {
            total = total - arr[i - 2] + i;
        }

        return total;
    }

    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 5};
        int[] arr = {1, 2, 4, 6, 3, 7, 8};
        System.out.println(missingNumber(arr, arr.length));
        Assert.check(missingNumber(arr, arr.length) == 5);
    }
}
