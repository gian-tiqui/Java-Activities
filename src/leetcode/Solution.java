package leetcode;

import java.util.HashMap;
import java.util.Set;

public class Solution {

    public int removeElement(int[] nums, int val) {
        int i = 0;
        int j = 0;

        while (i < nums.length) {
            if (nums[i] != val) {
                nums[j] = nums[i];
                j++;
            }
            i++;
        }

        return j;
    }

    public int strStr(String haystack, String needle) {

        if (needle.length() == 1) {
            for (int i = 0; i < haystack.length(); i++) {
                if (haystack.charAt(i) == needle.charAt(0)) {
                    return i;
                }
            }
        } else if (haystack.equals(needle)) {
            return 0;
        } else if (haystack.length() >= needle.length()) {
            for (int i = 0; i <= haystack.length() - needle.length(); i++) {
                String subString = haystack.substring(i, i + needle.length());
                if (subString.equals(needle)) {
                    return i;
                }
            }
        }

        return -1;

    }
}
