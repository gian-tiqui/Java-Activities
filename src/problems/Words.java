package problems;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Words {

    public int getVowels(String string) {

        int count = 0;

        ArrayList<Character> vowels = new ArrayList<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));

        for (char c : string.toCharArray()) {
            if (vowels.contains(c))
                count++;
        }

        return count;
    }
}
