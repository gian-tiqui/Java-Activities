package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Solution {

    public static int removeElement(int[] nums, int val) {
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

    public static int strStr(String haystack, String needle) {

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

    public static boolean robotReturnOrigin(String moves) {
        if (moves.isEmpty())
            return true;

        Map<Character, Integer> map = new HashMap<>();

        for (char c : moves.toLowerCase().toCharArray()) {
            if (map.containsKey(c))
                map.put(c, map.get(c) + 1);
            else
                map.put(c, 1);
        }

        return map.get('u').equals(map.get('d')) && map.get('l').equals(map.get('r'));
    }

    public static ArrayList<String> getPermutation(String string) {

        ArrayList<String> permutation = new ArrayList<>();

        return new ArrayList<>();
    }
}
