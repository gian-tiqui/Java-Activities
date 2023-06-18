package problems;

public class Addition {

    public int getSum(String s) {
        int sum = 0;

        for (char c : s.toCharArray()) sum+=Integer.parseInt(String.valueOf(c));

        return sum;
    }

}
